


import java.util.Locale;
import java.util.Scanner;

public class ArrayMediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner en = new Scanner(System.in);
		
		
		int n, numeroPares;
		double soma, media;
		
		
		System.out.println("Quantos elementos vai ter o vetos?");
		n = en.nextInt();
		
		
		
		int[] vetor = new int[n];
		
		System.out.println("Digite um numero: ");
		for(int i=0; i<n; i++) {
			vetor[i] = en.nextInt();
		}
		
		soma = 0;
		numeroPares = 0;
		
		
		for(int i=0; i<n; i++) {
			
				soma = soma + vetor[i]; 
				numeroPares++;
				
				System.out.println(numeroPares);
			
		}
		
		for(int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				soma = soma + vetor[i]; //pegando apenas numeros pares e somando 
				numeroPares++;
			}
			
		}

		
		if(numeroPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else{
			media = soma / numeroPares;
			System.out.printf("Media dos pares é = %.1f\n", media);
		}
	

			
			
		
		
		
		en.close();

	}

}
