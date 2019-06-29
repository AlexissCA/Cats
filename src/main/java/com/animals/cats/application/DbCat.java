package com.animals.cats.application;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Table (name = "cats")
@Entity
@RequiredArgsConstructor
public class DbCat {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    @Column(name = "name", nullable = false)
    private final String name;
    @Column (name = "birth_date")
    private final LocalDate birthDate;
    @Column (name = "height_centimeters")
    private final Integer height;
    @Column (name = "weight_kilograms")
    private final Double weight;
    @Column (name = "eye_color")
    private final String eyeColor;
    @Column (name = "fur_color")
    private final String furColor;
    @Column (name = "personality")
    private final String personality;
    @Column (name = "if_polite")
    private final Boolean polite;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "race_id")
    private final DbRace dbRace;
}
