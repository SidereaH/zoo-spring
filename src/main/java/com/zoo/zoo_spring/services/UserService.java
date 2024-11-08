package com.zoo.zoo_spring.services;

import com.zoo.zoo_spring.dal.UserDTO;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO getUserById(Long UserId);
    /**
     * List<UserDTO> getAllUsers();
     * 
     * UserDTO updateUser(Long userId, UserDTO updatedUser);
     * 
     * void deleteUser(Long userId);
     **/
}
