package com.shop.spacex;

import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GetAPITest {

    @Test(description = "Test Get API and Validate Content")
    public void testGetAPIAndValidateContent() throws Exception {
    	
        RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://swapi.dev/api/people/")
                .then()
                .assertThat()
                .body("results[2].name", equalTo("R2-D2"))
                .and()
                .body("results[2].skin_color", equalTo("white, blue"));
    }

}
