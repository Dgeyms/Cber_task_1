import java.io.File;
import java.util.Scanner;
import java.io.InputStreamReader; 
import java.io.FileInputStream;
import java.io.IOException;

//public class City{
	//private String name;
	//private String region;
	//private String district;
	//private int population;
	//private int foundation;
	


public class Main{
	public static void main(String [] args)throws IOException{
		
		// String file = "C:/Java project/CberStagirovca/city_ru.csv";
		
		InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Java project\\CberStagirovca\\1task\\city_ru.csv"));
		
		//Scanner scanner = new Scanner(new File (file)); // Scanner для перебора строк
		//scanner.useDelimiter(","); // метод который используется для установки шаблона разграничения
		int i;
		while((i = inputStreamReader.read()) != -1){ //  который возвращает true, если у этого сканера есть другой токен на входе
			System.out.print((char)i);
		}
		
		//scanner.close();
	}
	
	
}