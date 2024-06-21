

import java.util.Locale;
import java.util.Scanner;

public class ArraySomaVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		//variavel declaradas que serao usada em todo o programa:
		int n;
		double soma, media;
		
		
		
		//iniciar var
		System.out.print("Quantos numeros você vai digita?");
		n = sc.nextInt();//numero de entrada é intiero! IMPORTANTE
		double[] vetor = new double[n];
		//iniciando um array ! valor que o arrai vai receberé decial! IMPORTANTE
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero");
			vetor[i] = sc.nextDouble();
			//vamos receber os dados e colocar no nosso vetor o valor de i que é  o numero de vezes que o usuario vai ter para inserir os dados que precisa
		}
		//quando chega na quantia respectiva de inserir dados ou seja, o for FALSE ou i > n, sai do primeiro for
		
		//cria-se os egundo for, quando vemos se i é < n , cai novamente no verdadeiro pois é a PRIMEIRA INTERAÇÃO DO LOOP
		soma = 0.0; //iniciando variavel de soma 
		for(int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
	
		//MEDIA = SOMA / 2
		media = soma / n;
		
		//impressao
		System.out.printf("Valores = ");
		for(int i=0; i<n; i++) {
			System.out.printf(" %.1f", vetor[i]);
		}
		
	    System.out.printf("%nSoma = %.2f%n", soma);
	    System.out.printf("Media = %.2f", media);
		
		
	
		sc.close();

	}

}
