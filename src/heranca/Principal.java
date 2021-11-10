package heranca;

public class Principal {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		Operador operador = new Operador();
		
		/*
		System.out.println(gerente.nome);
		System.out.println(gerente.cpf);
		System.out.println(gerente.salario);
		*/
		
		//System.out.println(gerente.trabalhar());
		
		System.out.println("O calcularBonus do gerente é: " + gerente.calcularBonus());
		System.out.println("O calcularBonus do operador é: " + operador.calcularBonus());
		
	}
}
