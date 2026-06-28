package exercicio_03;

public class NotificacaoEmail extends Notificacao {

	@Override
    public void enviar (String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("Enviando Email: " + mensagem);
	}
}
