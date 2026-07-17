import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    StudentFileDAO dao = new StudentFileDAO();
    public void addStudent(Student student) throws IOException {
          dao.addStudent(student);
    }
    public List<Student> getAllStudents() throws IOException {
        return dao.getAllStudents();
    }
    public Student searchStudents(int studentId) throws IOException {
        return dao.searchStudent(studentId);
    }
    public void updateStudent(Student student) throws IOException {
        dao.updateStudent(student);
    }
    public void deleteStudent(int studentId) throws IOException {
        dao.deleteStudent(studentId);
    }
}
