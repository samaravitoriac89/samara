import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8]; // Array para armazenar as 8 notas
        double[] mediasBimestrais = new double[4];
        double[] mediasSemestrais = new double[2];
        double mediaFinal;

        // Entrada das notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        // Cálculo das médias bimestrais (cada duas notas)
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i*2] + notas[i*2 + 1]) / 2.0;
        }

        // Cálculo das médias semestrais (cada duas médias bimestrais)
        for (int i = 0; i < 2; i++) {
            mediasSemestrais[i] = (mediasBimestrais[i*2] + mediasBimestrais[i*2 + 1]) / 2.0;
        }

        // Média final
        mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2.0;

        // Exibindo os resultados
        System.out.println("\n--- Resultado ---");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Média Bimestral %d: %.1f%n", i + 1, mediasBimestrais[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("Média Semestral %d: %.1f%n", i + 1, mediasSemestrais[i]);
        }
        System.out.printf("Média Final: %.1f%n", mediaFinal);

        sc.close();
    }
}
