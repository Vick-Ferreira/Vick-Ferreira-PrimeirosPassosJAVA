import java.util.Scanner;

public class for6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//entrada de numero inteiro do user

        for( int i=1; i<=n; i++){
            if(n % i == 0){ //se o resto da divisao de n e I for 0, é multiplo é par é divisivel
                System.out.println(i);
            }
        }

        sc.close();
    }
}
