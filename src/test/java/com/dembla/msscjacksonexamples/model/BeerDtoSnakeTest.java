package com.dembla.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
@ActiveProfiles("snake")
public class BeerDtoSnakeTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper ;

    @Test
    void getBeerDto() throws JsonProcessingException {
        BeerDto dto = getDto() ;

        String jsonString = objectMapper.writeValueAsString(dto) ;

        System.out.println("Here is SnaKe Case : " + jsonString) ;
    }

    @Test
    void deserialize() throws JsonProcessingException {
        String json = "{\"uuid\":\"2e5ffe8c-55b0-4536-9e2e-401ab4841a0d\",\"beer-name\":\"BeerName\",\"beer-style\":\"PALE_ALE\",\"upc\":34237487,\"price\":12.99,\"create-date\":\"2020-05-15T01:44:51.0645429+05:30\",\"last-updated-date\":\"2020-05-15T01:44:51.0645429+05:30\"}" ;
        BeerDto dto = objectMapper.readValue(json,BeerDto.class) ;
        System.out.println("Here is Beer Dto Object : " + dto) ;

    }


}
