package org.example.service;

import com.squareup.okhttp.*;
import okio.BufferedSink;
import org.example.adapter.CastJsonFile;
import org.example.models.EventsResponseDTO;

import java.io.IOException;

public class HttpService implements HttpRequest {

    private OkHttpClient client = new OkHttpClient();

    public EventsResponseDTO makeGet(String url) {
        Request request = new Request.Builder()
                .url(url)
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response.code());
            if (response.isSuccessful()) {
                String jsonAnswer = response.body().string();
                return CastJsonFile.readJson(jsonAnswer);
            } else {
                System.err.println("Не удалось получить ответ по запросу GET " + response.code());
                return null;
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return null;
    }

    @Override
    public void makePost(String url,  String jsonString, Callback callback) {

        MediaType JSON = MediaType.parse("application/json; charset=utf-8"); // Тип контента
        RequestBody body = RequestBody.create(JSON, jsonString);
        Request request = new Request.Builder()
                .url(url)
                .post(body) //  Указываем метод POST и тело запроса
                .build();

        OkHttpClient client = new OkHttpClient();
        client.newCall(request).enqueue(callback);
    }


}
