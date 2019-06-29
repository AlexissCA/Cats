package com.animals.cats.application;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@Entity
@RequiredArgsConstructor
@Table (name = "cat_races")
public class DbRace {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Integer id;
    @Column(name = "race_name", nullable = false, unique = true)
    private final String raceName;
}
