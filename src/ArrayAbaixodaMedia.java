


import java.util.Locale;
import java.util.Scanner;

public class ArrayAbaixodaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner  en = new Scanner(System.in);
		
		double media, soma;
		int n;
		System.out.println("Quantos elementos vai ter o vetor?");
		n = en.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero:");
			vetor[i] = en.nextDouble();
			
		}
		
		//media  = soma / n
		soma = 0.0;
		for(int i=0; i<n; i++) {
			soma = soma + vetor[i];
		}
		
		
		media = soma / n;
		System.out.printf("\nMedia de TODOS os  vetores é de : %.3f \n", media);
		
		
		
		System.out.print("\nElementos ABAIXO da média são : ");
		for(int i=0; i<n; i++) {
			if(vetor[i] < media) {
			System.out.print( vetor[i] + ", ");
				
			}
		}
		
		System.out.print("\nMédia apenas dos numeros pares : ");
		for(int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0 ) {
			System.out.print( vetor[i] + ", ");
				
			}
			
		}
		
		
		
		
		en.close();

	}

}
