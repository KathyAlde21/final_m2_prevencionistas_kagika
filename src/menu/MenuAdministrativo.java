package menu;

import modelo.Administrativo;
import servicio.Contenedor;
import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuAdministrativo {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Administrativo administrativo = new Administrativo();

        // Nombre de usuario
        do {
            System.out.print("Nombre de usuario (10-50 caracteres): ");
            String nombre = scanner.nextLine();
            if (Validador.validarLongitud(nombre, 10, 50)) {
                administrativo.setNombre(nombre);
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
                administrativo.setFechaNacimiento(fecha);
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
                    administrativo.setRun(run);
                    break;
                } else {
                    System.out.println("RUN fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUN inválido.");
            }
        } while (true);

        // Área
        do {
            System.out.print("Área (5-20 caracteres): ");
            String area = scanner.nextLine();
            if (Validador.validarLongitud(area, 5, 20)) {
                administrativo.setArea(area);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Experiencia previa
        do {
            System.out.print("Experiencia previa (máx 100 caracteres): ");
            String exp = scanner.nextLine();
            if (exp.length() <= 100) {
                administrativo.setExperienciaPrevia(exp);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        contenedor.almacenarAdministrativo(administrativo);
        System.out.println("Administrativo almacenado exitosamente.");
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de administrativos:");
        contenedor.listarUsuariosPorTipo("administrativo");
    }
}
