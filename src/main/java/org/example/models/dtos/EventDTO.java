package org.example.models.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
public class EventDTO {
    private String city;
    private String address;
    private String locationName;
    private String id;
    private List<String> tags;
    private List<String> categories;
    private String shortDescription;
    private List<String> imageURL;
    private String price;
    private String priceType;
    private String name;
    private String type;
    private String description;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime date;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime dateEnd;

    private String referralLink;
    private String source;
    private String creatorId;
    private int views;
    private int likes;
    private boolean isFavorite;
}