package Exercícios;

public class CachorroAbs extends ClasseAbs {

	public CachorroAbs() {

		super("Cachorro");
	}

	@Override
	public void som(double quantidade) {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("O " + getEspecie() + " faz au au au au au au!!!\n");
		}
	}

}