package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class EventsDTO {

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
    // TODO: невозможно кастовать Date из json => пока String
    private String date;
    private String referralLink;
    private String source;
    private String creatorId;
}