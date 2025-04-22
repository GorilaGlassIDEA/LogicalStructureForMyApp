package org.example.auth;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.example.adapter.parser.JacksonParser;
import org.example.adapter.parser.JsonParser;
import org.example.auth.event.EventService;

import java.io.IOException;

public class MainAuth {
    static JsonParser jsonParser = new JacksonParser();
    static PostTokenDTO postTokenDTO;


    public static void main(String[] args) {
        AuthService authService = new AuthService();
        authService.makePostAuth("https://auth.dada-tuda.ru/realms/master/protocol/openid-connect/token", new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                System.err.println("Не получилось!");
            }

            @Override
            public void onResponse(Response response) throws IOException {
                postTokenDTO = jsonParser.fromJson(response.body().string(), PostTokenDTO.class);
                EventService eventService = new EventService();
                eventService.makeGet("https://api.dada-tuda.ru/api/v3/events/for?page_size=1&categories=", postTokenDTO, new Callback() {
                    @Override
                    public void onFailure(Request request, IOException e) {
                        System.err.println("Новый ивент не удалось получить");
                    }

                    @Override
                    public void onResponse(Response response) throws IOException {
                        System.out.println(response.body().string());
                    }
                });
            }
        });


    }

}
