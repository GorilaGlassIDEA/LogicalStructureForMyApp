package org.example.service;

import com.squareup.okhttp.*;
import okio.BufferedSink;
import org.example.adapter.CastJsonFile;
import org.example.models.EventsResponseDTO;
import org.example.models.UserDTO;
import org.example.models.dtos.ApiResponseDTO;
import org.example.models.shortlist.EventShortlistDTO;

import java.io.IOException;

public class HttpService implements HttpRequest {


    @Override
    public void makeGet(String url, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request).enqueue(callback);
    }


    @Override
    public void makePost(String url, String jsonString, Callback callback) {

        MediaType JSON = MediaType.parse("application/json; charset=utf-8"); // Тип контента
        RequestBody body = RequestBody.create(JSON, jsonString);
        Request request = new Request.Builder()
                .url(url)
                .post(body) //  Указываем метод POST и тело запроса
                .addHeader("Content-Type", "application/json") // Явно указываем заголовок
                .build();

        OkHttpClient client = new OkHttpClient();
        client.newCall(request).enqueue(callback);
    }


}
