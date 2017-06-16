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
		
		
		//letraRepetida('a');
		escribirArchivo();
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
	
	public void letraRepetida(char letra){
		

		long inicio = System.nanoTime();
		
		String linea;
		int cuenta = 0;
		
		
		try {
			
			lector = new FileReader(archivo);
			Blector = new BufferedReader(lector);
			
			while((linea = Blector.readLine()) != null){
				for (int i = 0; i < linea.length(); i++) {
					if(linea.charAt(i)!=letra){
						cuenta++;
					}
						
				}
			}

			System.out.println("Veces repetida: "+cuenta);
			long fin = System.nanoTime();
			System.out.println("Tiempo para buscar letra: "+(fin-inicio)/100000+"ms");

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally{
			
			try {lector.close();}
			
			catch (IOException e) {
				System.out.println("No se pudo cerrar el lector");
				e.getMessage();
				e.getStackTrace();
				
			}
		}
		
	}

	public void escribirArchivo(){
		
		try {
			escritor = new FileWriter(archivo, true);
			Bescritor = new BufferedWriter(escritor);
			
			Bescritor.newLine();
			Bescritor.write("Pruebaaaaaaaaaa");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
