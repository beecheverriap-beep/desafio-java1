import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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