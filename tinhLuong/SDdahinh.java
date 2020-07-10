package tinhLuong;

public class SDdahinh {
     public static void main(String[] args) {
    	 LuongGradBike  GradBike = new LuongGradBike();
    	       System.out.println("Tong Gia Bike = " + GradBike.tongGia());

    	  GradBike = new GOViet();
    			System.out.println("Tong tien kiem dc Bike " + GradBike.tongGia());
    	
    			LuongGradCar GradCar = new LuongGradCar();
    			     System.out.println("Tong Gia Car = " + GradCar.tongGiaCar());
    	  GradCar  = new Taxi123();
    	            System.out.println("Tong Gia kiem dc  Car" + GradCar.tongGiaCar()); 
   }
}