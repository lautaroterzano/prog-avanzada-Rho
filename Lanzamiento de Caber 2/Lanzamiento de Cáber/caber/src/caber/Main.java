package caber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Torneo t1 = new Torneo();
		ArrayList<Concursante> concursantes = new ArrayList<Concursante>();
		ArrayList<Lanzamiento> lanzamiento = new ArrayList<Lanzamiento>();

		File f = null;
		FileReader fr = null;
		BufferedReader br =null;
		int numeroInt;
		try{
		f = new File( "concursantes.txt" );
		fr = new FileReader(f);
		br = new BufferedReader(fr);
		Concursante c2 = new Concursante();
		
		String linea;
		while((linea = br.readLine()) != null){/*aca se irian leyendo los concursantes y lanzamientos y se irian agregando 
												a las listas (es un modelo)*/
			
			Concursante c1 = new Concursante();
			Lanzamiento l11 = new Lanzamiento(); 
			Lanzamiento l12 = new Lanzamiento();
			Lanzamiento l13 = new Lanzamiento();
			c1.getLanzamientos().add(l11);
			c1.getLanzamientos().add(l12);
			c1.getLanzamientos().add(l13);
			concursantes.add(c1);
			Concursante c2 = new Concursante();
			Lanzamiento l21 = new Lanzamiento(); 
			Lanzamiento l22 = new Lanzamiento();
			Lanzamiento l23 = new Lanzamiento();
			c1.getLanzamientos().add(l21);
			c1.getLanzamientos().add(l22);
			c1.getLanzamientos().add(l23);
			concursantes.add(c2);
			Concursante c3 = new Concursante();
			Lanzamiento l31 = new Lanzamiento(); 
			Lanzamiento l32 = new Lanzamiento();
			Lanzamiento l33 = new Lanzamiento();
			c1.getLanzamientos().add(l31);
			c1.getLanzamientos().add(l32);
			c1.getLanzamientos().add(l33);
			concursantes.add(c3);
			
			t1.iniciarTorneo(concursantes,lanzamiento);//se inicia el torneo
			
		 
		}
		fr.close();
		 }
		 catch(Exception e){
		 e.printStackTrace();
		 }

		
	}

}
