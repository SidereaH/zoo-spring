package com.zoo.zoo_spring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user", schema = "public", catalog = "zoo")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_age")
    private int userAge;

    @Column(name = "user_role")
    private String userRole;

    @Column(name = "user_password")
    private String userPassword;

}
