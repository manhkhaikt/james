package com.company;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {


    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner sc = new  Scanner(System.in);


        System.out.println("Nhap gia tri cho mang :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int a = array[0];
        for (int i = 0; i < array.length; i++){
            if (a > array[i]) {
                a = array[i];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la : \t" +a);

    }
}
