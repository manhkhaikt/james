package com.company;

import java.util.Scanner;

public class ChenPhanTuVaoMang {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int x,index,a;

        System.out.println("Nhap gia tri mang");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Nhap so can chen :");
        x = sc.nextInt();

        System.out.println("Nhap vi tri can chen:");
        index = sc.nextInt();


            if (index <= -1 || index >= array.length-1){
                System.out.println("Khong the chen duoc phan tu vao mang");
            }
            else {
                for(int i = index; i < array.length; i++) {
                    if (i == array.length-1){
                        array[i] = x;
                        break;
                    }
                    a = array[i + 1];
                    array[i] = x;
                    x = a;
                }
            for (int i = 0; i < array.length; i++){
                    System.out.println(array[i]);
        }

        }
    }
}
