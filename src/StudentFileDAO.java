
import java.util.*;
import java.io.*;

public class StudentFileDAO {

    public void addStudent(Student student) throws IOException {
        try ( FileWriter writer = new FileWriter("Student.txt",true)) {
            writer.write(
                    student.getStudentId() + "," +
                            student.getStudentName() + "," +
                            student.getStudentEmail() + "\n"
            );
        }
    }
    public List<Student> getAllStudents() throws IOException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2]
                );
                students.add(student);
            }
            return students;
        }
    }
    public Student searchStudent(int studentId) throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader("Student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (Integer.parseInt(data[0]) == studentId) {
                    Student student = new Student(
                            Integer.parseInt(data[0]),
                            data[1],
                            data[2]
                    );
                    return student;
                }
            }
        }
        return null;
    }
    public void updateStudent(Student student) throws IOException{
        List<Student> students = getAllStudents();
        boolean found = false;
        for (int i=0;i<students.size();i++){
            if (students.get(i).getStudentId() == student.getStudentId()){
                students.get(i).setStudentName(student.getStudentName());
                students.get(i).setStudentEmail(student.getStudentEmail());
                found = true;
                break;
            }
        }
        try (FileWriter writer = new FileWriter("Student.txt")) {
            for (Student updatedStudent : students) {
                writer.write(
                        updatedStudent.getStudentId() + "," +
                                updatedStudent.getStudentName() + "," +
                                updatedStudent.getStudentEmail() + "\n"
                );
            }
        }

        if (found){
            System.out.println("Student updated successfully");
        }else {
            System.out.println("Student not found");
        }
    }
    public void deleteStudent(int studentId) throws IOException{
        List<Student> students = getAllStudents(); // read list
        boolean found = false;
        for (int i=0;i<students.size();i++){
            if (students.get(i).getStudentId() == studentId){
                students.remove(i);
                found = true;
                break;
            }
        }

        try (FileWriter writer = new FileWriter("Student.txt")) {
            for (Student student : students) {
                writer.write(
                        student.getStudentId() + "," +
                                student.getStudentName() + "," +
                                student.getStudentEmail() + "\n"
                );
            }
        }

        if (found){
            System.out.println("Student deleted successfully");
        }else {
            System.out.println("student not Found");
        }

    }

}
