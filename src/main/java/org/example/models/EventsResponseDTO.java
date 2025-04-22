package org.example.models;

import lombok.Data;
import org.example.models.dtos.EventDTO;

import java.util.List;
@Data
public class EventsResponseDTO {
    List<EventDTO> content;
}
