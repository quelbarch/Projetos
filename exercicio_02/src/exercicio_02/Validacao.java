package exercicio_02;

public class Validacao {

    public static void validarModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio!");
        }
    }

    public static void validarVelocidade(int velocidade) {
        if (velocidade < 0) {
            throw new IllegalArgumentException("Velocidade não pode ser negativa!");
        }
    }

    public static void validarAceleracao(int valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Aceleração inválida!");
        }
    }

    public static void validarBateria(int bateria) {
        if (bateria < 0 || bateria > 100) {
            throw new IllegalArgumentException("Bateria inválida!");
        }
    }

    public static void validarBateriaSuficiente(int bateria, int consumo) {
        if (bateria <= 0) {
            throw new IllegalStateException("Bateria zerada!");
        }

        if (bateria < consumo) {
            throw new IllegalStateException("Bateria insuficiente para a aceleração!");
        }
    }
}