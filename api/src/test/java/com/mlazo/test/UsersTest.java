package com.mlazo.test;

import com.mlazo.service.Users;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class UsersTest {
    @Test
    public void usernameExists() throws MalformedURLException {
        Users users = new Users();
        Response response = users.getUsers();
        response.then().statusCode(200)
                .body("username", not(isEmptyOrNullString()));
    }
}
