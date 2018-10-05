package com.company;

import java.util.Scanner;

public class XoaPhanTuTrongMang {

    public static void main(String[] args) {

        int[] array = new int[10];
        Scanner sc = new  Scanner(System.in);

        System.out.println("Nhap gia tri cho mang :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int x, a = 0, b = 0 ;


        System.out.println("Nhap phan tu muon xoa :");
        x = sc.nextInt();

            for (int i = 0; i < array.length; i++) {
                if (x == array[i]) {
                    a = i;
                    break;
                }
            }

            for (int i = a; i < array.length; i++){
                if(i == array.length-1){
                    array[i] = 0;
                    break;
                }

                b = array[i + 1];
                array[i] = b;

            }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
