package com.example.codingtest.ex3;

public class ex3 {
    public static void main(String[] args) {
        int resuit=factorial(4);
        System.out.println(resuit);
    }

    private static int factorial(int num) {
        if(num==1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }
}
