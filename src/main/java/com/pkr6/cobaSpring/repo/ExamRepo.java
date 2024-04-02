/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.repo;

import com.pkr6.cobaSpring.entity.Exam;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ROG G512
 */
public interface ExamRepo extends CrudRepository<Exam, Long> {
    List <Exam> findByNameContains(String keyword);
}
