package org.example.service;

import com.squareup.okhttp.Callback;
import org.example.models.EventsResponseDTO;
import org.example.models.UserDTO;
import org.example.models.dtos.ApiResponseDTO;
import org.example.models.shortlist.EventShortlistDTO;

public interface HttpRequest {

    void makeGet(String url, Callback callback);


    void makePost(String url, String jsonString, Callback callback);
}
