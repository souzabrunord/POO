package Exerc�cios;

public class Cachorro extends Animal{

	private String racaCachorro;
	

public Cachorro(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String racaCachorro)
{
	super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
	this.racaCachorro = racaCachorro;
}

public void infoCachorro() {
	System.out.print(getNomeAnimal()+" � um cachorro e tem "+getIdadeAnimal()+" anos, ");
	if(isEmiteSom()) {
		System.out.print("emite um latido");
	} else {
		System.out.print("n�o emite som");
	}
	System.out.println(", "+getDeslocamento()+" o tempo todo e � da ra�a "+racaCachorro);
}


public String getRacaCachorro() {
	return racaCachorro;
}

public void setRacaCachorro(String racaCachorro) {
	this.racaCachorro = racaCachorro;
}

}
