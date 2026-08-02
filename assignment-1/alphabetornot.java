import java.util.Scanner;;

public class alphabetornot {
    public static void main(String[] arg){
      Scanner sc=new Scanner(System.in);
      char ch= sc.next().charAt(0);
      if((ch>'A'&&ch<'Z')||(ch>'a'&&ch<'z')){
        System.out.println(ch+", character is alphabet");
      }
      else{
        System.out.println(ch+",character is not alphabet");
      }
      sc.close();
    }
}
