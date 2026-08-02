
 import java.util.Scanner;
public class fibonacci {
    public static void main(String[] arg){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int first=0,second=1;
   System.out.print("fibonocci series");

   for(int i=0;i<n;i++){
    System.out.println(first+" ");
    int next=first+second;
    first=second;
    second =next;
   }
    }
}
