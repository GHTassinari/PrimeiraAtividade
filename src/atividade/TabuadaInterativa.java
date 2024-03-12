import java.util.Scanner;

public class TabuadaInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
            i++;
        }

        scanner.close();
    }
}