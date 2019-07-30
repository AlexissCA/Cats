package com.animals.cats.application.models;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Breed {
    private Integer id;
    private String breedName;

    public static Breed toDto (DbBreed dbBreed) {
        return Breed.builder()
                .id(dbBreed.getId())
                .breedName(dbBreed.getBreedName())
                .build();
    }

    public static DbBreed toDao (Breed breed) {
        return DbBreed.builder()
                .id(breed.getId())
                .breedName(breed.getBreedName())
                .build();
    }

}
