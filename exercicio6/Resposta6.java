package exercicio6;
import java.util.Scanner;
public class Resposta6 { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println(" numero digitado ");
    int x = sc.nextInt();
    int antecessor = x - 1;
    int sucessor = x + 1;

    System.out.println("Numero do antecessor " + antecessor );
    System.out.println("numero do sucessor " + sucessor);
    sc.close();
    }
}
