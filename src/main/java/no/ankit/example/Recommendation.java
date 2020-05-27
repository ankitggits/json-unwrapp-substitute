package no.ankit.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Recommendation {

    @Setter
    private String key;

    @JsonProperty("type")
    @JsonSerialize(converter = RecommendationTypeToTypeConverter.class)
    @JsonDeserialize(converter = TypeToRecommendationTypeConverter.class)
    private RecommendationType recommendationType;

    @JsonCreator
    public Recommendation(
            @JsonProperty("key") String key,
            @JsonProperty("type") RecommendationType recommendationType) {
        this.key = key;
        this.recommendationType = recommendationType;
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "key='" + key + '\'' +
                ", recommendationType=" + recommendationType +
                '}';
    }
}