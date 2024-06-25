import java.util.Locale;
import java.util.Scanner;

public class ArrayAprovação {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão digitados?");
		int n = sc.nextInt();
		double  media;
		
		
		String[] nomeAluno = new String[n];
		double[] primeiroSemestra = new double[n];
		double[] segundoSemeste = new double[n];
		
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite o nome do %do aluno:", i + 1);
			nomeAluno[i] = sc.next();
			System.out.println("Nota do 1º Semestre: ");
			primeiroSemestra[i] = sc.nextDouble();
			System.out.println("Nota do 2º Semestre: ");
			segundoSemeste[i] = sc.nextDouble();
			
		}
		
		
		media = 0;
		for(int i=0; i<n; i++) {
			media = media + ( primeiroSemestra[i] + segundoSemeste[i]) / 2;
			if(media >= 6.0) {
				System.out.printf("Alunos aprovados: %s\n", nomeAluno[i]);//alunos passados conseguimos recuperar o dado
				
			}
			
		}
		
	
	
			
			
		sc.close();

	}

}
