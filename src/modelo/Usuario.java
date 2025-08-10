package modelo;

/**
 * Clase abstracta Usuario que representa la base para todos los tipos de usuarios del sistema.
 * 
 * <p>Esta clase implementa la interfaz Asesoria y proporciona la funcionalidad base
 * para todos los usuarios del sistema de prevención de riesgos laborales.</p>
 * 
 * <p>Define los atributos comunes a todos los usuarios: nombre, fecha de nacimiento
 * y RUN, así como métodos básicos para el análisis de usuarios.</p>
 * 
 * <p>Al ser una clase abstracta, no puede ser instanciada directamente, sino que
 * debe ser extendida por clases concretas como Cliente, Profesional y Administrativo.</p>
 * 
 * @author Katherine Alderete Gómez
 * @author Katrina González Alarcón  
 * @author Giorgio Interdonato Palacios
 * @version 1.0
 * @since 2024
 */
public abstract class Usuario implements Asesoria {

    /** Nombre completo del usuario */
    private String nombre;

    /** Fecha de nacimiento del usuario en formato DD/MM/AAAA */
    private String fechaNacimiento;
    
    /** RUN del usuario (número menor a 99.999.999) */
    private int run;

    /**
     * Constructor por defecto que crea una instancia de Usuario sin parámetros.
     * 
     * <p>Los atributos se inicializan con valores por defecto y pueden ser
     * establecidos posteriormente mediante los métodos setter.</p>
     */
    public Usuario() {}

    /**
     * Constructor que inicializa un Usuario con todos sus atributos.
     * 
     * <p>Este constructor permite crear un usuario con todos sus datos básicos
     * desde el momento de su creación.</p>
     * 
     * @param nombre Nombre completo del usuario (10-50 caracteres)
     * @param fechaNacimiento Fecha de nacimiento en formato DD/MM/AAAA
     * @param run RUN del usuario (menor a 99.999.999)
     */
    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    /*** Getter y Setter ***/
	/**
     *  Obtiene el nombre del usuario.
     * 
	 * @return  El nombre completo del usuario
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del usuario.
	 * 
	 * <p>El nombre debe tener entre 10 y 50 caracteres según los requerimientos
	 * del sistema de validación.</p>
	 * 
	 * @param nombre El nuevo nombre del usuario
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la fecha de nacimiento del usuario.
	 * 
	 * @return La fecha de nacimiento en formato DD/MM/AAAA
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Establece la fecha de nacimiento del usuario.
	 * 
	 * <p>La fecha debe estar en formato DD/MM/AAAA para mantener
	 * consistencia en el sistema.</p>
	 * 
	 * @param fechaNacimiento La nueva fecha de nacimiento
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Obtiene el RUN del usuario.
	 * 
	 * @return El RUN del usuario
	 */
	public int getRun() {
		return run;
	}

	/**
	 * Establece el RUN del usuario.
	 * 
	 * <p>El RUN debe ser un número menor a 99.999.999 según los
	 * requerimientos de validación del sistema.</p>
	 * 
	 * @param run El nuevo RUN del usuario
	 */
	public void setRun(int run) {
		this.run = run;
	}
    /*** fin Getter y Setter ***/
	
    /* ------------------------------------------------------------------------------------------ */
	/**
     * Muestra la edad del usuario con un mensaje descriptivo.
     * 
     * <p>Este método retorna un mensaje formateado que indica la edad
     * del usuario. Es utilizado para mostrar información demográfica
     * en reportes y análisis del sistema.</p>
     * 
     * @param edad La edad del usuario en años
     * @return Mensaje formateado con la edad del usuario
     */
    public String mostrarEdad(int edad) {
        return "El usuario tiene " + edad + " años";
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Implementación del método analizarUsuario de la interfaz Asesoria.
     * 
     * <p>Este método muestra la información básica del usuario: nombre y RUN.
     * Es utilizado para análisis y reportes del sistema de prevención de riesgos.</p>
     * 
     * <p>Las clases que extienden Usuario pueden sobrescribir este método para
     * mostrar información adicional específica de cada tipo de usuario.</p>
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
    }

    /**
     * Retorna una representación en cadena de texto del usuario.
     * 
     * <p>Este método sobrescribe el método toString() de Object para proporcionar
     * una representación legible de los datos del usuario, útil para depuración
     * y visualización en el sistema.</p>
     * 
     * @return Cadena de texto con los datos del usuario
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }
}
