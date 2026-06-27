package exercicio_02;

public class Veiculo {

		private String modelo;
		private int velocidade;
		
		public Veiculo(String modelo, int velocidade) {
			
			Validacao.validarModelo(modelo);
			Validacao.validarVelocidade(velocidade);
			
			this.modelo = modelo;
			this.velocidade = velocidade;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			Validacao.validarModelo(modelo);
			this.modelo = modelo;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			Validacao.validarVelocidade(velocidade);
			this.velocidade = velocidade;
		}
		
		public void acelerar(int valor) {
		
			Validacao.validarAceleracao(valor);
			
			this.velocidade += valor;
			
      }

		public void visualizar() {
			System.out.println("Modelo: " + modelo + " | Velocidade: " + velocidade + " km/h");
			
		}
   }
