package Praktikum_8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CobaThrows {
	public static void cobaMetode() throws FileNotFoundException, ParseException {
		SimpleDateFormat.getInstance().parse("1234");
		FileInputStream file =  new FileInputStream("c:/coba.txt");
		
	}
	
	public static void cobaMetodeDua(){
		try{
			cobaMetode();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		} catch (ParseException e) {
			System.out.println("ParseException terjadi");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cobaMetodeDua();

	}

}
