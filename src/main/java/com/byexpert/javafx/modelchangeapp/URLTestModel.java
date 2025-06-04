package com.byexpert.javafx.modelchangeapp;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class URLTestModel {

    private final Notifications notifications = new Notifications();

    private Optional<URLTestObject> urlTestObject = Optional.empty();

    public Optional<URLTestObject> getUrlTestObject() {
        return urlTestObject;
    }

    public Optional<URLTestObject> testURL(String url) {
        try {
            long startTimeMillis = System.currentTimeMillis();
            HttpURLConnection urlConnection = (HttpURLConnection) new URL(url).openConnection();
            try (
                    InputStream is = urlConnection.getInputStream();
            ) {
                while (is.read() != -1) {
                }
            }
            long endTimeMillis = System.currentTimeMillis();

            URLTestObject uto = new URLTestObject(
                    urlConnection.getResponseCode(),
                    (int) (endTimeMillis - startTimeMillis)
            );

            urlTestObject = Optional.of(uto);
        } catch(Exception exc) {
            URLTestObject uto = new URLTestObject(exc.getMessage());
            urlTestObject = Optional.of(uto);
        }
        notifications.publish(Notifications.EVENT_MODEL_UPDATE);

        return urlTestObject;
    }
}
