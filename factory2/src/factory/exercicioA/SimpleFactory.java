package factory.exercicioA;

public class SimpleFactory {
	
	SimpleFactory(){}
	
	public static Avatar fabricar_personagem (double num) {
		Avatar avatar = new Avatar();
		
		if(num <= 0.2) {
			// tipo1
			avatar.setForca(new StrongAttack()); // ataque forte
			avatar.setSalto(new MediumJump()); // sato medio
			avatar.setVelocidade(new RunMedium()); // lento
		}
		else if (num > 0.2 && num <= 0.4) {
			// tipo 2
			avatar.setForca(new WeakAttack()); // ataque fraco
			avatar.setSalto(new HighJump()); // salto forte
			avatar.setVelocidade(new RunFast()); // rapido
		}
		else if(num > 0.4 && num <= 0.6) {
			// tipo 3
			avatar.setForca(new MediumAttack()); // ataque medio
			avatar.setSalto(new MediumJump()); // salto medio
			avatar.setVelocidade(new RunMedium()); // velocidade normal
		}
		else if(num > 0.6 && num <= 0.8) {
			// tipo 4
			avatar.setForca(new WeakAttack()); // ataque fraco
			avatar.setSalto(new LowJump()); // salto baixo
			avatar.setVelocidade(new RunFast()); // Rapido
		}
		else if(num > 0.8 && num <= 1.0) {
			// tipo 5
			avatar.setForca(new StrongAttack()); // ataque forte
			avatar.setSalto(new HighJump()); // salto forte
			avatar.setVelocidade(new RunFast()); // rapido
		}
		return avatar;
	}
}
