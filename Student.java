public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // Creating object using default constructor
        Student student1 = new Student();
        System.out.println("Details of Student 1:");
        student1.display();

        // Creating object using parameterized constructor
        Student student2 = new Student("John Doe", 21);
        System.out.println("\nDetails of Student 2:");
        student2.display();
    }
}  // End of Student class
