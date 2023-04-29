package com.example.redisspringexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Table(name = "Cars")
@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Cars {

    @Id
    private int id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "type")
    private String type;

    @Column(name = "model")
    private int model;

}
