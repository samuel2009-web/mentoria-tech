import java.util.Scanner;

public class SistemaEscolar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8];

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < 8; i++) {
            System.out.print((i + 1) + "ª Nota: ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        double[] bimestres = new double[4];
        for (int i = 0; i < 4; i++) {
            bimestres[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Cálculo das médias semestrais
        double semestre1 = (bimestres[0] + bimestres[1]) / 2;
        double semestre2 = (bimestres[2] + bimestres[3]) / 2;

        // Média final
        double mediaFinal = (semestre1 + semestre2) / 2;

        // Saída dos resultados
        System.out.printf("1º Bimestre: %.1f%n", bimestres[0]);
        System.out.printf("2º Bimestre: %.1f%n", bimestres[1]);
        System.out.printf("1º Semestre: %.1f%n", semestre1);
        System.out.println("-------------------------");
        System.out.printf("3º Bimestre: %.1f%n", bimestres[2]);
        System.out.printf("4º Bimestre: %.1f%n", bimestres[3]);
        System.out.printf("2º Semestre: %.1f%n", semestre2);
        System.out.println("-------------------------");
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        scanner.close();
    }
}
