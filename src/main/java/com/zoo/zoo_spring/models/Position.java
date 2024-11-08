package com.zoo.zoo_spring.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "position", schema = "public", catalog = "zoo")
public class Position {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "position_id")
    private Long positionId;

    @Column(name = "position_name")
    private String positionName;

}
