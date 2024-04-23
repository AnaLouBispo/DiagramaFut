package models;

public class Tecnico extends Funcionario implements Contratacao {
	
	public String titulos;
	public String time;

	public Tecnico(String nome, int anoNascimento, double salario, String titulos, String time) {
		super(nome, anoNascimento, salario);
		this.titulos = titulos;
		this.time = time;
	}
	
	@Override
	public void assinarContrato() {
		// TODO Auto-generated method stub
		System.out.println("Técnico Contratado!! ");
		
	}
	@Override
	public void coletivaImprensa() {
		// TODO Auto-generated method stub
		System.out.println("Técnico na Coletiva");
	}

	public void ensinar() {
		System.out.println("Ensinando!!");
	}

	public void escalacao() {
		System.out.println("Escalando!!");
	}

}
