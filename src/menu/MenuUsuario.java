package menu;

import servicio.Contenedor;
import modelo.Usuario;
import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuUsuario {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Usuario usuario = new Usuario() {
            @Override
            public void analizarUsuario() {
                System.out.println("Usuario genérico: " + getNombre() + " - RUN: " + getRun());
            }
        };

        // Nombre de usuario
        do {
            System.out.print("Nombre de usuario (10-50 caracteres): ");
            String nombre = scanner.nextLine();
            if (Validador.validarLongitud(nombre, 10, 50)) {
                usuario.setNombre(nombre);
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
                usuario.setFechaNacimiento(fecha);
                break;
            } else {
                System.out.println("Formato de fecha inválido. Intente nuevamente.");
            }
        } while (true);

        // RUN
        do {
            System.out.print("RUN usuario sin digito verificador  (menor a 99.999.999): ");
            try {
                int run = Integer.parseInt(scanner.nextLine());
                if (Validador.validarRun(run)) {
                    usuario.setRun(run);
                    break;
                } else {
                    System.out.println("RUN fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUN inválido.");
            }
        } while (true);

        contenedor.almacenarCliente((modelo.Cliente) usuario); // Solo para pruebas; en la práctica usar Cliente/Profesional/Administrativo
        System.out.println("Usuario genérico almacenado (solo para pruebas).");
    }

    public static void eliminar(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese el RUN del usuario a eliminar: ");
        try {
            int runEliminar = Integer.parseInt(scanner.nextLine());
            boolean eliminado = contenedor.eliminarUsuario(runEliminar);
            if (eliminado) {
                System.out.println("Usuario eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un usuario con ese RUN.");
            }
        } catch (NumberFormatException e) {
            System.out.println("RUN inválido.");
        }
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de todos los usuarios:");
        contenedor.listarUsuarios();
    }

    public static void listarPorTipo(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese tipo de usuario (cliente, profesional, administrativo): ");
        String tipo = scanner.nextLine().toLowerCase();
        contenedor.listarUsuariosPorTipo(tipo);
    }
}
