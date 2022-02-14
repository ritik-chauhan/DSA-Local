package com.ritik.easy;

public class Reverse
{
    static int sum=0;

    static void rev1(int n)
    {
        if(n==0) {
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rev1(n/10);
    }
    static int rev2(int n) {
     //create another function ig you need more arguments
     //"helper" in this case
     int digits=(int)Math.log10(n)+1; //to calculate number of digits in n
     return helper(n,digits);
}
    static int helper(int n, int digits) {
        if(n%10==n)
            return n;
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10, digits-1);
    }
    public static void main(String[] args)
    {
        //rev1(1234);
        System.out.println(rev2(123456789));
    }
}
