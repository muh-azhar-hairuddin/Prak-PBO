package Praktikum_6;

public class Rangka {
	private Ban ban;
	public Rangka() {
		// TODO Auto-generated constructor stub
		ban = new Ban();
		System.out.println("Kontruktor Rangka");
		
	}

}
class Ban {
	public Ban(){
		System.out.println("Kontruktor Ban");
	}
}
