package com.company;

import java.util.Arrays;

public class CongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr1=new int[][]{{1,5,9},{3,6,4},{7,2,8}};
        int[][] arr2=new int[][]{{2,6,9},{1,7,3},{5,4,1}};
        int[][] arr=new int[3][3];

        System.out.println("Mang 1: ");
        for (int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        System.out.println("Mang 2: ");
        for (int i=0;i<arr1.length;i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Cong 2 mang: ");
        for (int i =0;i<arr.length;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
