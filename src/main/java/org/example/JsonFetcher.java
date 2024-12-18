package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonFetcher {

    public static void main(String[] args) {
        String urlString = "http://90.156.170.125:8081/api/v1/events";

        String jsonResponse = null;
        try {
            jsonResponse = fetchJson(urlString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("JSON Response as String:\n" + jsonResponse);
    }

    public static String fetchJson(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            connection.disconnect();
        }
    }
}