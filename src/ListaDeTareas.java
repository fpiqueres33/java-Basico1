import java.util.ArrayList;
import java.util.Scanner;


public class ListaDeTareas {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Ingrese el opcion: 1.- Agregar, 2.- Eliminar, 3.- Mostrar, 4.-Salir");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingrese tarea: ");
                    String tarea = sc.nextLine();
                    sc.nextLine();
                    tareas.add(tarea);
                    break;
                case "2":
                    System.out.println("Tarea a eliminar: (" + tareas + ")");
                    int indice = sc.nextInt();
                    sc.nextLine(); //limpiar buffer
                    if (indice >= 0 && indice < tareas.size()) {
                        tareas.remove(indice);
                    } else {
                        System.out.println("La tarea no existe");
                        sc.nextLine();
                    }
                    break;
                case "3":
                    System.out.println("Lista de tareas: ");
                    for (String s : tareas) {
                        System.out.println(s);
                    }
                    break;
                case "4":
                    System.out.println("Hasta la vista");
                    break;

            }

        } while (!opcion.equals("4"));

    }


}
