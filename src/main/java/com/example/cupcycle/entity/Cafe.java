package com.example.cupcycle.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cafe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cafeId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer availableCups;


}
