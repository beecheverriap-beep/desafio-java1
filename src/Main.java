import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("=== SISTEMA DUOC ===");
            System.out.println("1. Mostrar estado");
            System.out.println("2. Procesar operación");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Sistema opetarativo");
            } else if (opcion == 2) {
                System.out.println("Procesando operacion...");
            } else if (opcion == 3) {
                System.out.println("Cerrando sistema...");
            }
        }


        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();

        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante = new Estudiante(nombre, carrera, edad);

        if (edad < 18) {
            System.out.println("Estudiante menor de edad");
        } else if (edad < 25) {
            System.out.println("Estudiante joven");
        } else {
            System.out.println("Estudiante adulto");
        }

        estudiante.mostrarInformacion();

        for (int i = 1; i <= 5; i++){
            System.out.println("Procesando estudiante" + i);
            }

    }
}