package com.sda.javagda34.students.controller;

import com.sda.javagda34.students.model.Student;
import com.sda.javagda34.students.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping()
    public String getStudentForm(Model model, Student student) {

        model.addAttribute("student", student);

        return "student_form";
    }


    @PostMapping()
    public String updateStudent(Student student) {
        System.out.println("dane" + student);
        studentService.update(student);
        return "redirect:/student";
    }

    @GetMapping("/list")
    public String listStudents(Model model){
        List<Student> studentList = studentService.findAll();
        return "student_list";
    }
}
