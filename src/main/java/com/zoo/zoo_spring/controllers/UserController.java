package com.zoo.zoo_spring.controllers;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.zoo.zoo_spring.dal.UserDTO;
import com.zoo.zoo_spring.services.UserService;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // Build Create or Add Department REST API
    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO user = userService.createUser(userDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // Build Get users REST API
    @GetMapping("{id}")
    public ResponseEntity<UserDTO> getUserByIdById(@PathVariable("id") Long userid) {
        UserDTO userDTO = userService.getUserById(userid);
        return ResponseEntity.ok(userDTO);
    }
    /**
     * // Build Get All Users REST API
     * 
     * @GetMapping
     *             public ResponseEntity<List<DepartmentDto>> getAllDepartments(){
     *             List<DepartmentDto> departments =
     *             departmentService.getAllDepartments();
     *             return ResponseEntity.ok(departments);
     *             }
     **/
    /**
     * // Build Update Department REST API
     * @PutMapping("{id}")
     * public ResponseEntity<DepartmentDto> updateDepartment(@PathVariable("id")
     * Long departmentId,
     * 
     * @RequestBody DepartmentDto updatedDepartment){
     *              DepartmentDto departmentDto =
     *              departmentService.updateDepartment(departmentId,
     *              updatedDepartment);
     *              return ResponseEntity.ok(departmentDto);
     *              }
     * 
     *              // Build Delete Department REST API
     *              @DeleteMapping("{id}")
     *              public ResponseEntity<String>
     *              deleteDepartment(@PathVariable("id") Long departmentId){
     *              departmentService.deleteDepartment(departmentId);
     *              return ResponseEntity.ok("Department deleted successfully!.");
     *              }
     **/
}
