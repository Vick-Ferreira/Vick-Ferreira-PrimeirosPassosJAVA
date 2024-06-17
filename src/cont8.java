import java.util.Scanner;

public class cont8 {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int x = obj.nextInt();//numero entra

        int soma = 0;

        while ( x != 0) { //condição
            soma = soma + x;  //soma recebe o que ja tinha nela mais o valor x
            x = obj.nextInt();//digitar outro valor
            //verdadeiro executa e volta

        }

        System.out.println(soma);
        obj.close();
    }
}
