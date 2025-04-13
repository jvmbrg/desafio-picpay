package com.jvmbrg.teste_tecnico1.service;

import com.jvmbrg.teste_tecnico1.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }



}
