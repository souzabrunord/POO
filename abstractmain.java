package Exercícios;

import java.util.Scanner;

public class abstractmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		CachorroAbs dog = new CachorroAbs();
		CavaloAbs cav = new CavaloAbs();
		PreguicaAbs preg = new PreguicaAbs();
		
		ClasseAbs animais = null;
		
		int opc;
		
		do {
			
			System.out.println("Escolha um animal:\n1-Cachorro\n2-Cavalo\n3-Preguiça");
			opc = leia.nextInt();
			switch(opc) {
			case 1: animais = dog; break;
			case 2: animais = cav; break;
			case 3: animais = preg; break;
			default: System.out.println("Opção inválida!");
			}
			
			if(animais != null)
			{
				animais.som((Math.random() * 3.0));
			}
			 
			}
			while (opc < 3 || opc > 1);
	
	}
	}

