package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Cat {
    private final Long id;
    private final String name;
    private final LocalDateTime birthDate;
    private final Integer height;
    private final Integer weight;
    private final String eyeColor;
    private final String furColor;
    private final Race race;
    private final String character;

    static Cat toDto (final DbCat dbCat) {
        return Cat.builder()
                .id(dbCat.getId())
                .name(dbCat.getName())
                .birthDate(dbCat.getBirthDate())
                .height(dbCat.getHeight())
                .weight(dbCat.getWeight())
                .eyeColor(dbCat.getEyeColor())
                .furColor(dbCat.getFurColor())
                .race(dbCat.getRace())
                .character(dbCat.getCharacter())
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
                .race(cat.getRace())
                .character(cat.getCharacter())
                .build();
    }
}
