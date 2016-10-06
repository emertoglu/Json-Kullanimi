package deneme;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class jsonOku {
	
	public static void main(String[] args) throws IOException {

		File file = new File("/home/aspa/workspace/deneme/src/deneme/json.txt");
        BufferedReader reader = null;
        
        try {
			reader = new BufferedReader(new FileReader(file));
			String satir = reader.readLine();
			while (satir!=null) {
                System.out.println(satir);
                satir = reader.readLine();
            }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
 
            
	
	}

}
