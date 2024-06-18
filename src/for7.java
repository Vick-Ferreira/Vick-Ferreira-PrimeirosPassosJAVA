import java.util.Scanner;

public class for7 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //ler numero inteiro POSITIVO

        //MOSTRAR NA TELA VARIAS LINHAS DE 1 ATÉ N

        for(int i=1; i<=n; i++){//enquanto i for menor ou igual a n ENTRA

            //MOSTRARÁ : N É O NUMERO DE LINHAS (NUMERO LINHA PROPORTCIONAL AO NUMERO DE N )
            int primeiro = i;//Para cada linha, mostrar o número da linha
            int segundo = i * i ; //ao quadrado;
            int terceiro = i * i * i; //ao cubo

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        sc.close();

    }
}
