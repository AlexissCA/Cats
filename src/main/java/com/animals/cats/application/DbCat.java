package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class DbCat {
    private final Long id;
    private final String name;
    private final LocalDate birthDate;
    private final Integer height;
    private final Double weight;
    private final String eyeColor;
    private final String furColor;
    private final String personality;
    private final Boolean polite;
    private final DbRace dbRace;
}
