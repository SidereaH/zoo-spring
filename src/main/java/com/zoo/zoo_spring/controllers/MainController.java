package com.zoo.zoo_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.zoo.zoo_spring.dal.DataAccessLayer;

@RestController
@CrossOrigin(origins = "http://localhost:8080/")
@RequestMapping("/unauthorized")
@SessionAttributes("zoo")
public class MainController {
    private final DataAccessLayer dataAccessLayer;

    public MainController(DataAccessLayer dataAccessLayer) {
        this.dataAccessLayer = dataAccessLayer;
    }
}
