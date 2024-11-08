package com.zoo.zoo_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.zoo.zoo_spring.models.User;

@Component
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
