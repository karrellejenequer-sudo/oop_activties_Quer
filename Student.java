
public class Student {

    private String name;
    private String studentId;
    private String course;
    private int yearLevel;

    public Student(String name, String studentId, String course, int yearLevel) {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
        this.yearLevel = yearLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        if (yearLevel >= 1 && yearLevel <= 4) {
            this.yearLevel = yearLevel;
        } else {
            System.out.println("Invalid year level. Must be between 1 and 4.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("Year Level: " + yearLevel);
    }
}
