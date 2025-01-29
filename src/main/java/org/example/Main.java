package org.example;

import org.example.service.HttpService;

public class Main {

    public static void main(String[] args) {

        System.out.println(HttpService.makeGet(
                "http://90.156.170.125:8080/event-service/api/v2/events/for/1?page_size=5"
        ).getContent().get(0).getId());
        //KG211497
    }
}
