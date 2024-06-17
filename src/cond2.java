import java.util.Scanner;

public class cond2 {
    public static void main(String[] args){
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner obj = new Scanner(System.in);

        int num;
        num = obj.nextInt();

        if( num % 2 == 0){// se a divisão de (num/2) = tiver resto igual igual a 0 é par!
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        obj.close();
    }
}
