package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeedbackEventDTO {
    String eventId;
    boolean like;
    int viewedSeconds;
    boolean moreOpened;
    boolean reported;
    String userId;
}
