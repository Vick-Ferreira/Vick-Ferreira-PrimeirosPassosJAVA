import java.util.Scanner;

public class MatrizLados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digete a quantidade de linhas e quantidade de colunas: ");
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();
		
		int [][] matriz = new int [n][m];
		
		
		//preenchendo a matriz
		for(int i = 0; i<n ; i++) {//linha
			for(int j = 0; j<m; j++) {//coluna
				matriz[i][j] = sc.nextInt();
			}
		}
		

		int x = sc.nextInt();
		
        for(int i = 0; i<n ; i++) {//linha
			for(int j = 0; j<m; j++) {//coluna
				//verificar se há uma coluna à esquerda e à direita da posição atual (i, j)
				if(matriz[i][j] == x) { //percorre cada posição da matriz para verificar se o valor armazenado nessa posição é igual ao valor x
					System.out.println("Posição:" + i + "," + j + ":");
					//ao logicas a baixo segue a posição que foi achada
					if(j > 0) {
					  System.out.println("Esquerda(LEFT): " + matriz[i][j-1]);
					}
					if(i > 0) {
						  System.out.println("Cima(TOP): " + matriz[i-1][j]);
					}
					if(j < m-1) {// j menor que numero d elinhas -1
						System.out.println("Direita(RIGHT):" + matriz[i][j+1]);
					}
					if(i < m-1) {
						System.out.println("Baixo(BUTTON)" + matriz[i+1][j]);
					}
					
				}
			}
		}
		
		
		
		sc.close();

	}

}
