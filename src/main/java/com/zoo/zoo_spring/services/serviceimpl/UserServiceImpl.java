package com.zoo.zoo_spring.services.serviceimpl;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoo_spring.dal.UserDTO;
import com.zoo.zoo_spring.mappers.UserMapper;
import com.zoo.zoo_spring.models.User;
import com.zoo.zoo_spring.repositories.UserRepository;
import com.zoo.zoo_spring.services.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = UserMapper.mapToUser(userDTO);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDTO(savedUser);
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new RuntimeException("Department is not exists with a given id: " + userId));
        return UserMapper.mapToUserDTO(user);
    }

    // @Override
    // public List<DepartmentDto> getAllDepartments() {
    // List<Department> departments = departmentRepository.findAll();
    // return departments.stream().map((department) ->
    // DepartmentMapper.mapToDepartmentDto(department))
    // .collect(Collectors.toList());
    // }

    // @Override
    // public DepartmentDto updateDepartment(Long departmentId, DepartmentDto
    // updatedDepartment) {
    /**
     * Department department =
     * departmentRepository.findById(departmentId).orElseThrow(
     * () -> new ResourceNotFoundException("Department is not exists with a given
     * id:" + departmentId));
     * 
     * department.setDepartmentName(updatedDepartment.getDepartmentName());
     * department.setDepartmentDescription(updatedDepartment.getDepartmentDescription());
     * 
     * Department savedDepartment = departmentRepository.save(department);
     * 
     * return DepartmentMapper.mapToDepartmentDto(savedDepartment);
     * }
     * 
     * @Override
     *           public void deleteDepartment(Long departmentId) {
     *           departmentRepository.findById(departmentId).orElseThrow(
     *           () -> new ResourceNotFoundException("Department is not exists with
     *           a given id: " + departmentId));
     * 
     *           departmentRepository.deleteById(departmentId);
     *           }
     **/
}
