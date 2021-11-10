package heranca;

public class Funcionario {
	protected String nome = "Maria";
	protected long cpf = 123456789;
	protected double salario = 10000.00;
	
	public String trabalhar() {
		return "trabalhando";
	}
	
	public double calcularBonus() {
		return this.salario*2;
	}
}
