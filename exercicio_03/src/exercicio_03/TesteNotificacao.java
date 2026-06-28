package exercicio_03;

public class TesteNotificacao {

	public static void main(String[] args) {
		
		envioValido();
		mensagemVazia();
		tipoInvalido();
		
	}

	static void envioValido() {
		System.out.println("\n*****************************************************************");
		System.out.println("                             TESTE VÁLIDO                           ");
		System.out.println("*****************************************************************\n");
	
		 try {
	            Notificacao n = criarNotificacao("Email");
	            n.enviar("Bem-vindo ao sistema");

	        } catch (Exception e) {
	            System.err.println("Erro: " + e.getMessage());
	        }
	    }


	static void mensagemVazia() {
		System.out.println("\n*****************************************************************");
		System.out.println("                           MENSAGEM VAZIA                          ");
		System.out.println("*****************************************************************\n");
		
		 try {
	            Notificacao n = criarNotificacao("SMS");
	            n.enviar("");

	        } catch (Exception e) {
	            System.err.println("Erro: " + e.getMessage());
	    }
   }


	static void tipoInvalido() {
		System.out.println("\n*****************************************************************");
		System.out.println("                           TIPO INVÁLIDO                           ");
		System.out.println("*****************************************************************\n");

         try {
        	 Notificacao n = criarNotificacao("Push");
        	 n.enviar("Teste");
        	 
         } catch (Exception e) {
        	 System.err.println("Erro: " + e.getMessage());
      }
   }
	
	public static Notificacao criarNotificacao(String tipo) {

	    if (tipo == null) {
	        throw new IllegalArgumentException("Tipo não pode ser nulo!");
	    }

	    if (tipo.equalsIgnoreCase("Email")) {
	        return new NotificacaoEmail();

	    } else if (tipo.equalsIgnoreCase("SMS")) {
	        return new NotificacaoSMS();

	    } else {
	        throw new IllegalArgumentException("Tipo de notificação inválido!");
	    }
	}
}