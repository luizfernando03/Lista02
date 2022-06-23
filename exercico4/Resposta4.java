package exercico4;
import java.util.Scanner;
public class Resposta4 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("valor por hora trabalhada ?");
    double valorHora = sc.nextDouble();
    System.out.println("Quantidade de horas tralhada");
    double horastrabalhadas = sc.nextDouble();

    double soma = valorHora * horastrabalhadas;
    System.out.println("Valor do salario " + soma);
    sc.close();
}
}
