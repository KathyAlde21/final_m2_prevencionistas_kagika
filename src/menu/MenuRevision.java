package menu;

import modelo.Revision;
import servicio.Contenedor;
//import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuRevision {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        Revision revision = new Revision();

        // Identificador
        do {
            System.out.print("Identificador de la revisión (número interno): ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                revision.setIdentificador(id);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe ser un número.");
            }
        } while (true);

        // ID Visita Terreno asociada
        do {
            System.out.print("ID Visita Terreno asociada: ");
            try {
                int idVisita = Integer.parseInt(scanner.nextLine());
                revision.setIdVisitaTerreno(idVisita);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe ser un número.");
            }
        } while (true);

        // Nombre de la revisión
        do {
            System.out.print("Nombre de la revisión (máx 50 caracteres): ");
            String nombreRev = scanner.nextLine();
            if (nombreRev.length() <= 50) {
                revision.setNombreRevision(nombreRev);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        // Detalle
        do {
            System.out.print("Detalle para revisar (máx 100 caracteres): ");
            String detalle = scanner.nextLine();
            if (detalle.length() <= 100) {
                revision.setDetalle(detalle);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        // Estado
        do {
            System.out.print("Estado (1: sin problemas, 2: con observaciones, 3: no aprueba): ");
            try {
                int estado = Integer.parseInt(scanner.nextLine());
                if (estado >= 1 && estado <= 3) {
                    revision.setEstado(estado);
                    break;
                } else {
                    System.out.println("Solo valores 1, 2 o 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido.");
            }
        } while (true);

        contenedor.almacenarRevision(revision);
        System.out.println("Revisión almacenada exitosamente.");
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de revisiones:");
        contenedor.listarRevisiones();
    }
}
