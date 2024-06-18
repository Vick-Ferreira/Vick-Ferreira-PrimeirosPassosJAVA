import java.util.Scanner;

public class funcaoes {

    public static void main(String[] args){
        /*
        O programa irá receber 3 numero do usuario, e mostrará qual dos três é o maior
        */

        Scanner sc = new Scanner(System.in); //permitir retorno user

        System.out.println("Digite três numeros:"); //imprime tela e pula linha

        //declarando variaveis e seus tipo  e tipo de dados de entrada
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //para fazer a parte logica criaremos um nova função, função que ira receber os numeros inteiros e ver o maior
        int funcaoNumeroMaior = maiorNumero(a, b, c); // maiorNumero(a, b, c) vai ser a função com a logíca

        mostrarResultado(funcaoNumeroMaior);//mostrarResultado, vai ser a funçãoq ue vai imprimir para o usuario o retorno

        sc.close();
    }

    public  static int maiorNumero(int x, int y, int z){//nomes de argumentos NÃO precisam ser os mesmos SÓ o TIPO

        int maior;
        if( x > y && x > z){
            maior = x;
        }else if(y > z){
            maior = y;
        }else{
            maior = z;
        }

        return maior;//NÃO ESQUECER!

    }

    public  static  void  mostrarResultado( int value){

        System.out.println("O maior numeroi é:" + value); //valor impresso, valor veio pelo argumeto IMPORTANTE: nome não precisa ser o mesmo LEMBRAR
    }



}

