/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pkr6.cobaSpring.controller;

import com.pkr6.cobaSpring.entity.Exam;
import com.pkr6.cobaSpring.repo.ExamRepo;
import com.pkr6.cobaSpring.service.DatabasePDFService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author ROG G512
 */
@Controller
public class PDFExportController {
    @Autowired
    ExamRepo examRepo;
    @GetMapping(value = "/openpdf/exam", produces = MediaType.APPLICATION_PDF_VALUE)
    
    public ResponseEntity<InputStreamResource> examReport() throws IOException {
        List<Exam> exams = (List<Exam>) examRepo.findAll();
            ByteArrayInputStream bis = DatabasePDFService.examPDFReport(exams);
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "inline;filename=exam.pdf");
            
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(new InputStreamResource(bis));
    }
}