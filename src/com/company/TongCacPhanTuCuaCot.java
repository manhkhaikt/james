package com.company;

import java.util.Scanner;

public class TongCacPhanTuCuaCot {
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

        int n, sum = 0;
        System.out.println("Nhap cot can tinh tong");
        n = scan.nextInt();

        for (int j = 0; j < row; j++) {
            sum += arr[j][n - 1];
        }
        System.out.println("Tong cac phan tu cot thu " + n + " la: " + sum);
    }
}
