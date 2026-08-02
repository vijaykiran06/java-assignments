 
 // question-1
 import java.util.Scanner;

public class leapyear {
    public static void main(String[] arg){
         Scanner sc= new Scanner(System.in);
         System.out.println("enter the  year");
         int year=sc.nextInt();
         if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.print(year+", is a leap year");
         }
         else {
            System.out.print(year+",is not a leap year");
         }

         //question-2


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

//question-3

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

   //question-4
   
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
 //question-5

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

//question-6
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int num1 = a, num2 = b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}
//question-7

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
//question-8
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
//question-9
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        long power = 1;

        for (int i = 1; i <= exponent; i++) {
            power = power * base;
        }

        System.out.println("Power = " + power);

        sc.close();
    }
}
//question-10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}