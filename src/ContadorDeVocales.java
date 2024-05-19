import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ContadorDeVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine().toLowerCase();

        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u');

        long contadorVocales = frase.chars()
                                    .mapToObj(c -> (char) c)
                                    .filter(vocales::contains)
                                    .count();

        System.out.println("La frase tiene " + contadorVocales + " vocales.");
    }
}


