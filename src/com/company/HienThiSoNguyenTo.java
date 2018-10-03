package com.company;


public class HienThiSoNguyenTo {

    static int a = 0, count = 0;
    public static void main(String[] args) {
        for(int i = 2; i < 100; i++){
            if(SNT(i)==true){
            System.out.println(i);
            count += 1;
            }
            if (count == 20) break; //hiển thị 20 số nguyên tố đầu
        }
    }
    public static boolean SNT(int n){
        a = 0;
        for(int i = 1; i <= n; i++){
            if(n%i==0) {
                a +=1;
            }
        }
        if (a == 2) {
            return true;
        }
        else return  false;
    }
}
