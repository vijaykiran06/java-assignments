class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Vijay", 20);
        Student s2 = new Student("Rahul", 21);

        s1.display();
        s2.display();
    }
}