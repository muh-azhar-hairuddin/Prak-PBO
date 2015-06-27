package Praktikum_6;

public class Mobil {
	public Rangka rangka;
	public Mesin mesin;
	private int nomor;
	protected String nama;

	public Mobil() {
		// TODO Auto-generated constructor stub
		rangka = new Rangka();
		mesin = new Mesin();
		System.out.println("Kontruktor Mobil");
	}

	public void starter(){
		System.out.println("Starter Mobil");
	}

}
