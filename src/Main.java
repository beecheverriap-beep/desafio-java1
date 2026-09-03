import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese carrera:");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese edad:");
        int edad = scanner.nextInt();




        Estudiante estudiante = new Estudiante("Benjamin", "Ingenieria en informatica", 20);
        estudiante.mostrarInformacion();
    }
}