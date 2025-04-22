package org.example;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import lombok.SneakyThrows;
import org.example.adapter.CastJsonFile;
import org.example.adapter.parser.JacksonParser;
import org.example.adapter.parser.JsonAdapter;
import org.example.models.dtos.ApiResponseDTO;
import org.example.models.dtos.EventDTO;
import org.example.service.HttpService;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {


        String url = "https://api.dada-tuda.ru/api/v1/events/random";

        HttpService httpService = new HttpService();
        JsonAdapter adapter = new JsonAdapter(new JacksonParser());

        String content = "{\"city\":\"SPB\",\"address\":\"ул.Воскова, д.6, (вход с угла, стеклянная дверь, звонок), 1 этаж.\",\"locationName\":\"ул.Воскова, д.6, (вход с угла, стеклянная дверь, звонок), 1 этаж.\",\"id\":\"TP3291904\",\"tags\":[\"Концерты\"],\"categories\":[\"Развлечения и досуг\"],\"shortDescription\":\"Artur - самобытный перкуссионный гитарист из г. Ялта\",\"imageURL\":[\"https://ucare.timepad.ru/64c2b12e-045d-400e-b4da-18a358bbef2a/-/preview/308x600/-/format/jpeg/poster_event_3291904.jpg\"],\"price\":\"800\",\"priceType\":\"TICKET\",\"name\":\"Сольный концерт Artur\",\"type\":null,\"description\":\"Музыкант-виртуоз известен своим мастерским сочетанием ярких гитарных техник: tapping & percussion, tremolo & rasgueado, gallop strumming & harmonics Играет как целая группа, а его гитара говорит вместо слов! В репертуаре: Испанские мотивы с элементами Фламенко Известные мировые рок-аранжировки Классические джазовые стандарты. Гитарные аранжировки основных классических произведений Paganini, BEETHOVEN Впустите лето в свое сердце с помощью зажигательных ритмов!\",\"date\":\"2025-04-10T20:00:00\",\"dateEnd\":null,\"referralLink\":\"https://art-gostinaya-na-voskova.timepad.ru/event/3291904/\",\"source\":\"TIMEPAD\",\"creatorId\":\"TP\",\"views\":0,\"likes\":0}";
        System.out.println(adapter.parseEvent(content));

        httpService.makeGet(url, new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @SneakyThrows
            @Override
            public void onResponse(Response response) {
                EventDTO eventDTO = adapter.parseEvent(response.body().string());
                System.out.println(eventDTO.getAddress());

            }
        });
//
////        HttpService httpService = new HttpService();
////        String url = "http://90.156.170.125:8080/feedback-service/feedback";
////        FeedbackEventDTO feedbackEventDTO = new FeedbackEventDTO(
////                "TP3226873",
////                false,
////                1,
////                true,
////                false,
////                "1488"
////        );
////        httpService.makePost(url, CastJsonFile.writeJsonFeedback(feedbackEventDTO), new Callback() {
////            @Override
////            public void onFailure(Request request, IOException e) {
////                System.err.println("Fail " + request.body());
////            }
////
////            @Override
////            public void onResponse(Response response) throws IOException {
////                if (response.isSuccessful()) {
////                    String responseBody = response.body().string();
////                    System.out.println(responseBody);
////                } else {
////                    System.out.println("response with code " + response.code());
////                }
////            }
////        });

    }
}
