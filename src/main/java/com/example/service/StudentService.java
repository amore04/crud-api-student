package com.example.service;

import com.example.entity.Student;
import java.util.*;
/**
 *
 * @author aniket-pc
 */
public interface StudentService {
    
    public List<Student> findAll();
    
    public Student findById(int theId);
    
    public void save(Student theStudent);
    
    public void deleteById(int theId);
    
}
