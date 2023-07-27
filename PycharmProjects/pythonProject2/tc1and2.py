import requests
import jsonpath
import json

url_1 = "https://petstore.swagger.io/v2"
f = open("data.json")
pet_data=json.load(f)


def post_pet(pet_data):
    post_pet_url = "/pet"
    response = requests.post(url=url_1+post_pet_url, json=pet_data)
    responseJson = response.json()
    assert response.status_code == 200
    return responseJson["id"]


def get_pet(pet_id):
    get_pet_url = f"/pet/{pet_id}"
    response = requests.get(url_1+get_pet_url)
    assert response.status_code == 200
    return response.json()



def delete_pet(pet_id):
     delete_pet_url = f"/pet/{pet_id}"
     response = requests.delete(url_1+delete_pet_url)
     assert response.status_code == 200
     return response.json()


def tc1():
    pet_id = post_pet(pet_data)
    print("Id twojego zwierza to", pet_id)

    pet_info = get_pet(pet_id)
    print("Informacje o twoim zwierzu:", pet_info)
    return pet_id



def tc2(pet_id):
    delete_pet(pet_id)
    pet_info = get_pet(pet_id)
    print("Informacje o twoim zwierzu:", pet_info)
    return pet_id


pet_id = tc1()
tc2(pet_id)
