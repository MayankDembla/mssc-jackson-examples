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
        String json = "{\"beerId\":\"666b867c-8bf3-48c4-9c42-998aeae6e0a7\",\"beer_name\":\"BeerName\",\"beer_style\":\"PALE_ALE\",\"upc\":34237487,\"price\":12.99,\"create_date\":\"2020-05-15T01:52:23.5512643+05:30\",\"last_updated_date\":\"2020-05-15T01:52:23.5512643+05:30\"}" ;
        BeerDto dto = objectMapper.readValue(json,BeerDto.class) ;
        System.out.println("Here is Beer Dto Object : " + dto) ;

    }


}
