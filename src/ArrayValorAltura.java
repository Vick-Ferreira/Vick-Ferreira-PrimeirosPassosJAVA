

import java.util.Locale;
import java.util.Scanner;

public class ArrayValorAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, menorIdade;
		double media, soma, percentual;
		
		System.out.println("Quantas pessoas serão adicionadas?");
		n = sc.nextInt();
		
		
		//criar um vetor para cada
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa \n", i + 1);
			//recuperando dados dos arrays
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			System.out.printf("%s , %d , %.2f%n", nome[i], idade[i], altura[i]);
			
		
		}
		
		
		soma = 0.0;
		for(int i=0; i<n; i++) {
			soma = soma + altura[i];
			
		}
		
		media = 0.0;
		for(int i=0; i<n; i++) {
			media = soma / n;
			System.out.printf("\nAltura media = %.2f\n", media);
		}
		
		//
		menorIdade = 0;
		for(int i=0; i<n; i++) {
			if(idade[i] < 16) {
				menorIdade++; //add na variavel menorIdade o que estiverem noa rray e a idade for menor que 1
				System.out.printf(" As pessoas com menos de 16 anos são: %s, %d anos\n", nome[i], idade[i]);
			}
		}
		
		percentual = ((double)menorIdade / n) * 100.0;
		System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.1f%%\n", percentual);
	
	
		
		
		
		
		sc.close();

	}
}
