package exercio3;
import java.util.Scanner;
public class Resposta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de metros ?");
        double metro = sc.nextDouble();

        double centimetro = metro * 100;

        System.out.println("Quantos centimetros tem um metro  " + centimetro);
        sc.close();
    }
}
