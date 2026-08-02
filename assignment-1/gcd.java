import java.util.Scanner;
public class gcd {
    public static void main(String[] arg){
     Scanner sc=new Scanner(System.in);
     int first=sc.nextInt();
     int second=sc.nextInt();
     while(second!=0){
        int temp=second;
        second=second%first;
        first=temp;
     }
     System.out.print("gcd,"+first);
    }
}
