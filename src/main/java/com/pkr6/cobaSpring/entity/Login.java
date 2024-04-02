/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ROG G512
 */
@Entity
@Table(name="login")
public class Login {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
private String email;
private String name;
private String password;
public Login()
{
}
public Login(Long id, String email, String name, String password) {
this.id = id;
this.email = email;
this.name = name;
this.password = password;
}
public Long getId() {
return this.id;
}
public void setId(Long id) {
this.id = id;
}
public String getEmail() {
return this.email;
}
public void setEmail(String email) {
this.email = email;
}
public String getName() {
return this.name;
}
public void setName(String name) {
this.name = name;
}
public String getPassword() {
return this.password;
}
public void setPassword(String password) {
this.password = password;
}
}

