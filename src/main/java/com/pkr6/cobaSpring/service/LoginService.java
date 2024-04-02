/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.service;

import com.pkr6.cobaSpring.entity.Login;
import com.pkr6.cobaSpring.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ROG G512
 */
@Service
public class LoginService {
    @Autowired
    private LoginRepository repo;
    
    public Login login(String email, String password){
        Login user = repo.findByEmailAndPassword(email, password);
        return user;
    }
}
