import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ContadorDePalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split("\\s");

        // Métricas sobre la frase
        int numeroDePalabras = palabras.length;
        int numeroDeCaracteres = frase.length();
        System.out.println("Numero de palabras: " + numeroDePalabras);
        System.out.println("Numero de caracteres: " + numeroDeCaracteres);
        // Contar el número de caracteres sin espacios ni puntuación

        String fraseSinEspaciosYPuntuacion = frase.replaceAll("[\\s\\p{Punct}]", "");
        int numeroDeCaracteresSinEspaciosYPuntuacion = fraseSinEspaciosYPuntuacion.length();
        System.out.println("La frase tiene " + numeroDeCaracteresSinEspaciosYPuntuacion + " caracteres (sin espacios ni puntuación).");

        // Contar el número de palabras únicas
        Set<String> palabrasUnicas = new HashSet<>();
        for (String palabra : palabras) {
            palabrasUnicas.add(palabra.toLowerCase()); // Convertir a minúsculas para evitar duplicados por mayúsculas/minúsculas
        }
        int numeroDePalabrasUnicas = palabrasUnicas.size();
        System.out.println("La frase tiene " + numeroDePalabrasUnicas + " palabras únicas." + "("+palabrasUnicas+").");
    }


}

