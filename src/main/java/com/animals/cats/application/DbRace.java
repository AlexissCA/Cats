package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DbRace {
    private final Integer id;
    private final String raceName;
}
