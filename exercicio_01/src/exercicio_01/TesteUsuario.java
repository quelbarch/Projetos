package exercicio_01;

public class TesteUsuario {

	public static void main(String[] args) {
		
		usuarioValido();
		administradorValido();
		nomeVazio();
		emailInvalido();
		
	}
		static void usuarioValido() {
				System.out.println("\n *****************************************************************");
				System.out.println("\n                           USUÁRIO VÁLIDO                         ");
				System.out.println("\n *****************************************************************");
				
				try {
					Usuario u1 = new Usuario("Raquel", "raquel@empresa.com");
					u1.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
			}
			
			static void administradorValido() {
				System.out.println("\n *****************************************************************");
				System.out.println("\n                   ADMINISTRADOR VÁLIDO                           ");
				System.out.println("\n *****************************************************************");
				
				try {
					Administrador adm = new Administrador("Jonas", "jonas@empresa.com", "1");
					adm.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
			}
			
			static void nomeVazio() {
				System.out.println("\n *****************************************************************");
				System.out.println("\n                          NOME VAZIO                              ");
				System.out.println("\n *****************************************************************");
				
				try {
					Administrador adm = new Administrador("", "jonas@empresa.com", "1");
					adm.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
				}
				
			}
			
			static void emailInvalido() {
				System.out.println("\n *****************************************************************");
				System.out.println("\n                          E-MAIL INVÁLIDO                         ");
				System.out.println("\n *****************************************************************");
				
				try {
					Administrador adm = new Administrador("Armando", "armandoempresa.com", "1");
					adm.visualizar();
				} catch (Exception e) {
					System.err.println("Erro: " + e.getMessage());
		  }
				
	  }
 }