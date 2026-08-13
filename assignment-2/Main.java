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