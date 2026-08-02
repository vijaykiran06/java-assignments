import java.util.Scanner;
public class factorial {
   public static void main(String[] arg){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=1;
    for(int i=1;i<=n;i++){
        ans=ans*i;
    }
    System.out.print(ans+"factorial of "+n);
   } 
}
