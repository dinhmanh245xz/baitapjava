package baitinhtong;

import java.util.Scanner;

public class tinhtong {

	public static void main(String[] args) {
	 //khai bao kieu in bien a,b
		int a = 0,b;
		
		
     Scanner sc = new Scanner(System.in);
    do { 
     //nhap gia tri b tu ban phim
     System.out.println("nhap gia tri can tinh:");
     b = sc.nextInt();
         a+=b; 
       if(a >100)
    	   break;
    }while(a<100);
     //in ra ket qua
     System.out.println("tong:" + a );
	}

}