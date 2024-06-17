import java.util.Locale;
import java.util.Scanner;

public class for3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for ( int i=0; i<n; i ++){
            //vezes que o user vai poder digitar e ser concidrado na condição
            double a = sc.nextDouble(); //peso 2.0
            double b = sc.nextDouble();//peso 3.0
            double c = sc.nextDouble();// peso 4.0

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);

        }

        sc.close();
    }
}
