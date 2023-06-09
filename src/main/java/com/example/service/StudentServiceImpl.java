package com.example.service;

import com.example.dao.StudentDAO;
import com.example.entity.Student;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aniket-pc
 */

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;
    
    @Autowired
    public StudentServiceImpl(StudentDAO theStudentDAO) {
        studentDAO = theStudentDAO;
    }

    
    @Override
    @Transactional
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    @Transactional
    public Student findById(int theId) {
        return studentDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        studentDAO.save(theStudent);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        studentDAO.deleteById(theId);
    }
    
}
