package Praktikum_7;

public class BujurSangkar extends Bentuk{

	private float sisi;
	public BujurSangkar() {
		// TODO Auto-generated constructor stub
		sisi = 5;
	}

	@Override
	public float hitungLuas() {
		// TODO Auto-generated method stub
		return sisi*sisi;
	}

	@Override
	public void tulis() {
		// TODO Auto-generated method stub
		System.out.println("Bujur Sangkar");		
	}

}
