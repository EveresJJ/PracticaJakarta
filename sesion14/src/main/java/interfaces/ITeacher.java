package interfaces;

import models.Teacher;

import java.util.List;

public interface ITeacher {
    public void save (Teacher teacher);
    public Teacher getTeacher(Long id);
    public void update (Teacher teacher);
    public void delete (Teacher teacher);
    public List<Teacher> getTeachers();
}


