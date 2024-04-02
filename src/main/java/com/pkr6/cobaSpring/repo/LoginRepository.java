/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.repo;

import com.pkr6.cobaSpring.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ROG G512
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
Login findByEmailAndPassword(String email, String password);
}
