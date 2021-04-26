package com.example.codingtest.ex5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex5 {
    static int[][] arr=new int[10][10];
    static int[] dx={1,-1,0,0};
    static int[] dy={0,0,1,-1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int x = 0; x <10; x++) {
            for (int y = 0; y < 10; y++) {
                if (arr[x][y]!=0) {
                    boolean check = false;
                    for (int i = 0; i < 4; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];
                        if (nx > -1 && ny > -1 && nx < 10 && ny < 10) {
                            if (arr[nx][ny]==0&& arr[x][y] > arr[nx][ny]) {
                                check = true;
                            }
                        }
                    }

                    if (!check) {
                        arr[x][y]++;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


}
