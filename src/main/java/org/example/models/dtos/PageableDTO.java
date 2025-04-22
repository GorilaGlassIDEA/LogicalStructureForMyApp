package org.example.models.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageableDTO {
    private int pageNumber;
    private int pageSize;
    private SortDTO sort;
    private int offset;
    private boolean paged;
    private boolean unpaged;
}
