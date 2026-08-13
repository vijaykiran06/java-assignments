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
