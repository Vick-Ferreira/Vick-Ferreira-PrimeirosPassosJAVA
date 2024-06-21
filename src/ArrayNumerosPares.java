


import java.util.Scanner;

public class ArrayNumerosPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		System.out.println("Quantos numeros você vai digitas?");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i=0; i<n; i++) {
			/*quem vai receber aqui é o VETOR
			IMPORTANTE: o numero que entra aqui do usuaio NÃO é o numero inteiro declarado em cima do programa (o n é o valor de vezes que nosso loop vai interagir).
			Já o valor que entra aqui no for são valores que vamos usar nas operações do sistema ARIBUIDO ao arrey.*/
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			System.out.println(vetor[i]);
			
		}
		
		
		System.out.print("\nSÃO PARES = ");
		int numPar = 0;
		for(int i=0; i<n; i++) {
			if (vetor[i] % 2 == 0 ){
				System.out.printf("%d - ", vetor[i]);
				numPar++; // vai somando a cada interação , COM ++ CONSEGUIMOS ACUMULAR OS DADOS ( AQUI SÓ SOMA OS PARES)
				
			}
			
		}
		
		System.out.printf("\nQuantidade de pares = %d", numPar);
		sc.close();
	}

}
