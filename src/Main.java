import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.*/

        Scanner obj = new Scanner(System.in);

        int a;
        int b;
        int soma;

        a = obj.nextInt();//recebe inteiro do usuario
        b = obj.nextInt();


        soma = a + b;

        System.out.println("A soma é : " + soma);
        }
    }
