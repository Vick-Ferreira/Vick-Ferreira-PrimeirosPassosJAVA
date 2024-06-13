import java.util.Locale;
import java.util.Scanner;

public class exercCinco {
    public static void main(String[] args){
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */
        Locale.setDefault(Locale.US);
        Scanner obj = new Scanner(System.in);

        //declaração variaveis
        int codigoPeca1;
        int numeroPeca1;
        double valorUnidadePeca1;

        int codigoPeca2;
        int numeroPeca2;
        double valorUnidadePeca2;

        double  total;


        //declaração tipo de entrada que as variaveis vão receber do user
        codigoPeca1 = obj.nextInt();
        numeroPeca1 = obj.nextInt();
        valorUnidadePeca1 = obj.nextDouble();

        obj.nextLine();// Após ler um número inteiro com nextInt(), usamos obj.nextLine() para consumir a quebra de linha deixada pelo nextInt()

        codigoPeca2 = obj.nextInt();
        numeroPeca2 = obj.nextInt();
        valorUnidadePeca2 = obj.nextDouble();

        //VALOR A SER PAGO = valorUnidade * numeroPeca
        total = valorUnidadePeca1 * numeroPeca1 + valorUnidadePeca2 * numeroPeca2 ;


        System.out.printf("Valor a pagar: R$%.2f", total);

        obj.close();

    }
}
