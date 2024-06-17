import java.util.Scanner;

public class for1 {
    public static void main(String[] args){

        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso
         */
        Scanner obj = new Scanner(System.in);


        int x = obj.nextInt();//declarando X como tipo inteiro e lendo um numero com esse tipo!

        //impares de 1 ate 6
        //não é multiplicado por 2, não tem %
        for ( int i=1; i<=x; i++){
            if( i % 2 != 0 ){ //SE o resto da multiplicação de I por 2, for DIFERENTE que ZERO temos os numeros impares!Se igual a ZERO, PAR!
                System.out.println(i);
            }

        }

        obj.close();
    }
}
