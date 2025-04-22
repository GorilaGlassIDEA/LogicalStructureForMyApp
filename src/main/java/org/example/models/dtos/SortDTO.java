package org.example.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SortDTO {
    private boolean empty;
    private boolean unsorted;
    private boolean sorted;
}
