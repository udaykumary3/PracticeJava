package org.javaPractice.restAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LibraryApi {

    @Test
    public void lib(){
        RestAssured.baseURI = "http://216.10.245.166";

        String res = given().log().all().header("Content-Type","application/json")
                .body("{\n" +
                        "\n" +
                        "\"name\":\"Learn Appium Automation with Java\",\n" +
                        "\"isbn\":\"xyz\",\n" +
                        "\"aisle\":\"198\",\n" +
                        "\"author\":\"John foe\"\n" +
                        "}\n").when().post("Library/Addbook.php")
                .then().assertThat().statusCode(200).extract().response().toString();

        JsonPath js = new JsonPath(res);
        String id = js.getString("ID");
        System.out.println("value of response : "+id);

        given().log().all().when().get("Library/GetBook.php?AuthorName=John foe")
                .then().log().all().assertThat().statusCode(200);
    }
}
