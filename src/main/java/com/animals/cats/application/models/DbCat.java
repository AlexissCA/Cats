package com.animals.cats.application.models;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table (name = "cats")
public class DbCat {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column (name = "birth_date")
    private LocalDate birthDate;
    @Column (name = "height_centimeters")
    private Integer height;
    @Column (name = "weight_kilograms")
    private Double weight;
    @Column (name = "eye_color")
    private String eyeColor;
    @Column (name = "fur_color")
    private String furColor;
    @Column (name = "fur_pattern")
    private String furPattern;
    @Column (name = "personality")
    private String personality;
    @Column (name = "if_polite")
    private Boolean ifPolite;
    @OneToOne
    @JoinColumn (name = "breed_id")
    private DbBreed dbBreed;
}
