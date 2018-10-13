package com.company;

import java.util.Scanner;

public class ChenPhanTuVaoMang {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] array2 =  new int[11];
        int x,index,a;

        System.out.println("Nhap gia tri mang");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Nhap so can chen :");
        x = sc.nextInt();

        System.out.println("Nhap vi tri can chen:");
        index = sc.nextInt();

        for (int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }

            if (index <= -1 || index >= array.length-1){
                System.out.println("Khong the chen duoc phan tu vao mang");
            }
            else {
                for(int i = index; i < array2.length; i++) {
                    if (i == array2.length-1){
                        array2[i] = x;
                        break;
                    }
                    a = array2[i];
                    array2[i] = x;
                    x = a;
                }
            for (int i = 0; i < array2.length; i++){
                    System.out.println(array2[i]);
        }

        }
    }
}
