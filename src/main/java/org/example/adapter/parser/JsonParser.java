package org.example.adapter.parser;

import java.io.IOException;

public interface JsonParser {
    <T> T fromJson(String json, Class<T> clazz) throws IOException;
    String toJson(Object object) throws IOException;
}