package org.example.service;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.example.adapter.CastJsonFile;
import org.example.models.EventsResponseDTO;

import javax.security.auth.callback.Callback;
import java.io.IOException;

public class HttpService {


    public static EventsResponseDTO makeGet(String url) {
        OkHttpClient client = new OkHttpClient();
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

}
