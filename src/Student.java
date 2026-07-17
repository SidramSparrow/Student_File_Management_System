public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
//CONSTRUCTOR
    public Student (int studentId,String studentName,String studentEmail){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }
//GETTER
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }
//SETTER
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
//TOSTRING
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }
}
