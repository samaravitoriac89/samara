import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        // Conversões
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        double kelvin = celsius + 273.15;

        // Exibindo exatamente no formato que você quer
        System.out.println("Celsius: " + celsius + " C " +
                           "Fahrenheit: " + fahrenheit + " F " +
                           "Kelvin: " + kelvin + " K");

        sc.close();
    }
}
