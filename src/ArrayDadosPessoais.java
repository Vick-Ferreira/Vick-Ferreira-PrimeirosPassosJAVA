import java.util.Locale;
import java.util.Scanner;

public class ArrayDadosPessoais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas pessoas seram digitadas?");
		int n = sc.nextInt();
		double maiorAltura, menorAltura, soma, media;
		int  qtdMulheres, qtdHomens;

		
		
		
		double[] altura = new double[n];
		char[] sexo = new char[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Sexo da %da pessoa", i + 1);
			sexo[i] = sc.next().charAt(0);
			
		}
		
		maiorAltura = altura[0];
		menorAltura = altura[0];
		for(int i=0; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}    
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		
	
			
		soma = 0 ;
		qtdMulheres = 0;
		qtdHomens = 0;
		
		
		for(int i=0; i<n; i++) {
			if(sexo[i] == 'M') {
				  qtdHomens++;//POSIÇAOS QUE DEU VERDADEIRO
			}else {
				qtdMulheres++;
				soma = soma + altura[i];
			}
		}
		media =  soma / qtdMulheres;
		
		
		System.out.println("Menor altura: " + menorAltura );
		System.out.println("Maior altura: " + maiorAltura);
		System.out.printf("Media das alturas das MULHERES = %.2f%n", media);
        System.out.println("quantidade de homens: " + qtdHomens);
		
		sc.close();

	}

}
