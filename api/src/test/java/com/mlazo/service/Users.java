package com.mlazo.service;

import io.restassured.response.Response;

import java.net.MalformedURLException;
import java.net.URL;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Users extends Service {
    public Response getUsers() throws MalformedURLException {
        return get(getUrl());
    }

    protected URL getUrl() throws MalformedURLException {
        return new URL(super.getUrl(), "/users");
    }
}
