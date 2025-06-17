package Day4;

class Student {
    private String name;
    private int marks;

    public Student(String name) {
        this.name = name;
    }

    public void assignMarks(int marks) {
        this.marks = marks;
    }

    public void displayResults() {
        System.out.println("Student: " + name + ", Marks: " + marks);
    }
}

public class Mainprg {
    public static void main(String[] args) {
        Student student1 = new Student("Arjun");
        student1.assignMarks(85);
        student1.displayResults();

        Student student2 = new Student("Akshaya");
        student2.assignMarks(92);
        student2.displayResults();
    }
}
