package org.example.service;

import com.squareup.okhttp.Callback;
import org.example.models.EventsResponseDTO;

public interface HttpRequest {
    EventsResponseDTO makeGet(String url);

    void makePost(String url, String jsonString, Callback callback);
}
