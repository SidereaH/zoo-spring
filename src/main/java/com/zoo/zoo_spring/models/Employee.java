package com.zoo.zoo_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.awt.geom.Area;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employee", schema = "public", catalog = "zoo")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "employee_id")
    private Long employeeId;
    @Column(name = "full_name")
    private String fullName;

    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "employee_sex")
    private String employeeSex;

    @Column(name = "passport")
    private String passport;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;
}
