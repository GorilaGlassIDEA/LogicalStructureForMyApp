package org.example.service;

import org.example.adapter.CustomDateAdapter;
import org.example.models.EventsDTO;
import org.example.models.EventsResponseDTO;

public class HttpService {


    public static EventsResponseDTO makeGet() {
        String jsonAnswer = "{\n" +
                "  \"content\": [\n" +
                "    {\n" +
                "      \"city\": \"SPB\",\n" +
                "      \"address\": \"Невский просп., д. 60\",\n" +
                "      \"locationName\": \"кинотеатр «Аврора»\",\n" +
                "      \"id\": \"KG213778\",\n" +
                "      \"allImages\": [\n" +
                "        \"AQ==\"\n" +
                "      ],\n" +
                "      \"mainImage\": \"AQ==\",\n" +
                "      \"tags\": [\n" +
                "        \"6+\",\n" +
                "        \"мультфильмы\",\n" +
                "        \"новый год с детьми\",\n" +
                "        \"детские кинопоказы\",\n" +
                "        \"кинопоказы\",\n" +
                "        \"кино\",\n" +
                "        \"новогодние развлечения\",\n" +
                "        \"интересное\",\n" +
                "        \"зимние развлечения\"\n" +
                "      ],\n" +
                "      \"categories\": [\n" +
                "        \"cinema\"\n" +
                "      ],\n" +
                "      \"shortDescription\": \"В кинотеатре «Аврора» пройдёт долгожданная детская новогодняя ёлка с показами мультфильмов.\",\n" +
                "      \"imageURL\": [\n" +
                "        \"https://media.kudago.com/images/event/fd/3f/fd3fd86b59334389e8c3750f5c2c6445.jpg\"\n" +
                "      ],\n" +
                "      \"price\": \"1400 рублей\",\n" +
                "      \"priceType\": \"TICKET\",\n" +
                "      \"name\": \"новогодний праздник\",\n" +
                "      \"description\": \"«Аврора» вместе с анимационной студией «Мельница» проведёт сказочную новогоднюю ёлку для детей. \\nГостей ждут весёлые конкурсы и мастер-классы, танцы и хороводы, встреча с Дедом Морозом и Снегурочкой и, конечно, кинопоказы. На большом экране пройдёт предпремьерный показ мультфильма «Иван Царевич и Серый волк 6», который выйдет в широкий прокат только в конце декабря. После сеанса детей ждут подарки и сладкие призы.\\nПодробнее о программе праздника можно узнать на сайте кинотеатра «Аврора».\",\n" +
                "      \"type\": \"EVENT\",\n" +
                "      \"date\": \"2024-12-22T13:00:00\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"page\": {\n" +
                "    \"size\": 1,\n" +
                "    \"number\": 3,\n" +
                "    \"totalElements\": 1248,\n" +
                "    \"totalPages\": 1248\n" +
                "  }\n" +
                "}";
        return CustomDateAdapter.readJson(jsonAnswer);

    }

}
