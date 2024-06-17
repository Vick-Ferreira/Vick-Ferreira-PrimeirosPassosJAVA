import java.util.Scanner;

public class cond6 {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        System.out.print("Coloque um valor qualquer");

        double valor = obj.nextDouble();

        if( valor <= 0 || valor > 100 ){//primeira verificação os limiter do sistema!!!!!
            System.out.println("Fora do intervalo");
        } else if ( valor <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }else if( valor <= 50.00){
            System.out.println("Intervalo [25,50]");
        }else if( valor <= 75.00){
            System.out.println("Intervalo [50,75]");
        }else{
            System.out.println("Intervalo [75,100]");
        }


        obj.close();
    }
}
