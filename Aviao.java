import java.util.Scanner;

public class Aviao {

	private int total;
	private int ocupados;
	private int restantes;
	
	
	public Aviao (int total, int ocupados, int restantes) {
		
		this.total = total;
		this.ocupados = ocupados;
		this.restantes = restantes;
		
	}
	
	public void dados() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o total de assentos do avi�o: ");
		total = leia.nextInt();
		System.out.println("Entre com o total de ocupados do avi�o: ");
		ocupados = leia.nextInt();
		
		restantes = total - ocupados;
		
	}
	
	public void imprimir() {
	
		System.out.println("O avi�o tem um total de "+total+" assentos dispon�veis, sendo "+ocupados+" ocupados e "+restantes+" assentos restantes dispon�veis");
		
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getOcupados() {
		return ocupados;
	}

	public void setOcupados(int ocupados) {
		this.ocupados = ocupados;
	}

	public int getRestantes() {
		return restantes;
	}

	public void setRestantes(int restantes) {
		this.restantes = restantes;
	}

	
}


