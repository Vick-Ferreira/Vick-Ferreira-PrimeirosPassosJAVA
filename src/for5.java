import java.util.Scanner;

public class for5 {
    public static void main(String[] args){

        Scanner cs = new Scanner(System.in);

        int n = cs.nextInt();

        int fatoral = 1;

        for(int  i=1; i<=n; i++){ //né o numero natural de entrada via user
            fatoral = fatoral * i;
        }

        System.out.println(fatoral);

        cs.close();
    }
}
