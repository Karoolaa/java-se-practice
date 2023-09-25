package pl.globallogic.gorest;

import io.restassured.RestAssured;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;

public class BaseApiTest {
    protected static Logger logger = LoggerFactory.getLogger(BaseApiTest.class);
    private static final String BASE_URI = "https://gorest.co.in";
    private static final String BASE_PATH = "/public/v2";

    @BeforeClass(alwaysRun = true)
    public void globalSetUp(){
        RestAssured.baseURI = BASE_URI;
        RestAssured.basePath = BASE_PATH;
    }
}
