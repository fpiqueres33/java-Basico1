import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculadoraDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (formato: AAAA-MM-DD):");
        String fechaNacimientoStr = scanner.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        LocalDate fechaActual = LocalDate.now();

        Period edad = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Tienes " + edad.getYears() + " años, " + edad.getMonths() + " meses, y " + edad.getDays() + " días.");
    }
}

