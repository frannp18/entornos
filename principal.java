import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        mostrarFechaYHora();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de usuarios a crear: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        Usuario[] usuarios = crearArrayUsuarios(cantidad, scanner);

        System.out.println("\n--- Lista de Usuarios ---");
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println("Usuario " + (i + 1) + ": " + usuarios[i].nombre + " " + usuarios[i].apellidos + ", Email: " + usuarios[i].email);
        }

        scanner.close();
    }

    public static void mostrarFechaYHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formato));
    }

    public static Usuario[] crearArrayUsuarios(int cantidad, Scanner scanner) {
        Usuario[] array = new Usuario[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            array[i] = new Usuario();
            System.out.println("\nDatos para el usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            array[i].nombre = scanner.nextLine();
            System.out.print("Apellidos: ");
            array[i].apellidos = scanner.nextLine();
            System.out.print("Email: ");
            array[i].email = scanner.nextLine();
        }
        
        return array;
    }
}