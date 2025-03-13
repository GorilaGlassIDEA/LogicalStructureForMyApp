package org.example;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import org.example.adapter.CastJsonFile;
import org.example.models.FeedbackEventDTO;
import org.example.service.HttpService;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        HttpService httpService = new HttpService();
        String url = "http://90.156.170.125:8080/feedback-service/feedback/";
        FeedbackEventDTO feedbackEventDTO = new FeedbackEventDTO(
                "TP3226873",
                true,
                10,
                false,
                false,
                "1488"
        );
        httpService.makePost(url, CastJsonFile.writeJsonFeedback(feedbackEventDTO), new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                System.err.println("Fail " + request.body());
            }

            @Override
            public void onResponse(Response response) throws IOException {
                System.err.println("Successful " + response.code());
            }
        });
    }
}
