package com.example.cupcycle.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rewards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rewardId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private Integer rewardPoints;

    @Column(length = 100)
    private String description;
}
