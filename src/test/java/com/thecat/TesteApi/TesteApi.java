package com.thecat.TesteApi;

import org.junit.Test;

import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;


public class TesteApi {

    @Test
    public void cadastro() {
        String url = "https://api.thecatapi.com/v1/user/passwordlesssignup";

        UserRegistration userRegistration = new UserRegistration("kafehin283@jontra.com", "teste de api");

        Response response = given().contentType("application/json").body(userRegistration).when().post(url);

        response.then().statusCode(200).body("message", containsString("SUCCESS"));

        System.out.println("RETORNO =>" + response.body().asString());
    }

    @Test
    public void votacao() {
        String url = "https://api.thecatapi.com/v1/votes/";

        VoteRequest voteRequest = new VoteRequest("Vkc_4BECE", "true", "demo-f1db19");

        Response response = given().contentType("application/json")
                .header("x-api-key","live_EP7T97hjsYofzyvqSL6KBZi45hg06ED6n9Rf7BDZBLjiTqABnAaWYljqNyoymBS6")
                .body(voteRequest).when().post(url);

        response.then().statusCode(201).body("message", containsString("SUCCESS"));

        System.out.println("RETORNO =>" + response.body().asString());
    }

}
