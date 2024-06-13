import java.util.Locale;
import java.util.Scanner;

public class exercSeis {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner obj = new Scanner(System.in);

        /*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
base x altura  / 2

b) a área do círculo de raio C. (pi = 3.14159)
pi x raio ao quadrado

c) a área do trapézio que tem A e B por bases e C por altura.
B + b x altura / 2

d) a área do quadrado que tem lado B.
lados ao quadrado

e) a área do retângulo que tem lados A e B.
base x altura

         */


        //tres valores decimais
        double a;
        double b;
        double c;

        double PI;
        PI = 3.14159;

        double trianguloRetangulo;
        double circulo;
        double trapezio;
        double quadrado;
        double retangulo;

        //tipos que entraram
        a = obj.nextDouble();
        b = obj.nextDouble();
        c = obj.nextDouble();

        //ÁREAS
        //Teriangulo retângulo base x altura / 2
        trianguloRetangulo = a * c / 2.0;
        //Circulo pi x raio ao quadrado
        circulo = PI * c * c ;
        //Trapezio  B + b x altura / 2
        trapezio = (a + b) * c / 2.0 ;
        //Quadrado lados ao quadrado
        quadrado = b * b;
        //Retangulo base x altura
        retangulo = a * b;


        System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
        System.out.printf("CIRCULO : %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);



        obj.close();
    }
}
