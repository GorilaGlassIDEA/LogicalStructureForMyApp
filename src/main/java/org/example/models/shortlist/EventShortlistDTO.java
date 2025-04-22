package org.example.models.shortlist;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class EventShortlistDTO {
    private boolean starred;
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
    private String description;
    private String date;
    //Заменить на Date класс
    private String referralLink;
    private String source;
    private String creatorId;
}
