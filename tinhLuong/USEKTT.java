package tinhLuong;

public class USEKTT {
	public static void main(String[] args) {
//		var ep = new KTTaxiNETMYMORK();
//		ep.setVatLieu("TAXI 4 chỗ");
//		ep.vatlieu = "TAXI 7 Chỗ";
//		ep.createNewDinhLuong(200000);
//		var vatlieu = ep.getVatLieu();
//		System.out.println("vatlieu: " + vatlieu);
//		System.out.println("dinh luong: " + ep.getDinhLuong());
		var ep =  new LuongGradBike();
		ep.Luongtimes();
		ep.Luongchaythem();
		ep.tongGia();
		
		
		var tongGia = ep.tongGia();
		var Luongtimes =  ep.Luongtimes();
		System.out.println("luong la: " + Luongtimes);
		System.out.println(" tong luong la: " + tongGia);
	}
}
