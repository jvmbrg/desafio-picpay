package com.jvmbrg.teste_tecnico1.controller;

import com.jvmbrg.teste_tecnico1.model.User;
import com.jvmbrg.teste_tecnico1.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<User>> listUsers(){
        return new ResponseEntity<>(userService.listAllUsers(), HttpStatus.OK);
    }
}
