package com.example.thithuchhanhm4.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Country country;
    private Double acreage;
    private Double population;
    private Double gdp;
    private String type;
}
