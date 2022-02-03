package Exercícios;

public class PreguicaAbs extends ClasseAbs {

	public PreguicaAbs() {

		super("Preguica");
	}

	@Override
	public void som(double quantidade) {

		for (int i = 0; i < quantidade; i++) {
			System.out.println("A " + getEspecie() + " grune!!!\n");
		}
	}

}