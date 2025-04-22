package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FeedbackEventDTO {
    private String eventId;
    private boolean like;
    private int viewedSeconds;
    private boolean moreOpened;
    private boolean reported;
    private String userId;
}
