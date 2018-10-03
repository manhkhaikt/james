package com.company;

import java.util.Scanner;

public class Main {
    static  char tTuc;

    public static void main(String[] args) {

        giaiPhuongTrinhBacHai();
        //tinhDiemTrungBinh();
  }

  public static  void tinhDiemTrungBinh(){
              float dToan, dHoa, dLy;
        float tong, trungbinh;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Điểm Toán:");
            dToan = sc.nextFloat();
            System.out.println("Điểm Hóa:");
            dHoa = sc.nextFloat();
            System.out.println("Điểm Lý:");
            dLy = sc.nextFloat();
            tong = dToan + dHoa + dLy;
            trungbinh = tong / 3;
            if (dToan>10||dToan<0||dLy>10||dLy<0||dHoa>10||dHoa<0) {
                tTuc = 'y';
            } else {
                System.out.println("Tổng các môn là:" + tong);
                System.out.println("Trung bình các môn học là" + trungbinh);
                tTuc='n';
            }
            if (tTuc == 'y') {
                System.out.println("Nhập điểm sai yêu cầu nhập lại điểm");
            }
            else{
            System.out.println("Nhập 'y' để tiếp tục");
            System.out.println("Nhập bất kì phím nào để thoát");
            tTuc=sc.next().charAt(0);
        }
        }
        while (tTuc == 'y');
  }

  public static void giaiPhuongTrinhBacHai(){
      float a, b, c;

      Scanner sc=new Scanner(System.in);

      System.out.println("Nhap a");
      a = sc.nextFloat();
      System.out.println("Nhap b");
      b = sc.nextFloat();
      System.out.println("Nhap c");
      c = sc.nextFloat();
      float delta= (float) (Math.pow(b,2)-4*a*c);
      float x1,x2;

      if(a==0){
          if(b==0){
              System.out.println("Phuong trinh vo nghiem");}
          else if(c==0){
              System.out.println("Phuong trinh vo so nghiem");
          }
          else
          {
              x1=x2=-c/b;
              System.out.println("Nghiem cua phuong trinh la :"+x1);
          }
      }
      else{
          if(b==0){
              x1 = -b/a;
              x2 = b/a;
              System.out.println("Phuong trinh co nghiem la x1 ="+x1+"x2 ="+x2);
          }
          else {
              if (delta > 0) {
                  x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                  x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                  System.out.println("Phuong trinh co nghiem la x1 =" + x1 + "x2 =" + x2);
              }
              else {
                  if (delta == 0) {
                      x1 = x2 = -b / (2 * a);
                      System.out.println("Nghiem cua phuong trinh la :" + x1);
                  }
                  else System.out.println("Phuong trinh vo nghiem");
              }
          }
      }
  }
}