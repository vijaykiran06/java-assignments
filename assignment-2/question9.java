  class student{
    public static  int count=0;
    student(){
        count++;
    }
  }



public class question9 {
  public static void main(String[] args){
    student s1=new student();
    student s2=new student();
    student s3=new student();

    System.out.println(student.count);
  }
    
}

