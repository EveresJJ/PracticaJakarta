package dao;

import interfaces.ITeacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Id;
import models.Teacher;

import java.util.List;

public class TeacherDao implements ITeacher {

    @Override
    public void save(Teacher teacher) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(teacher);
        em.getTransaction().commit();

    }

    @Override
    public Teacher getTeacher(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Teacher.class, id);
    }

    @Override
    public void update(Teacher teacher) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(teacher);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Teacher teacher) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(teacher);
        em.getTransaction().commit();
    }

    @Override
    public List<Teacher> getTeachers() {
        return List.of();
    }

}






