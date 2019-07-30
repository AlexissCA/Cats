package com.animals.cats;

import com.animals.cats.application.models.Breed;
import com.animals.cats.application.models.Cat;
import com.animals.cats.application.models.DbBreed;
import com.animals.cats.application.models.DbCat;

import java.time.LocalDate;

public class TestDataGenerator {
    public static final Long ID = 1L;
    public static final String NAME = "catName";
    public static final LocalDate BIRTH_DATE = LocalDate.of(2011, 01, 01);
    public static final Integer HEIGHT = 20;
    public static final Double WEIGHT = 2.5;
    public static final String EYE_COLOR = "green";
    public static final String FUR_COLOR = "black";
    public static final String PERSONALITY = "lively, crazy";
    public static final Boolean IF_POLITE = false;
    public static final Integer BREED_ID = 7;
    public static final String BREED_NAME = "Persian";
    public static final Breed BREED = Breed.builder().id(BREED_ID).breedName(BREED_NAME).build();
    public static final Integer DB_BREED_ID = 7;
    public static final String DB_BREED_NAME = "Persian";
    public static final DbBreed DB_BREED = DbBreed.builder().id(DB_BREED_ID).breedName(DB_BREED_NAME).build();

    public static Cat generateCat(final long id) {
        return Cat.builder()
                .id(ID)
                .name(NAME)
                .birthDate(BIRTH_DATE)
                .height(HEIGHT)
                .weight(WEIGHT)
                .eyeColor(EYE_COLOR)
                .furColor(FUR_COLOR)
                .personality(PERSONALITY)
                .ifPolite(IF_POLITE)
                .breed(BREED)
                .build();
    }

    public static DbCat generateDbCat(final long id) {
        return DbCat.builder()
                .id(ID)
                .name(NAME)
                .birthDate(BIRTH_DATE)
                .height(HEIGHT)
                .weight(WEIGHT)
                .eyeColor(EYE_COLOR)
                .furColor(FUR_COLOR)
                .personality(PERSONALITY)
                .ifPolite(IF_POLITE)
                .dbBreed(DB_BREED)
                .build();
    }

}
