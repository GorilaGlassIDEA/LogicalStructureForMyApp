package org.example.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
public class ApiResponseDTO {
    private List<EventDTO> content;
    private PageableDTO pageable;
    private boolean last;
    private int totalElements;
    private int totalPages;
    private boolean first;
    private int size;
    private int number;
    private SortDTO sort;
    private int numberOfElements;
    private boolean empty;
}
