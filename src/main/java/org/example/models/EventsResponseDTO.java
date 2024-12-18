package org.example.models;

import lombok.Data;

import java.util.List;
@Data
public class EventsResponseDTO {
    List<EventsDTO> content;
    Page page;
}
