package org.example.models.shortlist;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ShortlistDTO {
    private List<EventShortlistDTO> shortlist;
}
