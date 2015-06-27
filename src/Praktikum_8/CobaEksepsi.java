package Praktikum_8;

public class CobaEksepsi {

	public static void cobaMetode(int i){
		if(i>=0){
			throw new CobaRuntimeException();
		}
		System.out.println("Nilal i  = "+i);
	}
	
	public static void cobaMetodeDua(int i) throws CobaRuntimeException2 {
		if(i>=0){
			throw new CobaRuntimeException2();
		}
		System.out.println("Nilal i  = "+i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			cobaMetode(-2);
			cobaMetodeDua(3);
		} catch (CobaRuntimeException e){
			System.out.print(e.getMessage());
		} catch (CobaRuntimeException2 e){
			System.out.println(e.getMessage());
		}

	}

}
