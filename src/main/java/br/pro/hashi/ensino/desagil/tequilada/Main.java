package br.pro.hashi.ensino.desagil.tequilada;


public class Main {
	
	public static void main (String[]agrs){
	
		Player humanPlayer;
		
		humanPlayer = new Player();
		
		humanPlayer.row=42;
		humanPlayer.col=24;
		humanPlayer.printPosition();
		
		
		Player cpuPlayer;
		
		cpuPlayer = new Player();
		
		cpuPlayer.row = 99;
		cpuPlayer.col = 1;
		cpuPlayer.printPosition();
		
	System.out.println("Projeto 1");
	
	
	}
}
