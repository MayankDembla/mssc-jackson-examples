package com.dembla.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {

    BeerDto getDto() {

        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("PALE_ALE")
                .uuid(UUID.randomUUID())
                .createDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("12.99"))
                .upc(34237487L)
                .build();
    }


}
