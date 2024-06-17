import java.util.Scanner;

public class for4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        for(int i=0; i<n; i++){
            //ler  numeros (VINDO DO USUARIO) , enquanto i for  < que  N
            int x = sc.nextInt();
            int y = sc.nextInt(); //denominador

            if( y == 0){
                System.out.println("divisão impossivel");
            }else{
                double icon = (double) x / y;
                System.out.printf("%.1f%n", icon);
            }

        }


        sc.close();
    }
}
