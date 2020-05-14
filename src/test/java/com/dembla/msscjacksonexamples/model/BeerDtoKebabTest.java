package com.dembla.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@JsonTest
@ActiveProfiles("kebab")
public class BeerDtoKebabTest extends BaseTest {

    @Autowired
    ObjectMapper objectMapper ;

    @Test
    void getBeerDto() throws JsonProcessingException {
        BeerDto dto = getDto() ;

        String jsonString = objectMapper.writeValueAsString(dto) ;

        System.out.println("Here is Kebab Case : " + jsonString) ;
    }

    @Test
    void deserialize() throws JsonProcessingException {
        String json = "{\"uuid\":\"94ddc1fa-113b-481c-a744-04225214aba7\",\"beer-name\":\"BeerName\",\"beer-style\":\"PALE_ALE\",\"upc\":34237487,\"price\":12.99,\"create-date\":\"2020-05-15T01:53:18.732642+05:30\",\"last-updated-date\":\"2020-05-15T01:53:18.732642+05:30\"}";
        BeerDto dto = objectMapper.readValue(json,BeerDto.class) ;
        System.out.println("Here is Beer Dto Object : " + dto) ;

    }


}
