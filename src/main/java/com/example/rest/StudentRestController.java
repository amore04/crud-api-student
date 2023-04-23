package com.example.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.entity.Student;
import com.example.service.StudentService;

/**
 *
 * @author aniket-pc
 */

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private StudentService studentService;

    // inject student dao
    @Autowired
    public StudentRestController(StudentService theStudentService) {
        studentService = theStudentService;
    }

    // "/students" and return list of student
    @GetMapping("/students")
    public List<Student> findAll() {
        return studentService.findAll();
    }

    // add mapping for GET /students/{studentId}
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        Student theStudent = studentService.findById(studentId);

        if (theStudent == null) {
            throw new RuntimeException("Student id not found - " + studentId);
        }

        return theStudent;
    }

    // add mapping for POST /students - add new student
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student theStudent) {
        theStudent.setId(0);
        studentService.save(theStudent);
        return theStudent;
    }

    // add mapping for PUT /students - update existing student
    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student theStudent) {
        studentService.save(theStudent);
        return theStudent;
    }

    // add mapping for DELETE /students/{studentId} - delete student
    @DeleteMapping("/students/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        Student tempStudent = studentService.findById(studentId);

        // throw exception if null
        if (tempStudent == null) {
            throw new RuntimeException("Student id not found - " + studentId);
        }

        studentService.deleteById(studentId);
        return "Deleted student ud - " + studentId;
    }

}
