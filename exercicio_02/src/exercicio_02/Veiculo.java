package exercicio_02;

public class Veiculo {

		private String modelo;
		private int velocidade;
		
		public Veiculo(String modelo, int velocidade) {
			this.modelo = modelo;
			this.velocidade = velocidade;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getVelocidade() {
			return velocidade;
		}

		public void setVelocidade(int velocidade) {
			this.velocidade = velocidade;
		}
		
		public void acelerar(int valor) {
			if (valor <= 0) {
			    throw new IllegalArgumentException("Aceleração inválida!");
			}
			
			this.velocidade += valor;
			
      }
   }

