class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", DOB: " + DOB);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s = new Student("Preeti", 20, "14-05-2005");
        s.display();
    }
}
