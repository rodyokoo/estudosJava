package classe;

public class Comida {
	double peso;
	String nome;
	Comida(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	String cardapio() {
		return String.format("%s pesando %.3f Kg.", nome, peso);
	}
}
