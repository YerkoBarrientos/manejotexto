package yerko.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Procesador {
	
	File archivo = new File("src/Estracto");
	
	FileReader lector;
	FileWriter escritor;
	BufferedReader Blector;
	BufferedWriter Bescritor;
	
	String linea_aux;
	
	public Procesador(){
		
		leerArchivo();
	}
	
	public void leerArchivo(){
		try {
			lector = new FileReader(archivo);
			Blector = new BufferedReader(lector);
			
			linea_aux = Blector.readLine();
			
			while(linea_aux != null){
				System.out.println(linea_aux);
				linea_aux = Blector.readLine();
				
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
