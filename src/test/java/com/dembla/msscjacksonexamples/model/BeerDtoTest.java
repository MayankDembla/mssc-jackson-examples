package com.dembla.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest{

    @Autowired
    ObjectMapper objectMapper ;

    @Test
    void testSerializeDto(){

      BeerDto beerdto = getDto() ;
        try {
            String jsonString = objectMapper.writeValueAsString(beerdto) ;
            System.out.println("Here is our String from DTO : " + jsonString) ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    void deserailze(){
        String json ="{\"uuid\":\"f708134b-f904-4f85-824e-391bc3f2a869\",\"beerName\":\"BeerName\",\"beerStyle\":\"PALE_ALE\",\"upc\":34237487,\"price\":12.99,\"createDate\":\"2020-05-15T01:10:30.0202386+05:30\",\"lastUpdatedDate\":\"2020-05-15T01:10:30.0202386+05:30\"}" ;

        try {
            BeerDto dto  =  objectMapper.readValue(json, BeerDto.class) ;
            System.out.println("Here is a Deserialze Object " + dto.toString()) ;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}