package classe;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Rodrigo", 100);
		System.out.printf(pessoa.pesoInicial());
		
		Comida comida1 = new Comida("macarrão", 0.5);
		Comida comida2 = new Comida("bife", 0.85);
		
		System.out.printf("%s comeu %s", pessoa.nome, comida1.cardapio());
		System.out.println();
		pessoa.comer(comida1);
		System.out.printf(pessoa.pesoInicial());
		System.out.printf("%s comeu %s", pessoa.nome, comida2.cardapio());
		System.out.println();
		pessoa.comer(comida2);
		System.out.printf(pessoa.pesoInicial());
		
		//pessoa.peso += comida1.peso + comida2.peso;
	}
}
