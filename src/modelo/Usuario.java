package modelo;

/**
 * Clase abstracta Usuario.
 * Implementa la interfaz Asesoria.
 */
public abstract class Usuario implements Asesoria {
    private String nombre;
    private String fechaNacimiento; // Formato DD/MM/AAAA
    private int run;

    public Usuario() {}

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    /*** Getter y Setter ***/
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * @return the run
	 */
	public int getRun() {
		return run;
	}

	/**
	 * @param run the run to set
	 */
	public void setRun(int run) {
		this.run = run;
	}
    /*** fin Getter y Setter ***/
	
    /* ------------------------------------------------------------------------------------------ */
	/**
     * Muestra la edad del usuario con el mensaje solicitado.
     * @param edad Edad del usuario.
     * @return Mensaje con la edad.
     */
    public String mostrarEdad(int edad) {
        return "El usuario tiene " + edad + " años";
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Implementación genérica del método analizarUsuario de la interfaz Asesoria.
     * Muestra el nombre y RUN del usuario.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("RUN: " + run);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", run=" + run +
                '}';
    }

}
