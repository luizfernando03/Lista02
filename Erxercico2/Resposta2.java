package Erxercico2;
import java.util.Scanner;
public class Resposta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("primeira nota ?");
        double nota1 = sc.nextDouble();
        System.out.println("segunda nota ?");
        double nota2 = sc.nextDouble();
        System.out.println("terceira nota ?");
        double nota3 = sc.nextDouble();
        System.out.println("quarta nota ?");
        double nota4 = sc.nextDouble();


        double somatotal = nota1+nota2+nota3+nota4;
        double medianota = somatotal/4;


        System.out.println("somatorio das notas  5" +somatotal);
        System.out.println("media das notas  " +medianota);
        sc. close();

    }
}
