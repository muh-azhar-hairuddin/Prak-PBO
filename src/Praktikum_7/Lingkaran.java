package Praktikum_7;

public class Lingkaran implements BentukLuas, BentukKeliling {
	public static final double PHI = 3.14;
	private double jariJari;

	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	
	public void tulis(){
		System.out.println("Lingkaran");
	}
	
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return 2*PHI*jariJari;
	}

	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return PHI*Math.pow(jariJari, 2);
	}

}
