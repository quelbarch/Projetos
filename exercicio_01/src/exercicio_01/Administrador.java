package exercicio_01;

public class Administrador extends Usuario{
	
	private String nivelAcesso;

	public Administrador(String nome, String email, String nivelAcesso) {
		super(nome, email);
		this.nivelAcesso = nivelAcesso;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	@Override
	public String descricao() {
		return super.descricao() + " | Nível de Acesso: " + this.nivelAcesso;
		
	}
}
