package org.example.models;

import lombok.Data;

@Data
public class Page {
    private int size;
    private int number;
    private int totalElements;
    private int totalPages;
}
