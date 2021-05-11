package classe;

public class ValorVsReferencia {
	
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		ValorVsReferencia a = new ValorVsReferencia();
		System.out.println(a.a);
		
		System.out.println(b);
	}
}
