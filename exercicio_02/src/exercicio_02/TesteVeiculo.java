package exercicio_02;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		 aceleracaoValida();
	     aceleracaoInvalida();
	     bateriaInsuficiente();
	
}
	static void aceleracaoValida() {
			System.out.println("\n*****************************************************************");
			System.out.println("                             TESTE VÁLIDO                           ");
			System.out.println("*****************************************************************\n");
			
			try {
	            CarroEletrico carro = new CarroEletrico("Tesla Model 3", 0, 20);
	            carro.visualizar();
	            carro.acelerar(30);

	            System.out.println("\nDepois da aceleração: \n");
	            carro.visualizar();

	        } catch (Exception e) {
	            System.err.println("Erro: " + e.getMessage());
	        }
	    }
		
		static void aceleracaoInvalida() {
			System.out.println("\n*****************************************************************");
			System.out.println("                      ACELERAÇÃO INVÁLIDA                           ");
			System.out.println("*****************************************************************\n");
			
			try {
	            CarroEletrico carro = new CarroEletrico("Tesla Model 3", 0, 20);
	            carro.acelerar(-10);

	        } catch (Exception e) {
	            System.err.println("Erro: " + e.getMessage());
	        }
	    }
		
		static void bateriaInsuficiente() {
			System.out.println("\n*****************************************************************");
			System.out.println("                         BATERIA INSUFICIENTE                        ");
			System.out.println("*****************************************************************\n");
			
			 try {
		            CarroEletrico carro = new CarroEletrico("Tesla Model 3", 0, 0);
		            carro.acelerar(30);

		        } catch (Exception e) {
		            System.err.println("Erro: " + e.getMessage());
		  }
	}
}