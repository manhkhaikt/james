package com.company;

import java.util.Scanner;

public class DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi :");
        String chuoi;
        chuoi = sc.nextLine();

        boolean z = true;
        String n;
        int count = 0;
        while (z == true) {

            System.out.println("Nhap kí tu can so sanh :");
            n = sc.next();
            n.toCharArray();
            if (n.length() > 1){
                System.out.println("Yeu cau nhap 1 ki tu");
            }
            else {
                z = false;
            }
            chuoi.toCharArray();
            for (int i =0; i < chuoi.length(); i++){
                if (chuoi.charAt(i) == n.charAt(0)){
                    count += 1;

                }
            }
            System.out.println("So luan ki tu "+n.charAt(0)+"Xuat hien la :"+count);
            z = false;
        }



    }
}
