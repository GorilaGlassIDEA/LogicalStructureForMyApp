package org.example.auth;

import com.squareup.okhttp.*;


public class AuthService {

    public void makePostAuth(String url, Callback callback) {

        OkHttpClient client = new OkHttpClient();

        RequestBody requestBody = new FormEncodingBuilder()
                .add("client_id", "service-client")
                .add("client_secret", "qYz5m2pnIQAW1dWjqzPsRirfD3rdYGh3")
                .add("grant_type", "password")
                .add("username", "defUser")
                .add("password", "defPswd")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        client.newCall(request).enqueue(callback);


    }


}
