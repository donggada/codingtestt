package com.example.codingtest.ex2;

public class calculator {
   private int num;

    public calculator add(int num){
        this.num+=num;
        return this;
    }
    public calculator subtract(int num){
        this.num-=num;
        return this;
    }
    public int out(){
        return num;
    }
}
