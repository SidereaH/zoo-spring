package com.zoo.zoo_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cage", schema = "public", catalog = "zoo")
public class Cage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cage_id")
    private Long cageId;
    @Column(name = "size")
    private int size;

    @ManyToOne
    @JoinColumn(name = "food_type_id")
    private FoodType foodType;

}
