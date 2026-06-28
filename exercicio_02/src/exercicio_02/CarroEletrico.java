package exercicio_02;

public class CarroEletrico extends Veiculo {

	private int nivelBateria;
	
	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		
		Validacao.validarBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		Validacao.validarBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}
	
	@Override
    public void acelerar(int valor) {

        Validacao.validarAceleracao(valor);
        
        int consumo = Math.max(1, valor / 3);
        
        Validacao.validarBateriaSuficiente(nivelBateria, consumo);
        setVelocidade(getVelocidade() + valor);

        nivelBateria -= consumo;
        
    }

    @Override
    public void visualizar() {
        System.out.println("Modelo: " + getModelo() + " | Velocidade: " + getVelocidade() + " km/h | Bateria: " + nivelBateria + "%");
        
    }
}