package br.pro.hashi.ensino.desagil.tequilada;
import java.io.*;

public class Reder_labirinto {
	public static void main (String[]args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("labirinto.txt"));
			while(br.ready()){
				String linha = br.readLine();
				char[] linhaX = linha.toCharArray();
				
				for(int i=0; i < linhaX.length; i++ ){
					if (linhaX[i] == '#'){
						linhaX[i] = 'X';
						
					}
				}
				System.out.println(linhaX);
			}
			br.close();
		}
			catch(IOException ioe){
			ioe.printStackTrace();
	} 
  } 
}
	


