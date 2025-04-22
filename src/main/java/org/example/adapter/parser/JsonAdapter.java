package org.example.adapter.parser;

import org.example.models.FeedbackEventDTO;
import org.example.models.dtos.ApiResponseDTO;
import org.example.models.dtos.EventDTO;

import java.io.IOException;

public class JsonAdapter {
    private final JsonParser parser;

    // Внедрение зависимости через конструктор (DIP)
    public JsonAdapter(JsonParser parser) {
        this.parser = parser;
    }

    public EventDTO parseEvent(String json) throws IOException {
        return parser.fromJson(json, EventDTO.class);
    }

    public String serializeFeedback(FeedbackEventDTO feedback) throws IOException {
        return parser.toJson(feedback);
    }
}