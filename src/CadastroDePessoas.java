import java.util.ArrayList;
import java.util.List;


public class CadastroDePessoas {
	
	private List<String> pessoas;
	
	public CadastroDePessoas() {
		this.pessoas = new ArrayList<String>();
	}
	
	public String getPessoas(int pessoas){
		return this.pessoas.get(pessoas);
	}
	
	public void cadastrarPessoa(Cadastro cadastro, String nome, String CPF){
		this.pessoas.add(cadastro.Cadastro(nome, CPF));
	}
	
}
