package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Method {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bai tap chuoi Pentagonal");
        int n;
        System.out.println("Nhap so n");

        n = scan.nextInt();
        System.out.println("Chuoi Pentagonal: ");
        Pentagonal(n);

        System.out.println("------------------------------");

        System.out.println("Bai tap tong cac phan tu trong 1 so");
        System.out.println("Nhap so nguyen: ");
        int x = scan.nextInt();
        System.out.println("Tong cac so trong so nguyen la: ");
        System.out.println(sumDigits(x));

        System.out.println("-------------------------------------");

        System.out.println("Bai tap sao xep 3 so thuc");
        System.out.println("Nhap 3 so thuc");
        double n1, n2, n3;
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        System.out.println("sap xep 3 so: ");
        displaySortedNumbers(n1, n2, n3);

        System.out.println("\n--------------------------------------");

        System.out.println("Bai tap ve so doi xung");
        System.out.println("Nhap mot so a bat ky: ");
        int a = scan.nextInt();
        System.out.println("So dao nguoc cua so x: " + reverse(a));
        System.out.println("Xet tinh doi xung cua x: " + isPalindrome(a));

        System.out.println("--------------------------------------");

        System.out.println("Bai tap chuyen doi tu feet qua metters");
        System.out.println("Nhap so feet con chuyen: ");
        double feet = scan.nextDouble();
        System.out.println(feet + " feet = " + feetToMeter(feet) + " metters");
        System.out.println("Nhap so metters can chuyen: ");
        double metters = scan.nextDouble();
        System.out.println(metters + " metters = " + meterToFeet(metters) + " feet");

        System.out.println("---------------------------------------");

        System.out.println("Kiem tra so nguyen to");
        System.out.println("Nhap mot so can kiem tra: ");
        int soNT=scan.nextInt();
        System.out.println("So vua nhap la so nguyen to: "+isPrime(soNT));

        System.out.println("--------------------------------------");

        System.out.println("Bai tap hien thi ma tran nhi phan");
        System.out.println("Nhap canh cua ma tran");
        int canh=scan.nextInt();
        System.out.println("Ma tran nhi phan "+canh+"x"+canh+" :");
        printMatrix(canh);

        System.out.println("-------------------------------------");

        System.out.println("Bai tap dem so ki tu trong chuoi");
        System.out.println("Nhap vao 1 chuoi");
        String s=scan.nextLine();
        System.out.println("So ki tu trong chuoi la: "+countLetters(s));

        System.out.println("----------------------------------------");

        System.out.println("Bai tap dem so ngay tu nam XXXX den nam YYYY ");
        System.out.println("Nhap nam thu 1: ");
        int year1=scan.nextInt();
        System.out.println("Nhap nam thu 2: ");
        int year2= scan.nextInt();
        System.out.println("So ngay trong khoang thoi gian tu nam "+year1+" den nam "+year2+" la: "+countNumberOfDaysInYeartoYear(year1,year2)+" ngay");

        System.out.println("--------------------------------------------");
    }

    public static void Pentagonal(int x) {
        int pen;
        for (int i = 1; i < x; i++) {
            pen = i * (3 * i - 1) / 2;
            System.out.print(pen + ", ");
        }
        System.out.println(x * (x * 3 - 1) / 2);
    }

    public static long sumDigits(long n) {
        int count = 0;
        while (n > 0) {
            count += n % 10;
            n = n / 10;
        }
        return count;
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {

        double temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print(num1 + ",");
        System.out.print(num2 + ",");
        System.out.print(num3);
    }

    public static int reverse(int number) {
        int count = 0;
        while (number > 0) {
            count = count * 10 + number % 10;
            number /= 10;
        }
        return count;
    }

    public static boolean isPalindrome(int number) {
        if (reverse(number) == number) return true;
        else return false;
    }

    public static double feetToMeter(double feet) {
        return 0.305 * feet;
    }

    public static double meterToFeet(double meter) {
        return meter * 3.279;
    }

    public static boolean isPrime(int number){
        int count=0;
        for (int i=1;i<Math.sqrt(number);i++){
            if (number%i==0){
                count+=1;
            }
        }
        if (count==1) return true;
        else return false ;
    }

    public static void printMatrix(int n){
        int[][] matrix=new int[n][n];
        Random rand = new Random();
        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j]=rand.nextInt(2);
            }
        }
        for (int i=0;i<matrix.length;i++)
        System.out.println(Arrays.toString(matrix[i]));
    }

    public static int countLetters(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            count+=1;
        }

        return count;
    }
    public static boolean ktNamNhuan(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        else{
            if (year % 400 == 0 && year % 100 == 0) {
                return true;
            }
            else {
                return false;
            }
        }

    }
    public static int numberOfDaysInAYear(int year){
        int day;
        if (ktNamNhuan(year)){
            day=366;
        }
        else day=365;

        return day;
    }

    public static int countNumberOfDaysInYeartoYear(int year1, int year2){
        int count=0;
        for (int i=year1;i<=year2;i++){
            count+=numberOfDaysInAYear(i);
        }

        return count;
    }

}
