package Praktikum_7;

public class Lingkaran2 implements HitungKeliling, HitungLuas{
	public static final double PHI = 3.14;
	private double jariJari;
	public Lingkaran2 (double jariJari){
		this.jariJari = jariJari;
	}
	@Override
	public void tulis() {
		// TODO Auto-generated method stub
		System.out.println("Lingkaran");
		
	}
	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return 2*PHI*jariJari;
	}
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return PHI*Math.pow(jariJari, 2);
	}

}
