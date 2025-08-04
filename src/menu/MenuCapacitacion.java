package menu;

import modelo.Capacitacion;
import servicio.Contenedor;
import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuCapacitacion {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Capacitacion capacitacion = new Capacitacion();

        // Identificador
        do {
            System.out.print("Identificador (número interno): ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                capacitacion.setIdentificador(id);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe ser un número.");
            }
        } while (true);

        // RUT cliente
        do {
            System.out.print("RUT cliente (menor a 99.999.999): ");
            try {
                int rut = Integer.parseInt(scanner.nextLine());
                if (Validador.validarRun(rut)) {
                    capacitacion.setRutCliente(rut);
                    break;
                } else {
                    System.out.println("RUT fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUT inválido.");
            }
        } while (true);

        // Día de la semana
        do {
            System.out.print("Día (lunes a domingo): ");
            String dia = scanner.nextLine().toLowerCase();
            if (Validador.validarDiaSemana(dia)) {
                capacitacion.setDia(dia);
                break;
            } else {
                System.out.println("Día no válido.");
            }
        } while (true);

        // Hora
        do {
            System.out.print("Hora (HH:MM): ");
            String hora = scanner.nextLine();
            if (Validador.validarHora(hora)) {
                capacitacion.setHora(hora);
                break;
            } else {
                System.out.println("Formato de hora no válido.");
            }
        } while (true);

        // Lugar
        do {
            System.out.print("Lugar (10-50 caracteres): ");
            String lugar = scanner.nextLine();
            if (Validador.validarLongitud(lugar, 10, 50)) {
                capacitacion.setLugar(lugar);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Duración
        do {
            System.out.print("Duración (máx 70 caracteres): ");
            String duracion = scanner.nextLine();
            if (duracion.length() <= 70) {
                capacitacion.setDuracion(duracion);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        // Cantidad de asistentes
        do {
            System.out.print("Cantidad de asistentes (<1000): ");
            try {
                int cantidad = Integer.parseInt(scanner.nextLine());
                if (cantidad >= 0 && cantidad < 1000) {
                    capacitacion.setCantidadAsistentes(cantidad);
                    break;
                } else {
                    System.out.println("Cantidad fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ser un número.");
            }
        } while (true);

        contenedor.almacenarCapacitacion(capacitacion);
        System.out.println("Capacitación almacenada exitosamente.");
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de capacitaciones:");
        contenedor.listarCapacitaciones();
    }
}
