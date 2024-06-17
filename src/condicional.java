import java.util.Scanner;

public class condicional {
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int horas;
        horas = obj.nextInt();

        if( horas < 12 ){
            System.out.println("Boa diaaa");
        }else if( horas <= 18 ){
                System.out.println("Boa tarde");
            }else{
                System.out.println("Boa noite");
            }

        obj.close();

    }
}
