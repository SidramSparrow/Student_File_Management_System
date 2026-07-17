import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws IOException {
        StudentService service = new StudentService();
        Scanner scan = new Scanner(System.in);
        int choice;
        while (true){
            System.out.println("=========== Menu ===========");
            System.out.println("1. Add Student \n" +
                    "2. View Student\n" +
                    "3. Search Student\n" +
                    "4. Update Student\n" +
                    "5. Delete Student\n" +
                    "6. Exit"
            );
            System.out.print("Enter your choice : ");
            choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Student Id : ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter Student Name :");
                    String name = scan.nextLine();
                    System.out.print("Enter Student Email :");
                    String email = scan.nextLine();

                    Student student = new Student(id, name, email);
                    service.addStudent(student);
                    break;
                case 2:
                    System.out.println("The Students details are : ");
                    List<Student> students = service.getAllStudents();
                    if (students.isEmpty()){
                        System.out.println("No student found");
                    }else {
                        for (Student s : students){
                            System.out.println(s.getStudentId() +
                                    " | " + s.getStudentName() + " | "+
                                    s.getStudentEmail());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the Student Id to search : ");
                    id = scan.nextInt();
                    student = service.searchStudents(id);
                    if (student != null){
                        System.out.println(student.getStudentId() + " | " +
                                student.getStudentName() + " | "+
                                student.getStudentEmail());
                    }else {
                        System.out.println("student not found");
                    }
                    break;
                case 4:
                    System.out.print("Enter the student id to be updated : ");
                    id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Student Name : ");
                    name = scan.nextLine();
                    System.out.println("Enter Student Email : ");
                    email=scan.nextLine();
                    student = new Student(id,name,email);
                    service.updateStudent(student);
                    break;
                case 5:
                    System.out.println("Enter the Student id to Delete Student : ");
                    id = scan.nextInt();
                    service.deleteStudent(id);
                    break;
                case 6:
                    System.out.println("No input found ");
                    return;

            }
        }
    }
}
