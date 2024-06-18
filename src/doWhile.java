import java.util.Locale;
import java.util.Scanner;

public class doWhile {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //digitar a temperatura em celsius e tranformar em fahrenheit

        char resp; //declarando variavel para sim ou não

    do {
        System.out.print("Digite a temperatura em Celsius:");
        double c = sc.nextDouble(); //criando e declarando tipo de variavel e entrada de dados decimal
        double f = 9.0 * c / 5.0 + 32.0; //formula para tranformar em faherenheit
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);//imprime ao user
        System.out.print("Deseja repetir (s/n)?");
        resp = sc.next().charAt(0);//declarando o tipo de dados que vai entrar nessa variavel
    } while (resp != 'n');
    //repetir o bloco DO,  ENQUANTO os dados da variavel resp for DIFERENTE do N!
        sc.close();
    }
}
