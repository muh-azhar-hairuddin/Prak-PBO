package Praktikum_8;

import java.io.IOException;
public class CobaThrows2 {
	public static void cobaMetode() throws IOException {
		throw new IOException();
	}
	public static void cobaMetodeDua() throws IOException {
		try {
			cobaMetode();
		} catch (IOException e){
			throw e;
		}
	}
	public static void cobaMetodeTiga(){
		throw new IndexOutOfBoundsException();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			cobaMetodeDua();
		} catch (IOException e) {
			System.out.print("IOException terjadi");
		}

	}

}
