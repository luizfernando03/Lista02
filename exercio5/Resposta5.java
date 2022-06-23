package exercio5;
import java.util.Scanner;
public class Resposta5 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("converter Fahrenheit para Celsius ?");
    double Fahrenheit = sc.nextDouble();
    int x = 32;
    double y = 1.8;

    double Celsius = ((Fahrenheit * x) / y);

    System.out.println("Temperatura em Celsius " + Celsius);
    sc.close();
}

}
