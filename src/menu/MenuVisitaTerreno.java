package menu;

import modelo.VisitaTerreno;
import servicio.Contenedor;
import util.Validador;
import java.util.Scanner;
/**
 * contenido menu Principal.java
 */
public class MenuVisitaTerreno {

	public static void almacenar(Contenedor contenedor, Scanner scanner) {
        VisitaTerreno visita = new VisitaTerreno();

        // Identificador
        do {
            System.out.print("Identificador de la visita (número interno): ");
            try {
                int id = Integer.parseInt(scanner.nextLine());
                visita.setIdentificador(id);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Debe ser un número.");
            }
        } while (true);

        // RUT cliente
        do {
            System.out.print("RUT cliente sin digito verificador (menor a 99.999.999): ");
            try {
                int rut = Integer.parseInt(scanner.nextLine());
                if (Validador.validarRun(rut)) {
                    visita.setRutCliente(rut);
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
                visita.setDia(dia);
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
                visita.setHora(hora);
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
                visita.setLugar(lugar);
                break;
            } else {
                System.out.println("Longitud inválida.");
            }
        } while (true);

        // Comentarios
        do {
            System.out.print("Comentarios (máx 100 caracteres): ");
            String comentarios = scanner.nextLine();
            if (comentarios.length() <= 100) {
                visita.setComentarios(comentarios);
                break;
            } else {
                System.out.println("Demasiado largo.");
            }
        } while (true);

        contenedor.almacenarVisitaTerreno(visita);
        System.out.println("Visita en terreno almacenada exitosamente.");
    }

    public static void listar(Contenedor contenedor) {
        System.out.println("Listado de visitas a terreno:");
        contenedor.listarVisitasTerreno();
    }
}
