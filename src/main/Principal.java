package main;

import servicio.Contenedor;
import menu.*;
import modelo.*;
import java.util.Scanner;


/**
 * Clase principal del sistema de gestión de prevención de riesgos laborales.
 * 
 * <p>Esta clase implementa el menú principal del sistema que permite gestionar
 * todas las entidades del negocio: usuarios (clientes, profesionales, administrativos),
 * capacitaciones, accidentes, visitas a terreno y revisiones.</p>
 * 
 * <p>El sistema está diseñado para ayudar a una empresa de asesorías en prevención
 * de riesgos laborales a administrar sus procesos y clientes de manera eficiente.</p>
 * 
 * @author Katherine Alderete Gómez
 * @author Katrina González Alarcón  
 * @author Giorgio Interdonato Palacios
 * @version 1.0
 * @since 2025
 */
public class Principal {

     /**
     * Método principal que inicia la aplicación.
     * 
     * <p>Crea una instancia del contenedor principal y muestra el menú
     * interactivo que permite al usuario realizar todas las operaciones
     * del sistema de gestión.</p>
     * 
     * <p>El programa se ejecuta en un bucle continuo hasta que el usuario
     * seleccione la opción de salir (opción 22).</p>
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        // Crear el contenedor principal que almacenará todos los datos
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Bucle principal del menú
        while (!salir) {
            mostrarMenuPrincipal();
            String opcion = scanner.nextLine();
            salir = procesarOpcion(opcion, contenedor, scanner);
        }
        scanner.close();
    }

    /**
     * Muestra el menú principal del sistema con todas las opciones disponibles.
     * 
     * <p>El menú está organizado por categorías para facilitar la navegación:
     * - Gestión de Clientes
     * - Gestión de Usuarios  
     * - Gestión de Profesionales
     * - Gestión de Administrativos
     * - Gestión de Capacitaciones
     * - Gestión de Accidentes
     * - Gestión de Visitas a Terreno
     * - Gestión de Revisiones
     * - Utilidades del Sistema</p>
     */
    private static void mostrarMenuPrincipal() {
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
        System.out.println("\n=== Utilidades ===");
        System.out.println("20. Cargar Datos de Prueba");
        System.out.println("21. Borrar Todos los Datos");
        System.out.println(" ");
        System.out.println("22. Salir");
        System.out.print("Seleccione una opción: ");
    }

        /**
     * Procesa la opción seleccionada por el usuario y ejecuta la acción correspondiente.
     * 
     * <p>Utiliza un switch statement para manejar las diferentes opciones del menú.
     * Cada opción llama al método correspondiente de la clase de menú específica.</p>
     * 
     * @param opcion La opción seleccionada por el usuario
     * @param contenedor El contenedor principal que almacena todos los datos
     * @param scanner El scanner para entrada de datos
     * @return true si el usuario quiere salir del programa, false en caso contrario
     */
    private static boolean procesarOpcion(String opcion, Contenedor contenedor, Scanner scanner) {
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

            // Utilidades
            case "20" -> cargarDatosPrueba(contenedor);
            case "21" -> borrarTodosLosDatos(contenedor);

            // Salir
            case "22" -> {
                System.out.println("Saliendo del sistema...");
                return true;
            }
            default -> System.out.println("Opción inválida. Intente nuevamente.");
        }
        return false;
    }
    /**
     * Carga datos de prueba en el sistema para demostrar las funcionalidades.
     * 
     * <p>Este método crea instancias de ejemplo de todas las entidades del sistema:
     * clientes, profesionales, administrativos, capacitaciones, accidentes,
     * visitas a terreno y revisiones.</p>
     * 
     * <p>Los datos de prueba permiten al usuario explorar las funcionalidades
     * del sistema sin necesidad de ingresar datos manualmente.</p>
     * 
     * @param contenedor El contenedor principal donde se almacenarán los datos
     */
    private static void cargarDatosPrueba(Contenedor contenedor) {
        System.out.println("\n=== Cargando Datos de Prueba ===");
        
        // Crear clientes de prueba
        Cliente cliente1 = new Cliente("Juan Carlos Pérez", "15/03/1985", 12345678, 
            12345678, "Juan Carlos", "Pérez González", "+56912345678", "AFP Provida", 
            1, "Av. Providencia 1234", "Providencia", 38);
        
        Cliente cliente2 = new Cliente("María Elena Silva", "22/07/1990", 87654321, 
            87654321, "María Elena", "Silva Rodríguez", "+56987654321", "AFP Habitat", 
            2, "Calle Las Condes 567", "Las Condes", 33);
        
        // Crear profesionales de prueba
        Profesional profesional1 = new Profesional("Dr. Roberto Mendoza", "10/01/1980", 
            11111111, "Ingeniero en Prevención de Riesgos", "01/03/2020");
        
        Profesional profesional2 = new Profesional("Dra. Ana Patricia López", "05/12/1985", 
            22222222, "Médico del Trabajo", "15/06/2021");
        
        // Crear administrativos de prueba
        Administrativo administrativo1 = new Administrativo("Carlos Alberto Ruiz", 
            "20/09/1988", 33333333, "Recursos Humanos", "5 años en gestión administrativa");
        
        Administrativo administrativo2 = new Administrativo("Sofía Alejandra Torres", 
            "12/04/1992", 44444444, "Contabilidad", "3 años en control de costos");
        
        // Crear capacitaciones de prueba
        Capacitacion capacitacion1 = new Capacitacion(1001, 12345678, "lunes", 
            "09:00", "Sala de Capacitación Principal", "120 minutos", 25);
        
        Capacitacion capacitacion2 = new Capacitacion(1002, 87654321, "miércoles", 
            "14:30", "Auditorio Empresarial", "90 minutos", 15);
        
        // Crear accidentes de prueba
        Accidente accidente1 = new Accidente(2001, 12345678, "15/01/2024", 
            "08:30", "Planta de Producción", "Caída desde altura", "Fractura de brazo");
        
        Accidente accidente2 = new Accidente(2002, 87654321, "22/02/2024", 
            "16:45", "Oficina Administrativa", "Golpe con objeto", "Contusión menor");
        
        // Crear visitas a terreno de prueba
        VisitaTerreno visita1 = new VisitaTerreno(3001, 12345678, "10/03/2024", 
            "10:00", "Planta Industrial Norte", "Inspección de seguridad general");
        
        VisitaTerreno visita2 = new VisitaTerreno(3002, 87654321, "25/03/2024", 
            "13:00", "Oficinas Centrales", "Revisión de protocolos de emergencia");
        
        // Crear revisiones de prueba
        Revision revision1 = new Revision(4001, 3001, "Revisión de EPP", 
            "Verificar uso correcto de equipos de protección personal", 1);
        
        Revision revision2 = new Revision(4002, 3001, "Revisión de Señalización", 
            "Evaluar estado y ubicación de señalización de seguridad", 2);
        
        Revision revision3 = new Revision(4003, 3002, "Revisión de Extintores", 
            "Verificar estado y fecha de vencimiento de extintores", 1);
        
     // Almacenar todos los datos de prueba
        contenedor.almacenarCliente(cliente1);
        contenedor.almacenarCliente(cliente2);
        contenedor.almacenarProfesional(profesional1);
        contenedor.almacenarProfesional(profesional2);
        contenedor.almacenarAdministrativo(administrativo1);
        contenedor.almacenarAdministrativo(administrativo2);
        contenedor.almacenarCapacitacion(capacitacion1);
        contenedor.almacenarCapacitacion(capacitacion2);
        contenedor.almacenarAccidente(accidente1);
        contenedor.almacenarAccidente(accidente2);
        contenedor.almacenarVisitaTerreno(visita1);
        contenedor.almacenarVisitaTerreno(visita2);
        contenedor.almacenarRevision(revision1);
        contenedor.almacenarRevision(revision2);
        contenedor.almacenarRevision(revision3);
        
        System.out.println("✓ Datos de prueba cargados exitosamente!");
        System.out.println("✓ 2 Clientes");
        System.out.println("✓ 2 Profesionales");
        System.out.println("✓ 2 Administrativos");
        System.out.println("✓ 2 Capacitaciones");
        System.out.println("✓ 2 Accidentes");
        System.out.println("✓ 2 Visitas a Terreno");
        System.out.println("✓ 3 Revisiones");
        System.out.println("\nAhora puedes probar todas las funcionalidades del sistema.");
    }
    
    /**
     * Borra todos los datos almacenados en el sistema.
     * 
     * <p>Este método limpia completamente todas las listas del contenedor,
     * eliminando todos los usuarios, capacitaciones, accidentes, visitas
     * a terreno y revisiones almacenados.</p>
     * 
     * <p>Es útil para comenzar desde cero después de probar el sistema
     * con datos de prueba o para limpiar datos obsoletos.</p>
     * 
     * @param contenedor El contenedor principal cuyos datos se borrarán
     */
    private static void borrarTodosLosDatos(Contenedor contenedor) {
        System.out.println("\n=== Borrando Todos los Datos ===");
        System.out.println("¿Estás seguro de que quieres borrar todos los datos? (s/n): ");
        Scanner scanner = new Scanner(System.in);
        String confirmacion = scanner.nextLine().toLowerCase();
        
        if (confirmacion.equals("s") || confirmacion.equals("si") || confirmacion.equals("sí")) {
            // Limpiar todas las listas
            contenedor.getUsuarios().clear();
            contenedor.getCapacitaciones().clear();
            contenedor.getAccidentes().clear();
            contenedor.getVisitasTerreno().clear();
            contenedor.getRevisiones().clear();
            
            System.out.println("✓ Todos los datos han sido borrados exitosamente.");
            System.out.println("✓ El sistema está listo para comenzar desde cero.");
        } else {
            System.out.println("Operación cancelada. Los datos se mantienen intactos.");
        }
    }
}