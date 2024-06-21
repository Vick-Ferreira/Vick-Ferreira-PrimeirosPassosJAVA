

import java.util.Locale;
import java.util.Scanner;



public class ArrayNumeroNegativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//exercício numeros negativos com array
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos numeros você quer digitas?");
		n = sc.nextInt();
	
		int[] vetor = new int[n];//iniciando array
		
		
		//inicia i=0 para começar  0,1,2
		for(int i=0; i < n; i++) {
			System.out.print("Digite um numero?");
		    vetor[i] = sc.nextInt();//recebe os numero até que eles sejam < que n
		    //vetor pela valor de i "todos os valores dentro"
			
		}
		
		System.out.println("Numeros negativos:");
		//numero < 0 = negativos
		
		//i ja vai estar valendo  numero de "linhas" numero de entrada do loop
		for(int i=0; i<n; i++) {
			if(vetor[i] < 0 ) {//pega vetor inteiro do vetor que foi declaro la em cima e o i recuperado do primeiro FOR
				System.out.printf("%d\n", vetor[i]);
			}
		}
				
		
		
		
		
		sc.close();
	}

}
