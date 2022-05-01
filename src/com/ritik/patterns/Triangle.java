package com.ritik.patterns;

public class Triangle {
    public static void main(String[] args) {
        UpTriangle(5, 0);

    }

    static void UpTriangle(int r, int c) {
        if(r ==0)
            return;
        if(c < r) {
            System.out.print("*");
            UpTriangle(r, c + 1);
        } else {
            System.out.println();
            UpTriangle(r-1, 0);
        }
    }

}
