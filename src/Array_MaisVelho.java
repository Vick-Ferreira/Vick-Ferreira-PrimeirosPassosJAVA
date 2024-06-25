import java.util.Scanner;

public class Array_MaisVelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int n, idade, posicaoMaior;
	
		
		System.out.println("Qauntas pessoas voce vai digitas?");
		n = sc.nextInt();
		
		String[] vetorStrings = new String[n];
		int[] vetorIdade = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Ddos da %da pessoa:%n", i + 1);
			System.out.print("Nome: ");
			vetorStrings[i] = sc.next();//armazena no vetor de nome
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();//armazena no vetor de idade
			
		}
		
	
		idade = vetorIdade[0];//inicia na posição 0
		posicaoMaior = 0;
		
		for(int i=0; i<n; i++){
			if(vetorIdade[i] > idade) {
		       idade = vetorIdade[i];
		       posicaoMaior = i; //logo posição de i = vezes de loop = posição do nome do usuario
				
			}
			
		}
		System.out.printf("A pessoa mais velha é : %s", vetorStrings[posicaoMaior]  ); // da posição maior, que é a posição do nome e da idade respectiva da messoa quero saber o nome
		

		
		sc.close();

	}

}
