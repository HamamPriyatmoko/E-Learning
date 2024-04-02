/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.service;



import com.pkr6.cobaSpring.entity.Exam;
import com.pkr6.cobaSpring.repo.ExamRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USER
 */
//anotasikan dengan
@Service
@Transactional
public class ExamService {

    @Autowired
    private ExamRepo repo;
// fungsi untuk return course

    public Iterable<Exam> findAll() {
        return repo.findAll();
    }
// Function create exam data

    public void addExam(Exam exam) {
        repo.save(exam);
    }
//function delete

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
//function edit

    public Optional<Exam> findById(Long id) {
        return repo.findById(id);
    }
//function update

    public void updateExam(Exam exam) {
        repo.save(exam);
    }
    
    //search by keyword
    public List<Exam>findByName(String keyword){
    return repo.findByNameContains(keyword);
    }
}