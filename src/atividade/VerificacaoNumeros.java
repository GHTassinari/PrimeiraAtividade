import java.util.Scanner;

public class VerificacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior número é " + maior);

        if (num1 > 0) {
            System.out.println("O primeiro número é positivo");
        } else if (num1 < 0) {
            System.out.println("O primeiro número é negativo");
        } else {
            System.out.println("O primeiro número é igual a zero");
        }

        if (num2 > 0) {
            System.out.println("O segundo número é positivo");
        } else if (num2 < 0) {
            System.out.println("O segundo número é negativo");
        } else {
            System.out.println("O segundo número é igual a zero");
        }

        if (num3 > 0) {
            System.out.println("O terceiro número é positivo");
        } else if (num3 < 0) {
            System.out.println("O terceiro número é negativo");
        } else {
            System.out.println("O terceiro número é igual a zero");
        }

        scanner.close();
    }
}
