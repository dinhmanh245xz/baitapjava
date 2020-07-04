package baitinhtong;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
	 //khai bao kieu in bien a,b
		int a,b;
		
     Scanner sc = new Scanner(System.in);
     //nhap gia tri a tu ban phim
     System.out.println("nhap gia tri a :");
     a = sc.nextInt();
     //nhap gia tri b tu ban phim
     System.out.println("nhap gia tri b:");
     b = sc.nextInt();
       //khai bao c
     int c = a+b;
     //in ra ket qua
     System.out.println("tong:" + a + "+" + b + "=" + c);
	}

}

