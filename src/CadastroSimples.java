
public class CadastroSimples implements Cadastro {

	@Override
	public String Cadastro(String nome, String CPF) {
		String resultado = "";
		resultado += "Nome: " + nome + "\nCPF: " + CPF + "\nTipo de cadastro: " + "simples";
		return resultado;
	}

}
