package projeto_banco;

public class ClassePrincipal {

	public static void main(String[] args) {
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		funcionario.setAtributoNomeFuncionario("Matheus");
		funcionario.setAtributoSalarioFuncionario(2000.00);
		System.out.println("Fim!!");
		ClasseSQL sql= new ClasseSQL();
		sql.salvarDados(funcionario);

	}

}
