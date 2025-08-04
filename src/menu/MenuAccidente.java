package menu;

import modelo.Accidente;
import servicio.Contenedor;
import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuAccidente {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Accidente accidente = new Accidente();

        // Identificador
        do {
            System.out.print("Identificador del accidente (número interno): ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                accidente.setIdentificador(id);
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
                    accidente.setRutCliente(rut);
                    break;
                } else {
                    System.out.println("RUT fuera de rango.");
                }
            } catch (NumberFormatException e) {
                System.out.println("RUT inválido.");
            }
        } while (true);

        // Día
        do {
            System.out.print("Día (DD/MM/AAAA): ");
            String dia = scanner.nextLine();
            if (Validador.validarFecha(dia)) {
                accidente.setDia(dia);
                break;
            } else {
                System.out.println("Formato de fecha inválido.");
            }
        } while (true);

        // Hora
        do {
            System.out.print("Hora (HH:MM): ");
            String hora = scanner.nextLine();
            if (Validador.validarHora(hora)) {
                accidente.setHora(hora);
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
                accidente.setLugar(lugar);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Origen
        do {
            System.out.print("Origen (máx 100 caracteres): ");
            String origen = scanner.nextLine();
            if (origen.length() <= 100) {
                accidente.setOrigen(origen);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        // Consecuencias
        do {
            System.out.print("Consecuencias (máx 100 caracteres): ");
            String consecuencias = scanner.nextLine();
            if (consecuencias.length() <= 100) {
                accidente.setConsecuencias(consecuencias);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        contenedor.almacenarAccidente(accidente);
        System.out.println("Accidente almacenado exitosamente.");
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de accidentes:");
        contenedor.listarAccidentes();
    }
}
