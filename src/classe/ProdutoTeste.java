package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		//Produto p1 = new Produto("Notebook", 4999.90);
		//p1.nome = "Notebook";
		//p1.preco = 4999.90;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 1.5;
		
		Produto.desconto = 0.5;
		/*p2.desconto = 0.1;
		
		double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal2 = p2.preco * (1 - p2.desconto);
		double carrinho = precoFinal1 + precoFinal2;
		
		System.out.printf("%s : R$ %.2f %n", p1.nome, p1.preco);
		System.out.printf("Preço com desconto: R$ %.2f %n", precoFinal1);
		
		System.out.printf("%s : R$ %.2f %n", p2.nome, p2.preco);
		System.out.printf("Preço com desconto: R$ %.2f %n", precoFinal2);*/
		
		System.out.println(Produto.PrecoDesconto("Notebook", 4999.9));
		System.out.println(p2.ProdutoDesconto());
	}
}
