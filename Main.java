import java.io.File;
import java.util.Scanner;
import java.io.InputStreamReader; 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;


public class Main{
	public static void main(String [] args)throws FileNotFoundException{
		
		File file = new File ("city_ru.csv");
	    // связываем scanner с файлом
		Scanner scanner = new Scanner(file); 

			while(scanner.hasNextLine()){
				String[] words = scanner.nextLine().split(",");
					
					System.out.println("City{" + "name=" + words[1] + ", region=" + words[2] + ", district=" + words[3] +
					 ", population=" + words[4] + ", foundation=" + words[5]);

		scanner.close();
	}
}
/* class City{
	private String name;
	public getName(){
		return name;
	}
	private String region;
	private String district;
	private int population;
	private String foundation;
} */