package com.company;


import java.util.Scanner;

public class KiemTraNamNhuan {

    static boolean kt1, kt2;
    public static void main(String[] args) {
        KtNamNhuan();

    }
    public static void KtNamNhuan(){
        int year;
        System.out.println("Nhap nam muon kiem tra");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        kt1 = year % 4 == 0&&year%100!=0;
        kt2 = year % 400 == 0 && year % 100 == 0;

        if(kt1){
            System.out.println("Nam "+year+" la nam nhuan");
        }
        else
                if(kt2){
                    System.out.println("Nam "+year+" la nam nhuan");
                }
                else {
                    System.out.println("Nam "+year+" khong phai nam nhuan");
                }

    }
}
