package com.dembla.msscjacksonexamples.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @JsonProperty("beerId")
    @Null
    private UUID uuid ;

    @NotBlank
    private  String beerName ;

    @NotBlank
    private String beerStyle ;

    @Positive
    private Long upc ;

    private BigDecimal price;

    private OffsetDateTime createDate ;
    private OffsetDateTime lastUpdatedDate ;


}
