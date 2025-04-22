package org.example.auth.event;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import org.example.auth.PostTokenDTO;

public class EventService {

    public void makeGet(String url, PostTokenDTO tokenDTO, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .header("Authorization", "Bearer " + tokenDTO.getAccessToken())
                .build();
        client.newCall(request).enqueue(callback);
    }

    public void makePost(String url, String jsonString, Callback callback) {

    }
}
