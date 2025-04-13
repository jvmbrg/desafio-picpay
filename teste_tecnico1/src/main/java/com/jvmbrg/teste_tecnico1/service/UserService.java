package com.jvmbrg.teste_tecnico1.service;

import com.jvmbrg.teste_tecnico1.model.User;
import com.jvmbrg.teste_tecnico1.model.Wallet;
import com.jvmbrg.teste_tecnico1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        if(userRepository.existsByCpf(user.getCpf())) {
            throw new RuntimeException("CPF já cadastrado no sistema");
        }
        Wallet wallet = new Wallet();
        user.setWallet(wallet);
        return userRepository.save(user);
    }

    public List<User> listAllUsers(){
        return userRepository.findAll();
    }



}
