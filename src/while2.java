import java.util.Scanner;

public class while2 {
    public static void main(String[] args){


        /*
        Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
         */

        Scanner obj = new Scanner(System.in);//entrada de dados

        //preciso inciar as variaveis com  0 para termos as atribuições posteriormente
        int alcool = 0;
        int gasolina = 0;
        int disel = 0;

        int compustivel = obj.nextInt();//entrada do numero do usuario

        while ( compustivel != 4 ){ //qualquer numero DIFERENTE de 4, entra no if
           if(compustivel == 1){
               alcool = alcool + 1; //recebeo valor nele existente mais 1
           }
           else if( compustivel == 2 ){
               gasolina = gasolina + 1;
           }
           else if ( compustivel == 3 ){
               disel = disel + 1;
           }

           compustivel = obj.nextInt(); //permite, "armazenar", o valor anterior que  usamos para agrupar as somas
        }
        System.out.println("MUITO OBRIGADA");//se FOR 4
        System.out.println("Alcool:" + alcool);
        System.out.println("Gasolina:" + gasolina);
        System.out.println("Disel:" + disel);




        obj.close();


    }
}
