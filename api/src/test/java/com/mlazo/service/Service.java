package com.mlazo.service;

import java.net.MalformedURLException;
import java.net.URL;

public class Service {
    private static URL HOSTNAME = null;

    protected URL getUrl() throws MalformedURLException {
        if(HOSTNAME == null) {
            HOSTNAME = new URL("https://jsonplaceholder.typicode.com/");
        }

        return HOSTNAME;
    }
}
