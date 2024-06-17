import java.util.Scanner;

public class while1 {
    public static void main(String[] args){

        /*
        Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
         */

        Scanner obj = new Scanner(System.in); //entrada dados

        //declarando tipo de  variavel e o tipo de dado que essa variavel irá receber
        int senha = obj.nextInt();

        while ( senha != 2002 ){
            System.out.println("Senha invalida");
            senha = obj.nextInt();//IMPORTANTE: permiteque o usuario continue tentando até a condição for false apos o aviso
        }
        System.out.println("Acesso permitido");

        obj.close();
    }
}
