package Praktikum_7;

public class CobaBentuk {

	public static void cetakBangun(Bentuk b) {
		// TODO Auto-generated constructor stub
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cetakBangun(new BujurSangkar());
		cetakBangun(new SegitigaSamaKaki());
		cetakBangun(new SegitigaSamaSisi());

	}

}
