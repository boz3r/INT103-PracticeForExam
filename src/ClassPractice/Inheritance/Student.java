package ClassPractice.Inheritance;

public class Student extends Person{
    String Major, Faculty;
    int StudentID;

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public long getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }
}
