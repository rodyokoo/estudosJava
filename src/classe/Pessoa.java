package classe;

public class Pessoa {
	double peso;
	String nome;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	String pesoInicial() {
		return String.format("%s pesa %.2f kg %n", nome, peso);
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
}
