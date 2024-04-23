package sistemas;

import models.Funcionario;
import models.Jogador;

public class Instanciamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario preparadorFisico = new Funcionario("Roberto",1958, 3500);
		
		Jogador j1 = new Jogador("Yuri Alberto ",2001,1000000,"Atacante", 9, "Corinthians");
		
		System.out.println("Exibindo Jogador!");
		System.out.println(j1.getNome());
		System.out.println(j1.getAnoNascimento());
		System.out.println(j1.posicao);
		System.out.println("---------------------------------");
		System.out.println("Exibindo Funcionario!");
		System.out.println(preparadorFisico.getNome());
		

	}

}
