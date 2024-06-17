import java.util.Scanner;

public class cond5 {
    public static void main(String[] args){
        /*
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar
         */

        Scanner obj = new Scanner(System.in);


        int cod = obj.nextInt();
        int qtd = obj.nextInt();


        double valorTotal;

        if(cod  == 1){
            valorTotal = qtd * 4.0; //faz o calculo em cima do valor do produto respectivo do cod
        }else if(cod == 2){
            valorTotal = qtd * 4.50;
        }else if(cod == 3){
            valorTotal = qtd * 5.00;
        }else if(cod == 4) {
            valorTotal = qtd * 2.0;
        }else{
            valorTotal = qtd * 1.5;
        }


        System.out.printf("Total: R$%.2f%n", valorTotal);

        obj.close();
    }
}
