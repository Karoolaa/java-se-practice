package pl.globallogic.gorest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.globallogic.gorest.model.CreateUserRequestDTO;

import static io.restassured.RestAssured.*;

public class UserApiCrudBasicVerificationTest extends BaseApiTest {
    private static final String ENDPOINT = "/users";
    private static String token = "fb2f0a756abc1616c18cca91c2252aae29099998edb734e7d5dd0c30c94f653b";

    private String ourUserId;
    @BeforeMethod
    public void testSetUp(){
        String randomEmail = getRandomEmail();
        CreateUserRequestDTO userPayLoad = new CreateUserRequestDTO("Mik Mag", randomEmail, "male","active");
        Response resp = given().
                body(userPayLoad).
                header("Authorization", "Bearer " + token).
                contentType(ContentType.JSON).
        when().
                post(ENDPOINT).
        then().extract().response();
        ourUserId = resp.jsonPath().getString("id");
        logger.info("Created user id: {}", ourUserId);
    }

    @Test
    public void shouldFetchAllUsersFromDefaultPage() {
        given().
                log().all().
        when().
                get(ENDPOINT).
        then().
                log().all();
    }

    @Test
    public void userDataShouldContainId() {
        String userId = ourUserId;
        given().
                pathParam("userId", userId).
                header("Authorization", "Bearer " + token).
        when().
                get(ENDPOINT + "/{userId}").
        then().
                log().all();
    }

    @Test
    public void shouldCreateUserAndReturnId(){
        String randomEmail = getRandomEmail();
        CreateUserRequestDTO userPayLoad = new CreateUserRequestDTO("Mik Mag", randomEmail, "male","active");
        given().
                body(userPayLoad).
                header("Authorization", "Bearer " + token).
                contentType(ContentType.JSON).
        when().
                post(ENDPOINT).
        then().
                log().all();
    }

    private static String getRandomEmail() {
        String email = "mik.mag" + (int) (Math.random() * 2000) + "@tat.com";
        logger.info("Generated email: {}", email);
        return email;
    }

    @Test
    public void shouldUpdateExistingUserWithNewData(){
        String randomEmail = getRandomEmail();
        CreateUserRequestDTO userPayLoad = new CreateUserRequestDTO("Mik Mag", randomEmail, "male","inactive");
        given().
                pathParam("userId", ourUserId).
                body(userPayLoad).
                header("Authorization", "Bearer " + token).
                contentType(ContentType.JSON).
        when().
                put(ENDPOINT + "/{userId}").
        then().
                log().all();
    }

    @Test
    public void shouldDeleteUserUsingId(){
        Response resp = given().
                pathParam("userId", ourUserId).
                header("Authorization", "Bearer " + token).
                contentType(ContentType.JSON).
        when().
                delete(ENDPOINT + "/{userId}");
        int expectedStatusCode = 204;
        Assert.assertEquals(resp.statusCode(), expectedStatusCode);
    }
}

