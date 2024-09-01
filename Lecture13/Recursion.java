package Lecture13;

import java.util.*;
public class Recursion{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(Factorial(n,i));
        sc.close();
    }
        static int Factorial(int n){
            if(n==0 || n==1)
            return 1;
            int x=n*Factorial(n-1);
            return x;
        }
        static int Factorial(int n,int i){
            if(n==0 || n==1)
            return 1;
            return n*Factorial(n-1,n*i);
        }
        static int pow(int a,int b){
            if(b==0 )
            return 1;
            int x=a*pow(a,b-1 );
            return x;
    }
    static int pow(int a,int b, int c){
        if(b==0 )
        return c;
        return pow(a,b-1,a*c );
    }
}