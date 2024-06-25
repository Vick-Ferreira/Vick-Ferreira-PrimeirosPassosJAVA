import java.util.Scanner;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;


public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] nomeMatriz = new int [n][n];//criando uma matriz bidimensional
		
		
		//quando volta aqui apos o loop que atribui o valor na posição
		for(int i=0; i<nomeMatriz.length; i++) {//numero linha quando verdade
			//o i=0 inicia com 0, do qual se mantem assim até o que for interno seja FALSO e volte para o for atual. ai sim acrescenta +
			/*
			 * i=0 (linha )
			 * (segundo for)
			 * i=1
			 * (segundo for)
			 * i=2
			 * */
			
			for( int j=0; j<n; j++) { // j < nomeMatriz[i].length  
				
				//inicia na posição 0, seguindo a quantia de colunar dada pelo usuario e fica dentro até ser falso
				//em quanto V, numero entra na posicao das colunas

				/*
				 * j= 0,1,2  (coluna) sai quando falto
				 * */
				nomeMatriz[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Diagonal:");
		for(int i=0; i<n; i++) {
			System.out.println(nomeMatriz[i][i] + "");  //linha i e coluna i
		}
		
	   int numeroNegativos = 0;
	   
	   for(int i=0; i<n; i++) {
		   for(int j=0; j<n; j++) {
			   if(nomeMatriz[i][j] < 0 ) { //se na linha i e na coluna j tiver valores menores de 0 adiciona na variavel
				   numeroNegativos++;
			   }
		   }
		   
	   }
	   System.out.println("Numeros negativos = " + numeroNegativos);
		
		
		
		
		sc.close();

	}

}
