package Praktikum_6;

public class Sedan extends Mobil{
	public String nama;
	public Sedan() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public Sedan(String nama) {
		super(nama);
	}
	
	public void cetak(String nama){
		super.nama = nama;
		this.nama = "Sedan Lokal";
		System.out .println(nama);
		System.out.println(this.nama);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan();
		sedan.cetak("Sedan");

	}
	
	public void starter(){
		System.out.println("Starter Sedan");
	}

}
