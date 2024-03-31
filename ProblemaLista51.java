import java.util.Scanner;
public class ProblemaLista51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        double somaTemperaturas = 0; // Variável para armazenar a soma das temperaturas.

        System.out.println("Digite 12 temperaturas:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();

            // Verifica se a temperatura está dentro do intervalo permitido.
            if (temperaturas[i] < 4 || temperaturas[i] > 10) {
                System.out.println("A temperatura deve estar entre 4 e 10 graus.");
                i--; // Volta para a mesma posição para digitar novamente
            } else {
                somaTemperaturas += temperaturas[i]; // Faz a soma das temperaturas.
            }
        }

        // Calcula a média das temperaturas.
        double mediaTemperaturas = somaTemperaturas / 12;

        // Exibe a média das temperaturas.
        System.out.println("\nA temperatura média aferida no dia foi de " + mediaTemperaturas + "° C");
        scanner.close();
    }
}