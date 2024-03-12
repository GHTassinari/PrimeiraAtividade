import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();

        double[] notas = new double[numAlunos];
        double soma = 0;

        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / numAlunos;
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
