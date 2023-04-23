package com.example.dao;

import com.example.entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aniket-pc
 */
@Repository
public class StudentDAOHibernateImpl implements StudentDAO {

    // define field for entityManger
    private EntityManager entityManager;

    // set up Constructor injection
    @Autowired
    public StudentDAOHibernateImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Student> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Student> theQuery = currentSession.createQuery("from Student", Student.class);

        List<Student> students = theQuery.getResultList();

        return students;
    }

    @Override
    public Student findById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Student theStudent = currentSession.get(Student.class, theId);

        return theStudent;
    }

    @Override
    public void save(Student theStudent) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(theStudent);
    }

    @Override
    public void deleteById(int theId) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from Student where id=:studentId");

        theQuery.setParameter("studentId", theId);

        theQuery.executeUpdate();
    }

}
