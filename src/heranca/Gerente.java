package heranca;

public class Gerente extends Funcionario {
	private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    // Sobreescrita de métodos
    public double calcularBonus() {
    	return this.salario * 3;
    }
}
