package no.ankit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RecommendationType {

    private final String type;

    @JsonCreator
    public RecommendationType(@JsonProperty("type") String type) {
        this.type = type;
    }

    public static RecommendationType fmi() {
        return new RecommendationType("fmi");
    }

    @Override
    public String toString() {
        return "RecommendationType{" +
                "type='" + type + '\'' +
                '}';
    }
}