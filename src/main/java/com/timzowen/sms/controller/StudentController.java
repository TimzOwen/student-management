package com.timzowen.sms.controller;

import com.timzowen.sms.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    public String listStudents(Model model){
        model.addAttribute("s",studentService.getAllStudents());
        return "students";
    }

}
