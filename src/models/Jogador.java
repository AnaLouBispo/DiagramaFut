package models;

public class Jogador extends Funcionario implements Contratacao {

	public String posicao;
	public int numeroCamisa;
	public String time;

	public Jogador(String nome, int anoNascimento, double salario, String posicao, int numeroCamisa, String time) {
		super(nome, anoNascimento, salario);
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
		this.time = time;
	}

	@Override
	public void assinarContrato() {

		System.out.println("Jogador Contratado!!");

	}

	@Override 
	public void coletivaImprensa() {

		System.out.println("Jogador na Coletiva!!");
	}

	public void correr() {

	}

	public void chutar() {

	}

	public void defender() {

	}
}
