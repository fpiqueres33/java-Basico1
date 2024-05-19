import java.security.SecureRandom;
import java.util.Scanner;


public class GeneradorCodigos {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Longitud de la contraseña:    \n");
        int longitud = scanner.nextInt();

        StringBuilder contraseña = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(CHARACTERS.length());
            contraseña.append(CHARACTERS.charAt(index));
        }

        System.out.println("Contraseña generada: " + contraseña.toString());
    }
}
