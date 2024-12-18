package org.example;

import org.example.service.HttpService;

public class Main {

    public static void main(String[] args) {

        System.out.println(HttpService.makeGet().getContent().get(0).getId());

    }
}
