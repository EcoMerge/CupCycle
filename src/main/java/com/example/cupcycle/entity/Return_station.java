package com.example.cupcycle.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "return_stations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Return_station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stationId;

    @Column(length = 50, nullable = false)
    private String location;

    private Integer currentCount;

    @Column(length = 10)
    private String status;
}
