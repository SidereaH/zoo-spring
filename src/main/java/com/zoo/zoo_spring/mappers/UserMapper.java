package com.zoo.zoo_spring.mappers;

import com.zoo.zoo_spring.dal.UserDTO;
import com.zoo.zoo_spring.models.User;

public class UserMapper {

    // convert user jpa entity into user dto
    public static UserDTO mapToUserDTO(User user) {
        return new UserDTO(
                user.getUserId(),
                user.getUserName(),
                user.getUserAge(),
                user.getUserRole(),
                user.getUserPassword());
    }

    // convert user dto into user jpa entity
    public static User mapToUser(UserDTO userDTO) {
        return new User(
                userDTO.getUserId(),
                userDTO.getUserName(),
                userDTO.getUserAge(),
                userDTO.getUserRole(),
                userDTO.getUserPassword());
    }
}
