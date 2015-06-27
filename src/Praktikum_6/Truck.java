package Praktikum_6;


public class Truck extends Mobil {
	
	public Truck() {
		// TODO Auto-generated constructor stub
	}
	
	public void tongkang(){
		Mesin mesin = new Mesin();
		
		starter();
		System.out.println("Tongkakang");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck();
		truck.tongkang();
	}
	
	public void starter(){
		System.out.println("Starter Truck");
	}

}
