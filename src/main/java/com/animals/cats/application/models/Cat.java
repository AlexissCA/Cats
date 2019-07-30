package com.animals.cats.application.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cat {
    private Long id;
    private String name;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    private Integer height;
    private Double weight;
    private String eyeColor;
    private String furColor;
    private String furPattern;
    private String personality;
    private Boolean ifPolite;
    private Breed breed;

    public static Cat toDto (DbCat dbCat) {
        return Cat.builder()
                .id(dbCat.getId())
                .name(dbCat.getName())
                .birthDate(dbCat.getBirthDate())
                .height(dbCat.getHeight())
                .weight(dbCat.getWeight())
                .eyeColor(dbCat.getEyeColor())
                .furColor(dbCat.getFurColor())
                .furPattern(dbCat.getFurPattern())
                .personality(dbCat.getPersonality())
                .ifPolite(dbCat.getIfPolite())
                .breed(dbCat.getDbBreed() != null ? Breed.toDto(dbCat.getDbBreed()) : null)
                .build();
    }

    public static DbCat toDao (Cat cat) {
        return DbCat.builder()
                .id(cat.getId())
                .name(cat.getName())
                .birthDate(cat.getBirthDate())
                .height(cat.getHeight())
                .weight(cat.getWeight())
                .eyeColor(cat.getEyeColor())
                .furColor(cat.getFurColor())
                .personality(cat.getPersonality())
                .ifPolite(cat.getIfPolite())
                .dbBreed(Breed.toDao(cat.getBreed()))
                .build();
    }

}
