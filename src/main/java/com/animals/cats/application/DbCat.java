package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class DbCat {
    private final Long id;
    private final String name;
    private final LocalDateTime birthDate;
    private final Integer height;
    private final Integer weight;
    private final String eyeColor;
    private final String furColor;
    private final Race race;
    private final String character;
}
