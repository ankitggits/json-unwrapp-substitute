package no.ankit.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ExampleMain {
    public static void main(String[] args) throws IOException {
        ObjectMapper om = new ObjectMapper();
        RecommendationType fmi = RecommendationType.fmi();

        Recommendation recommendation = new Recommendation("dummy", fmi);

        System.out.println("-- before serialization --");
        System.out.println(recommendation);

        System.out.println("-- after serialization --");
        String jsonString = om.writeValueAsString(recommendation);
        System.out.println(jsonString);

        System.out.println("-- after deserialization --");
        Recommendation recommendation2 = om.readValue(jsonString, Recommendation.class);
        System.out.println(recommendation2);
    }
}