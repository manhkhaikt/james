package com.company;

import java.util.Scanner;

public class GopHaiMang {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap gai tri cho mang 1 :");
        for (int i = 0; i<array1.length; i++){
            array1[i] = sc.nextInt();
        }

        System.out.println("Nhap gai tri cho mang 2 :");
        for (int i = 0; i<array1.length; i++){
            array2[i] = sc.nextInt();
        }
        int[] array3 = new int[array1.length + array2.length];

        System.out.println("Gia tri cua mang 3 :");
        for (int i = 0; i<array3.length; i++){
            if(i < array1.length) {
                array3[i] = array1[i];
            }
            else {
                if (i >= array1.length){
                    array3[i] = array2[i - array1.length];
                }
            }
            System.out.print(array3[i]+"\t");
        }

    }
}
