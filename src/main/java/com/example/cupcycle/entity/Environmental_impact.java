package com.example.cupcycle.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "environmental_impact")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Environmental_impact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int impactId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private Integer cupsSaved;

    private Integer carbonReduction;
}
