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