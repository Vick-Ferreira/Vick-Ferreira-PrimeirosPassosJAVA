import java.util.Scanner;

public class exercTres {
    public static void main(String[] args){
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */

        Scanner obj = new Scanner(System.in);

        //declarando variavel
        int a;
        int b;
        int c;
        int d;
        //declarando tipoi de entrada da variavel
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        d = obj.nextInt();

        int diferenca;
        diferenca = a * b - c * d ;

        System.out.println(diferenca);



        obj.close();
    }
}
