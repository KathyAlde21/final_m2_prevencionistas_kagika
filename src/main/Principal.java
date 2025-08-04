package main;

import servicio.Contenedor;
import menu.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=== Menú Principal ===");
            System.out.println("\n=== Cliente ===");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Eliminar Cliente");
            System.out.println("3. Listar Cliente");
            System.out.println("\n=== Usuario ===");
            System.out.println("4. Almacenar Usuario");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("\n=== Profesional ===");
            System.out.println("8. Almacenar Profesional");
            System.out.println("9. Listar Profesional");
            System.out.println("\n=== Administrativo ===");
            System.out.println("10. Almacenar Administrativo");
            System.out.println("11. Listar Administrativo");
            System.out.println("\n=== Capacitación ===");
            System.out.println("12. Almacenar Capacitación");
            System.out.println("13. Listar Capacitaciones");
            System.out.println("\n=== Accidente ===");
            System.out.println("14. Almacenar Accidente");
            System.out.println("15. Listar Accidentes");
            System.out.println("\n=== Visita a Terreno ===");
            System.out.println("16. Almacenar Visita Terreno");
            System.out.println("17. Listar Visitas Terreno");
            System.out.println("\n=== Revisión ===");
            System.out.println("18. Almacenar Revisión");
            System.out.println("19. Listar Revisiones");
            System.out.println(" ");
            System.out.println("20. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                       // Cliente
	            case "1" -> MenuCliente.almacenar(contenedor, scanner);
	            case "2" -> MenuCliente.eliminar(contenedor, scanner);
	            case "3" -> MenuCliente.listar(contenedor);
	
	            // Usuario
	            case "4" -> MenuUsuario.almacenar(contenedor, scanner);
	            case "5" -> MenuUsuario.eliminar(contenedor, scanner);
	            case "6" -> MenuUsuario.listar(contenedor);
	            case "7" -> MenuUsuario.listarPorTipo(contenedor, scanner);
	
	            // Profesional
	            case "8" -> MenuProfesional.almacenar(contenedor, scanner);
	            case "9" -> MenuProfesional.listar(contenedor);
	            
                // Administrativo
                case "10" -> MenuAdministrativo.almacenar(contenedor, scanner);
                case "11" -> MenuAdministrativo.listar(contenedor);
                
                // Capacitación
                case "12" -> MenuCapacitacion.almacenar(contenedor, scanner);
                case "13" -> MenuCapacitacion.listar(contenedor);
                
                // Accidente
                case "14" -> MenuAccidente.almacenar(contenedor, scanner);
                case "15" -> MenuAccidente.listar(contenedor);

                // Visita Terreno
                case "16" -> MenuVisitaTerreno.almacenar(contenedor, scanner);
                case "17" -> MenuVisitaTerreno.listar(contenedor);

                // Revisión
                case "18" -> MenuRevision.almacenar(contenedor, scanner);
                case "19" -> MenuRevision.listar(contenedor);

                // Salir
                case "20" -> {
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                }
                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        scanner.close();
    }
}