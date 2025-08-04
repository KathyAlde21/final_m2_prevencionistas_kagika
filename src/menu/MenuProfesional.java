package menu;

import modelo.Profesional;
import servicio.Contenedor;
import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuProfesional {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Profesional profesional = new Profesional();

        // Nombre de usuario
        do {
            System.out.print("Nombre de usuario (10-50 caracteres): ");
            String nombre = scanner.nextLine();
            if (Validador.validarLongitud(nombre, 10, 50)) {
                profesional.setNombre(nombre);
                break;
            } else {
                System.out.println("Nombre inválido. Intente nuevamente.");
            }
        } while (true);

        // Fecha nacimiento
        do {
            System.out.print("Fecha nacimiento (DD/MM/AAAA): ");
            String fecha = scanner.nextLine();
            if (Validador.validarFecha(fecha)) {
                profesional.setFechaNacimiento(fecha);
                break;
            } else {
                System.out.println("Formato de fecha inválido. Intente nuevamente.");
            }
        } while (true);

        // RUN
        do {
            System.out.print("RUN (menor a 99.999.999): ");
            try {
                int run = Integer.parseInt(scanner.nextLine());
                if (Validador.validarRun(run)) {
                    profesional.setRun(run);
                    break;
                } else {
                    System.out.println("RUN fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUN inválido.");
            }
        } while (true);

        // Título profesional
        do {
            System.out.print("Título profesional (10-50 caracteres): ");
            String titulo = scanner.nextLine();
            if (Validador.validarLongitud(titulo, 10, 50)) {
                profesional.setTitulo(titulo);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Fecha de ingreso
        do {
            System.out.print("Fecha de ingreso (DD/MM/AAAA): ");
            String fechaIngreso = scanner.nextLine();
            if (Validador.validarFecha(fechaIngreso)) {
                profesional.setFechaIngreso(fechaIngreso);
                break;
            } else {
                System.out.println("Formato de fecha inválido.");
            }
        } while (true);

        contenedor.almacenarProfesional(profesional);
        System.out.println("Profesional almacenado exitosamente.");
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de profesionales:");
        contenedor.listarUsuariosPorTipo("profesional");
    }
}
