import java.util.Scanner;
import java.util.Random;


public class AdivinaElNumero {
    public static void main(String[] args) {
    Random random = new Random();
    int numSecreto = random.nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    int intento;
    int contador = 1;

    System.out.println("Bienvenido al juego de adivinar el número secreto:");
    System.out.print("Hay que eligir un número del 1 al 100: ");

    do{
        System.out.print("Contador: "+contador+" Introduzca el numero del 1 al 100: ");
        intento = scanner.nextInt();
        contador++;
        if(intento == numSecreto){
            System.out.println("¡Acertaste enhorabuena, en solo "+contador+" intentos");
        } else if (intento < numSecreto) {
            System.out.println("El número secreto es mayor que el número que has elegido");

        } else {
            System.out.println("El número secreto es menor que el número que has elegido");
        }

    } while (intento != numSecreto);
    }
}