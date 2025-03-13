package org.example.adapter;

import com.google.gson.Gson;
import org.example.models.EventsResponseDTO;
import org.example.models.FeedbackEventDTO;
// TODO: Переписать данный класс по SOLID

public class CastJsonFile {
    public static EventsResponseDTO readJson(String jsonText) {
        Gson gson = new Gson();
        return gson.fromJson(jsonText, EventsResponseDTO.class);
    }

    public static String writeJsonFeedback(FeedbackEventDTO feedbackEventDTO) {
        Gson gson = new Gson();
        return gson.toJson(feedbackEventDTO);
    }
}