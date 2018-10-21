package com.company;

import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        int row, col;
        Scanner scan = new Scanner(System.in);

        System.out.println("Nhap mang: ");
        System.out.println("Nhap  so hang: ");
        row = scan.nextInt();
        System.out.println("Nhap so cot");
        col = scan.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Nhap gia tri cho mang:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int max=0,x=0,y=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]>max){
                    max=arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }

        System.out.println("Phan tu lon nhat trong mang la: "+max);
        System.out.println("Phan tu nam ơ vi tri hang "+x+" cot "+y);


    }
}
