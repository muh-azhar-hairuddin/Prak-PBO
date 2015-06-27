package Praktikum_8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaCheckException3 {
	public static void main (String args[]){
		try {
			FileInputStream file = new FileInputStream("c:/coba.txt");
			file.close();
		} catch (Exception e){
			System.out.println("Exceptiion terjadi");
			System.out.println(",yang terjadi adalah "+e);
		}
	}

}
