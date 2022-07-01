import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class RestAPITest {

    @Test
    public void test1() {

        // Specify base URI
        Response response = RestAssured.get("https://reqres.in/api/users?page=2");

        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
    }
}
