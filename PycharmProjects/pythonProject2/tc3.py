import requests
import jsonpath
import json

url_1 = "https://petstore.swagger.io/v2"
f = open("zamowienie.json")
order_data=json.load(f)


def post_order(order_data):
    post_order_url = "/store/order"
    response = requests.post(url=url_1+post_order_url, json=order_data)
    responseJson = response.json()
    assert response.status_code == 200
    return responseJson["id"]

def get_order(order_id):
    get_order_url = f"/store/order/{order_id}"
    response = requests.get(url_1+get_order_url)
    assert response.status_code == 200
    return response.json()


def tc3():
    order_id = post_order(order_data)
    print("Id twojego zamowienia to", order_id)

    order_info = get_order(order_id)
    print("Informacje o twoim zamowieniu:", order_info)
    return order_id

tc3()
