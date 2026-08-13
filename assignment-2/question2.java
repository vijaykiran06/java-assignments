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
