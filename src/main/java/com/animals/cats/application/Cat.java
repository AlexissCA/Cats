package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Cat {
    private final Long id;
    private final String name;
    private final LocalDate birthDate;
    private final Integer height;
    private final Double weight;
    private final String eyeColor;
    private final String furColor;
    private final String character;
    private final Boolean polite;
    private final Race race;

    static Cat toDto (final DbCat dbCat) {
        return Cat.builder()
                .id(dbCat.getId())
                .name(dbCat.getName())
                .birthDate(dbCat.getBirthDate())
                .height(dbCat.getHeight())
                .weight(dbCat.getWeight())
                .eyeColor(dbCat.getEyeColor())
                .furColor(dbCat.getFurColor())
                .character(dbCat.getPersonality())
                .polite(dbCat.getPolite())
                .race(Race.toDto(dbCat.getDbRace()))
                .build();
    }

    static DbCat toDb (final Cat cat) {
        return DbCat.builder()
                .id(cat.getId())
                .name(cat.getName())
                .birthDate(cat.getBirthDate())
                .height(cat.getHeight())
                .weight(cat.getWeight())
                .eyeColor(cat.getEyeColor())
                .furColor(cat.getFurColor())
                .personality(cat.getCharacter())
                .polite(cat.getPolite())
                .dbRace(Race.toDb(cat.getRace()))
                .build();
    }
}
