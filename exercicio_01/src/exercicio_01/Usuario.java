package exercicio_01;

public class Usuario {
	
	//Atributos//
	private String nome;
	private String email;
	
	//Construtor//
	public Usuario(String nome, String email) {
		
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		
		this.nome = nome;
		this.email = email;
	}
	
	//Get e set pra visualizar//
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		Validacao.validarNome(nome);
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		Validacao.validarEmail(email);
		this.email = email;
	}

	//Metodo que retorna os dados//
	public String descricao() {
		return "Nome: " + this.nome + " | Email: " + this.email;
		
	}
	
	public void visualizar() {
		System.out.println(descricao());
	}
	
}
