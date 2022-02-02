package Exerc�cios;

public class Cavalo extends Animal{
	
	private String corCavalo;
	

	public Cavalo(String nomeAnimal, int idadeAnimal, boolean emiteSom, String deslocamento, String corCavalo) 
	{
		
		super(nomeAnimal, idadeAnimal, emiteSom, deslocamento);
		this.corCavalo = corCavalo;
	}

	public void infoCavalo() {
		System.out.print(getNomeAnimal()+" � um cavalo e tem "+getIdadeAnimal()+" anos, ");
		if(isEmiteSom()) {
			System.out.print("emite um relincho");
		} else {
			System.out.print("n�o emite som");
		}
		System.out.println(", "+getDeslocamento()+" o tempo todo e � da cor "+corCavalo);
	}
	

	public String getCorCavalo() {
		return corCavalo;
	}
	public void setCorCavalo(String corCavalo) {
		this.corCavalo = corCavalo;
	}
	
}
