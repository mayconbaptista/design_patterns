package factory.exercicioA;

import java.util.*;

public class Main {
	public static void main (String [] args) {
		
		ArrayList <Avatar> lista = new ArrayList <Avatar> ();
		
		SimpleFactory fabrica = new SimpleFactory();
		
		for(int i = 1; i <= 5; i++) {
			lista.add(fabrica.fabricar_personagem(Math.random()));
		}
		
		for(Avatar personagem : lista) {
			System.out.println("\n\n\nCaracteristicas do personagem");
			personagem.getForce().attacking();
			personagem.getSalto().jumping();
			personagem.getVelocidade().running();
		}
	}
}
