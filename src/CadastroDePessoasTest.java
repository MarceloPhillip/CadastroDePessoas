import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CadastroDePessoasTest {

	private CadastroDePessoas cadastro;
	private String NOME = "João";
	private String CPF = "000000000000";
	
	@Before
	public void CriaCadastro(){
		this.cadastro = new CadastroDePessoas();
	}
	
	@Test
	public void cadastroPessoaSimple() {
		this.cadastro.cadastrarPessoa(new CadastroSimples(), NOME, CPF);
		assertEquals("Nome: " + NOME + "\nCPF: " + CPF + "\nTipo de cadastro: " + "simples" , cadastro.getPessoas(0));
	}
	
	@Test
	public void cadastroPessoaEspecial(){
		this.cadastro.cadastrarPessoa(new CadastroEspecial(), NOME, CPF);
		assertEquals("Nome: " + NOME + "\nCPF: " + CPF + "\nTipo de cadastro: " + "especiall" , cadastro.getPessoas(0));
	}
	

}
