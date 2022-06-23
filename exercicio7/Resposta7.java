package exercicio7;
import java.util.Scanner;
public class Resposta7 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" ?");
    System.out.println("valor por hora trabalhada ?");
    double valorHora = sc.nextDouble();
    System.out.println("Quantidade de horas tralhada");
    double horastrabalhadas = sc.nextDouble();

    double soma = valorHora * horastrabalhadas;
    System.out.println("Valor do salario " + soma);

    double valorInss = soma * 0.08;
    double valorImpostodeRenda = soma * 0.11;
    double valorSindicato = soma * 0.05;
    double SalarioLiquido = soma - valorImpostodeRenda - valorImpostodeRenda - valorSindicato;

    System.out.println("valor descontado do Inss " + valorInss);
    System.out.print("valor descontado do Imposto " + valorImpostodeRenda);
    System.out.print("Valor descontado do Sindicado" + valorSindicato);
    System.out.print("Qual o valor salario liquido" + SalarioLiquido);
    sc.close();
}
}
