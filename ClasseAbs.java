package Exercícios;

public abstract class ClasseAbs {
	
	private String especie; 

	public ClasseAbs(String especie) {
		this.especie = especie;
	}

	abstract public void som(double quantidade);

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}