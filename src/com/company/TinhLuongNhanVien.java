package com.company;

import java.util.Scanner;

public class TinhLuongNhanVien {

    public static void main(String[] args) {

        int luongThang,hsl,soNamLamViec;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so luong cua nhan vien :");
        hsl = sc.nextInt();
        System.out.println("Nhap so nam nhan vien lam cho cong ty");
        soNamLamViec = sc.nextInt();

        luongThang = hsl * 4000000 + soNamLamViec * 500000;
        System.out.println("Luong hang thang cua nhan vien :"+luongThang);

    }
}
