package exercicio_03;

public class Validacao {

	public static void validarMensagem(String mensagem) {
		if (mensagem == null || mensagem.trim().isEmpty()) {
            throw new IllegalArgumentException("Mensagem não pode estar vazia!");
        }
    }

}
