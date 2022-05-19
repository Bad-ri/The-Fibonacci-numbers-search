
import java.time.Instant;
import java.util.Scanner;

public class GFG {
    public static void main(String args[])
    {
              long start1 = System.currentTimeMillis();
        Scanner q = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE Fibonacci NUMBER");
        int N = q.nextInt();
        int ARR[]= new int [100];
        int num1 = 0, num2 = 1;
        int c = 0;
        while (c <= N) {
            ARR[c]=num1;
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            c = c + 1;
        }
        System.out.println("Number = "+ARR[c-1]);      
               long end1 = System.currentTimeMillis();   
      System.out.println("Time Taken : "+ ((end1-start1))+" Mili seconds");      
     
    }
}