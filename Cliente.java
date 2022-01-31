
import java.util.Scanner;
public class Cliente {
	
	private String cliente;
	private String endereco;
	private String telefone;
	
	
	
	public Cliente (String cliente, String endereco, String telefone) {
		this.cliente = cliente;
		this.endereco = endereco;
		this.telefone = telefone;
			
		
	}
	
	public void imprimirinfo() {
		
		System.out.println("Cliente: "+cliente);
		System.out.println("Endereço: "+endereco);
		System.out.println("Telefone para contato: "+telefone);	
		
	}
	
	public void dados() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o nome do Cliente");
		cliente = leia.next();
		System.out.println("Insira o endereço do Cliente");
		endereco = leia.next();
		System.out.println("Insira o telefone de contato do Cliente");
		telefone = leia.next();
		
		
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
