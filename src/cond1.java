import java.util.Scanner;

public class cond1 {
    public static void main(String[] args){

//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner obj = new Scanner(System.in);

        int num;
        num = obj.nextInt();

        if( num < 0){
            System.out.println("NEGATIVO");
        }else{
            System.out.println("NÃO NEGATIVO");
        }


        obj.close();
    }
}
