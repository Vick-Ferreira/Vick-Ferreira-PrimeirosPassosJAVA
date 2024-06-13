import java.util.Locale;
import java.util.Scanner;

public class exercDois {
    public static void main(String[] args) {

        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
descobrir a area de um circulo com 4  casas decimas! ( area = PI X raio ao quadrado)
         */

        Locale.setDefault(Locale.US); //PARA USAR O .  E NÃO , DO PORTUGUES EM CASAS DECIMAIS
        Scanner obj = new Scanner(System.in);

        //primeiro declarando os tipos de cada variavel
        double PI = 3.14159;
        double area;
        double raio;

        //segundo, declarando o tipo de dados que essa variaveis vão receber!
        raio = obj.nextDouble();//usaruio coloca o raio
        area = PI * raio * raio; //raio ao quadrado 2X

        System.out.printf("Area é = %.4f", area);

        obj.close();

    }
}
