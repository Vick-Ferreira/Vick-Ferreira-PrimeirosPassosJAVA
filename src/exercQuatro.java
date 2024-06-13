import java.util.Locale;
import java.util.Scanner;

public class exercQuatro {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
         */

        Locale.setDefault(Locale.US); //PARA USAR O .  E NÃO , DO PORTUGUES EM CASAS DECIMAIS
        Scanner obj = new Scanner(System.in);

        int numeroFuncionario;
        int numeroHorasTrabalhadas;
        double valorPorHora;
        double salario;

        //valorPorHora * numeroHorasTrabalhadas = salario
        numeroFuncionario = obj.nextInt();
        numeroHorasTrabalhadas = obj.nextInt();
        valorPorHora = obj.nextDouble();

        salario = valorPorHora * numeroHorasTrabalhadas;

        System.out.printf(" O funcionario de numero %d tem o sálario de R$%.2f", numeroFuncionario, salario);

        obj.close();
    }
}
