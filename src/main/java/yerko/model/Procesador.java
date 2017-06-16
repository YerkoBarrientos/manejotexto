package yerko.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Procesador {
	
	FileReader lector;
	FileWriter escritor;
	
	public Procesador(){
	}
	
	public void leerArchivo(){
		try {
			lector = new FileReader("src/Estracto");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
