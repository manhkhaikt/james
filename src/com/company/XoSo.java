package com.company;

import java.util.Random;
import java.util.Scanner;



public class XoSo {
    static boolean giaiDocDac;
    static boolean giaiNhi;
    static boolean giaiBa;

    public static void main(String[] args) {
        xoso();
    }
    public static void xoso(){
        int lottery = 00;
        int guessDigit1, guessDigit2;
        Random rd = new Random();
        lottery = rd.nextInt(99);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so may man thu 1 cua ban :");
        guessDigit1 = sc.nextInt();
        System.out.println("Nhap so may man thu 2 cua ban:");
        guessDigit2 = sc.nextInt();
        int lottery2 = lottery%10 + lottery/10;

        giaiDocDac = (guessDigit1*10+guessDigit2)==lottery;
        giaiNhi = (guessDigit1*10+guessDigit2)==lottery2;
        giaiBa = false;
        if(guessDigit1==lottery/10||guessDigit1==lottery%10||guessDigit2==lottery/10||guessDigit2==lottery%10){
            giaiBa = true;
        }

        if(giaiDocDac){
            System.out.println("Ban da trung giai doc dac!! \n Phan thuong cua ban la 10000$");
        }
        else{
            if (giaiNhi) {
                System.out.println("Ban da trung gai nhi!!\n Phan thuong cua ban la 3000$");
            }
            else{
                if (giaiBa){
                    System.out.println("Ban da trung giai ba!! \n Phan thuong cua ban la 1000$");
                }
                else System.out.println("Chuc ban may man lan sau!!");
            }
        }

        //char[] stt = String.valueOf(lottery).toCharArray();
    }

    }
