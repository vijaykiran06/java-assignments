class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name) {
        this.name = name;
        age = 0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class qurstion5 {
      public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Vijay");
        Student s3 = new Student("Rahul", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}
