package com.zoo.zoo_spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "food_type", schema = "public", catalog = "zoo")
public class FoodType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "food_type_id")
    private Long foodTypeId;

    @Column(name = "food_type_name")
    private String foodTypeName;

}
