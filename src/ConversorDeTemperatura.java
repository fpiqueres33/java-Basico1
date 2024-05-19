import java.util.Scanner;
import java.text.DecimalFormat;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("Elige la conversión: 1.- Celsius a Fahrenheit\n o 2.- Fahrenheit a Celsius\n");

        int eleccion = sc.nextInt();
        sc.nextLine(); //limpiar buffer

        switch (eleccion) {
            case 1:
                System.out.println("Celsius");
                double celsius = sc.nextDouble();
                sc.nextLine(); //limpiar buffer
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Fahrenheit: " + df.format(fahrenheit));
                break;
            case 2:
                System.out.println("Fahrenheit");
                fahrenheit = sc.nextDouble();
                sc.nextLine(); //limpiar buffer
                celsius = (fahrenheit -32) * 5/9;
                System.out.println("Celsius: " + df.format(celsius));
                break;
            default:
                System.out.println("Opción no válida");
        }

    }
}
