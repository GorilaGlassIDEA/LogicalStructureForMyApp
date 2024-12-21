package org.example;

import org.example.service.HttpService;

public class Main {

    public static void main(String[] args) {

        System.out.println(HttpService.makeGet(
                "http://90.156.170.125:8082/api/v1/events?" +
                        "page_number=1&" +
                        "page_size=1"
        ).getContent().get(0).getId());
        //KG211497
    }
}
