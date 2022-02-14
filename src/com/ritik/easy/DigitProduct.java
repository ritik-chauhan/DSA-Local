package com.ritik.easy;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(Product(174));
    }
    static int Product(int n) {
        if(n%10 == n )
        return n;
        return (n%10) * Product(n/10);
    }
}
