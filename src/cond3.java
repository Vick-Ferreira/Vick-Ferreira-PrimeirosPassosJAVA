import java.util.Scanner;

public class cond3 {
    public static void main(String[] args){
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
         */
        Scanner obj = new Scanner(System.in);

        System.out.print("Digite um numero");
        int a;
        a = obj.nextInt();

        System.out.print("Digite o segundo numero");
        int b;
        b = obj.nextInt();

        //a % b == 0  o resto da divisão entre os numero for 0 é multiplo
        if( a % b == 0 || b % a == 0){// temque ser verdade ambas3
            System.out.println("É MULTIPLO");
        }
        else{
            System.out.println("NÃO É MULTIPLO");
        }
        obj.close();

    }
}
