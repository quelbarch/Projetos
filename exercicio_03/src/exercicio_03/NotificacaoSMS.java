package exercicio_03;

public class NotificacaoSMS extends Notificacao {

	@Override
    public void enviar (String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("Enviando SMS: " + mensagem);
	}
}
