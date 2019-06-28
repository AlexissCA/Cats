package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Race {
    private final Integer id;
    private final String raceName;

    static Race toDto (DbRace dbRace) {
        return Race.builder()
                .id(dbRace.getId())
                .raceName(dbRace.getRaceName())
                .build();
    }

    static DbRace toDb (Race race) {
        return DbRace.builder()
                .id(race.getId())
                .raceName(race.getRaceName())
                .build();
    }

}
