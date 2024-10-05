import dao.TeacherDao;
import models.Teacher;

public class Main {
    public static void main(String[] args) {
        TeacherDao daoTeacher = new TeacherDao();
        Teacher teacher = new Teacher();
        teacher.setName("Javier Espinoza");
        teacher.setId(3388);
        teacher.setArea("Computer Science");
        daoTeacher.save(teacher);

    }
}


