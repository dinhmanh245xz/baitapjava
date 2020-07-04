package baitinhtong;

import java.util.Scanner;

public class giaithua {

	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so can tinh:");
		n = sc.nextInt();
		tinhGiaithua(n);
    }
	public static void tinhGiaithua(int n) { 
	 int kq = 1;
	 for(int i = 1; i <= n; i++)kq = kq *i;
	 System.out.println("giai thua ket qua la :" +kq);
  }	       
}