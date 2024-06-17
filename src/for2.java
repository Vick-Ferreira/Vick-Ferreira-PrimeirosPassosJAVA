import java.util.Scanner;

public class for2 {
    public static void main(String[] args){

        Scanner  obj = new Scanner(System.in);

        int n = obj.nextInt();  //Leia um valor inteiro N

        //IMPORTANTE: TEMQUE INICIAR
        int in = 0;
        int out = 0;

        for(int i=0; i<n; i++){
            int x = obj.nextInt(); //Este valor será a quantidade de valores inteiros X que serão lidos em seguida
            if(x >= 10 && x <= 20) {//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo
                in = in +1;
            }
            else{
                out = out +1 ;
            }

        }

        System.out.println( in + "in");
        System.out.println(out  + "out");

        obj.close();
    }
}
