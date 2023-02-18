package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try
		{
			File f = new File("C:\\Users\\Dell\\Desktop\\Test.txt");
			FileReader fr = new FileReader(f);
			
			int temp =0;
			
			while( (temp= fr.read()) != -1 ) {
				System.out.print((char)temp);
				
			}			
			
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe);
			fe.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
}
