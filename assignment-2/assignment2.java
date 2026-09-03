// question -1
class student{
    String name;
    int rollno;
    void display(){
        System.out.println("Name "+name);
        System.out.print("rollno "+rollno);

    }
}


public class Main{
 public static void main(String[] args) {
    student s1=new student();
    s1.name="vijay";
    s1.rollno=1024170415;
    s1.display();
 }

  
}
//question -2 
 class student {
   String name;
   String course;

   student(String x,String y){
    name=x;
    course=y;
   }
   void display(){
    System.out.println("Name"+name);
    System.out.println("course"+course);
   }
}


public record question2() {
    public static void main(String [] arg){
        student s1=new student("kiran","Btech");
        student s2=new student("karthik","MSC");
        s1.display();
        s2.display();
        

    }
}
//question -3 

class student{
    String name ="kiran";
     private int age=20;
     
  protected  String college= "Thapar";
  public int marks= 89;
  void display(){
    System.out.println("name"+name);
     System.out.println("age"+age);
      System.out.println("college"+college);
       System.out.println("marks"+marks);
  }

}

public class question3 {
    public static void main (String [] arg){
        student s= new student();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.marks);
        System.out.println(s.college);
        s.display();
    }
    
}
//question -4 
class Student {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }

      public String getName() {
        return name;
    }
public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}



public class question4 {
    public static void main (String [] arg){
    Student s1 = new Student();

        s1.setName("Vijay");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
}
}
//question-5
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

public class question5 {
      public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Vijay");
        Student s3 = new Student("Rahul", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}
//question-6 
interface Animal {
    void sound();
    
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class question6 {
      public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
//question-7
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Student implements Printable, Showable {
    public void print() {
        System.out.println("Printing student details");
    }

    public void show() {
        System.out.println("Showing student details");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.print();
        s.show();
    }
}
//question-8
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
    }
}
