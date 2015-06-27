package Praktikum_6;

public class MobilTest {

	public static void starterMobil(Mobil mobil) {
		// TODO Auto-generated constructor stub
		mobil.starter();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobil sedan = new Sedan();
		Truck truck = new Truck();
		starterMobil(new Mobil());
		starterMobil(sedan);
		starterMobil(truck);

	}

}
