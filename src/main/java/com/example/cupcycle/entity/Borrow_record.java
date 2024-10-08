package com.example.cupcycle.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Entity
@Table(name = "borrow_records")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow_record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    private Timestamp borrowTime;

    private Timestamp returnTime;

    @Column(length = 10)
    private String status;

    @ManyToOne
    @JoinColumn(name = "return_station_id", nullable = false)
    private Return_station returnStation;
}
