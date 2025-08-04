package menu;

import modelo.Cliente;
import servicio.Contenedor;
import util.Validador;
import java.util.Scanner;

/**
 * contenido menu Principal.java
 */
public class MenuCliente {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Cliente cliente = new Cliente();

        // Nombre de usuario
        do {
            System.out.print("Nombre de usuario (10-50 caracteres): ");
            String nombre = scanner.nextLine();
            if (Validador.validarLongitud(nombre, 10, 50)) {
                cliente.setNombre(nombre);
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
                cliente.setFechaNacimiento(fecha);
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
                    cliente.setRun(run);
                    break;
                } else {
                    System.out.println("RUN fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUN inválido.");
            }
        } while (true);

        // RUT cliente
        do {
            System.out.print("RUT cliente (menor a 99.999.999): ");
            try {
                int rut = Integer.parseInt(scanner.nextLine());
                if (Validador.validarRun(rut)) {
                    cliente.setRut(rut);
                    break;
                } else {
                    System.out.println("RUT fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUT inválido.");
            }
        } while (true);

        // Nombres
        do {
            System.out.print("Nombres (5-30 caracteres): ");
            String nombres = scanner.nextLine();
            if (Validador.validarLongitud(nombres, 5, 30)) {
                cliente.setNombres(nombres);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Apellidos
        do {
            System.out.print("Apellidos (5-30 caracteres): ");
            String apellidos = scanner.nextLine();
            if (Validador.validarLongitud(apellidos, 5, 30)) {
                cliente.setApellidos(apellidos);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Teléfono
        do {
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            if (!telefono.trim().isEmpty()) {
                cliente.setTelefono(telefono);
                break;
            } else {
                System.out.println("Teléfono es obligatorio.");
            }
        } while (true);

        // AFP
        do {
            System.out.print("AFP (4-30 caracteres): ");
            String afp = scanner.nextLine();
            if (Validador.validarLongitud(afp, 4, 30)) {
                cliente.setAfp(afp);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Sistema de salud
        do {
            System.out.print("Sistema de salud (1: Fonasa, 2: Isapre): ");
            try {
                int sistema = Integer.parseInt(scanner.nextLine());
                if (Validador.validarSistemaSalud(sistema)) {
                    cliente.setSistemaSalud(sistema);
                    break;
                } else {
                    System.out.println("Solo valores 1 (Fonasa) o 2 (Isapre).");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.");
            }
        } while (true);

        // Dirección
        do {
            System.out.print("Dirección (máx 70 caracteres): ");
            String direccion = scanner.nextLine();
            if (direccion.length() <= 70) {
                cliente.setDireccion(direccion);
                break;
            } else {
                System.out.println("Dirección demasiado larga.");
            }
        } while (true);

        // Comuna
        do {
            System.out.print("Comuna (máx 50 caracteres): ");
            String comuna = scanner.nextLine();
            if (comuna.length() <= 50) {
                cliente.setComuna(comuna);
                break;
            } else {
                System.out.println("Comuna demasiado larga.");
            }
        } while (true);

        // Edad
        do {
            System.out.print("Edad (0-149): ");
            try {
                int edad = Integer.parseInt(scanner.nextLine());
                if (Validador.validarNumeroRango(edad, 0, 149)) {
                    cliente.setEdad(edad);
                    break;
                } else {
                    System.out.println("Edad fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Edad inválida.");
            }
        } while (true);

        contenedor.almacenarCliente(cliente);
        System.out.println("Cliente almacenado exitosamente.");
    }

    public static void eliminar(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese el RUN del cliente a eliminar: ");
        try {
            int runEliminar = Integer.parseInt(scanner.nextLine());
            boolean eliminado = contenedor.eliminarUsuario(runEliminar);
            if (eliminado) {
                System.out.println("Cliente eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un cliente con ese RUN.");
            }
        } catch (NumberFormatException e) {
            System.out.println("RUN inválido.");
        }
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de clientes:");
        contenedor.listarUsuariosPorTipo("cliente");
    }
}
