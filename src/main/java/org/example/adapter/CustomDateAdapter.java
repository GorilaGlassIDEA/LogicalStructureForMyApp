package org.example.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.example.models.EventsResponseDTO;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
// TODO: Переписать данный класс по SOLID

public class CustomDateAdapter {
    public static Gson gson;
    static {
        gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new TypeAdapter<Date>() {
                    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

                    @Override
                    public void write(JsonWriter out, Date value) throws IOException {
                        if (value == null) {
                            out.nullValue();
                            return;
                        }
                        out.value(dateFormat.format(value));
                    }

                    @Override
                    public Date read(JsonReader in) throws IOException {
                        try {
                            return dateFormat.parse(in.nextString());
                        } catch (ParseException e) {
                            return null;
                        }

                    }
                })
                .create();
    }

    public static EventsResponseDTO readJson(String jsonText) {
        return gson.fromJson(jsonText, EventsResponseDTO.class);
    }
}