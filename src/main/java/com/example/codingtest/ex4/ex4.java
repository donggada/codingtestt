package com.example.codingtest.ex4;

public class ex4 {
    public static void main(String[] args) {
        Double resuit=factorial(1000000);
        System.out.println(resuit);
    }
    private static Double factorial(int num) {
        Double sum=1.0;
        for (int i = 1; i <=num ; i++) {
            sum*=i;
        }
        return sum;
    }
}
