


import java.util.Locale;
import java.util.Scanner;

public class ArrayMaiorPosicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner en = new Scanner (System.in);
		
		int n;
		double maiorValor;
		
		System.out.println("Quantos numeros você irá digitas? ");
		n = en.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = en.nextDouble();//NÃO ESQUECER QUE AQUI QUEM RECEBE É O VETOR
		
		}
		
		maiorValor = vetor[0];//inicializa posição 0
		for(int i=1; i<n; i++) {//iniciou i=1 pois o index 0 ja inciio a maiorValor
			if( vetor[i] > maiorValor ) {//vamos vericar aqui cada passgem dos valore digitados se é maior que a posição 0
				maiorValor = vetor[i];//recebe a posição do maior de TODOS
				
			}
		}
		System.out.printf("Maior valor = %.1f\n", maiorValor);
		
		
		en.close();

	}

}
