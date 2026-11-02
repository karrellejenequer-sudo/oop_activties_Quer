public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ana Cruz", "STU001", "BSIT", 2);

        Student student2 = new Student("Mark Reyes", "STU002", "BSCS", 1);

        CollegeStudent student3 = new CollegeStudent(
            "Lea Santos", "STU003", "BSIT", 3, "Full Scholar"
        );

        System.out.println("===== STUDENT INFORMATION =====");

        student1.displayInfo();

        System.out.println();

        student2.displayInfo();

   
        System.out.println();
        System.out.println("===== COLLEGE STUDENT =====");

        student3.displayInfo();

        student1.setYearLevel(4);

        System.out.println();
        System.out.println("===== UPDATED INFORMATION =====");

        System.out.println("Name: " + student1.getName());
        System.out.println("Course: " + student1.getCourse());
        System.out.println("Year Level: " + student1.getYearLevel());

    }
}

/*
REFLECTION QUESTIONS:

1. Why should the attributes of Student be private instead of public?
Answer: To protect the data and access or modify it using getters and setters.

2. What would happen if CollegeStudent did not call super(...) in its constructor?
Answer: The parent class constructor would not be properly called, causing a 
compilation error because Student has no default constructor.

3. What is the benefit of overriding displayInfo() instead of writing a new method with a 
different name?
Answer: It allows CollegeStudent to use the same method name while adding its own
 information, such as scholarship status.
*/
