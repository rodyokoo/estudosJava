package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(String nomeInicial, double precoInicial){	
		nome = nomeInicial;
		preco = precoInicial;
	}
	Produto(){	
	}
	
	String ProdutoDesconto() {
		double resultado = (preco * (1 - desconto));
		return nome + ": R$ " + String.format("%.2f", resultado);
	}
	
	static String PrecoDesconto(String nome, double preco) {
		double resultado = (preco * (1 - desconto));		
		return nome + ": R$ " + String.format("%.2f", resultado);
	}
}
