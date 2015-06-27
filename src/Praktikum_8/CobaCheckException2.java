package Praktikum_8;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaCheckException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream file = new FileInputStream("c:/coba.txt");
			file.close();
		} catch (FileNotFoundException e){
			System.out.println("FileNotFoundException terjadi");
		} catch (IOException e){
			System.out.println("IOException terjadi");
		}

	}

}
