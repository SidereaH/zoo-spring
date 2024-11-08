package com.zoo.zoo_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "area", schema = "public", catalog = "zoo")
public class Area {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "area_id")
    private Long areaId;

    @Column(name = "area_name")
    private String areaName;

}
