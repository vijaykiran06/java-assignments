import java.util.Scanner;
public class reversenumber {
     public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int te=0;
        while (n!=0) {
            int temp=n%10;
          te=te*10+temp;
          n=n/10;
            
        }
        System.out.print("output"+te);
     } 
}
