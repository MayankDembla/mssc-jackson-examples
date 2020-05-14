package com.dembla.msscjacksonexamples.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID uuid ;

    private  String beerName ;

    private String beerStyle ;

    private Long upc ;

    private BigDecimal price;

    private OffsetDateTime createDate ;
    private OffsetDateTime lastUpdatedDate ;


}
