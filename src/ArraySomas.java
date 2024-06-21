


import java.util.Scanner;


public class ArraySomas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner en = new Scanner(System.in);
		
		int n;
		System.out.print("Quantos valores vai ter cada vetor?");
		n = en.nextInt();
		
		
		//vetores
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		System.out.println("Digite os valores do vetor A" );
		for(int i=0; i<n ; i++) {
			a[i] = en.nextInt();

		}
		System.out.println("Digite os valores do vetor B");
		for(int i=0; i<n; i++) {
			b[i] = en.nextInt();

		}
	
		System.out.println("Resultado vetor: ");
		for(int i=0; i<n; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		
		   
		}
		
		en.close();

	}

}
