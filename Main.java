import java.io.File;
import java.util.Scanner;
import java.io.InputStreamReader; 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;



public class Main{
	public static void main(String [] args)throws FileNotFoundException{
		
		String path = "C://Java project//CberStagirovca//Cber_task_1//city_ru.csv";
		File file = new File (path);
				
		Scanner scanner = new Scanner(file); // Scanner для перебора строк
		
		while(scanner.hasNextLine()){ //  который возвращает true, если у этого сканера есть другой токен на входе
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}
	
	
}