
import java.util.Scanner;
public class noofdigitsinint {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int t=Math.abs(n);
        if(n==0){
            count=1;
        }
        else{
            while(t!=0){
                t=t/10;
                count++;
            }
        }
        System.out.print("number of digits="+count);
    }
}
