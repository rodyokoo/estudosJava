package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data1 = new Data(); //puxa a classe
		data1.dia = 6;
		data1.mes = 4;
		data1.ano = 1986;
		String dataFormatada = data1.dataFormatada(); //puxa o método
		
		Data data2 = new Data(); //puxa o contrutor
		
		Data data3 = new Data(12, 12, 1989);
		
		System.out.println(dataFormatada);
		System.out.println(data2.dataFormatada());
		System.out.println(data3.dataFormatada());
	}
}
