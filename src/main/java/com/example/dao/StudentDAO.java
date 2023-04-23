package com.example.dao;

import java.util.List;
import com.example.entity.Student;

/**
 *
 * @author aniket-pc
 */
public interface StudentDAO {
    
    public List<Student> findAll();
    
    public Student findById(int theId);
    
    public void save(Student theStudent);
    
    public void deleteById(int theId);
    
}
