
import java.time.Instant;
import java.util.Scanner;

public class GFc {
    static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    
    public static void main(String args[])
    {
              long start1 = System.currentTimeMillis();
        Scanner q = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE Fibonacci NUMBER");
        int N = q.nextInt();      
        System.out.println(fib(N));

               long end1 = System.currentTimeMillis();   
      System.out.println("Time Taken : "+ ((end1-start1))+" Mili seconds");      
     
    }
} 
      
   