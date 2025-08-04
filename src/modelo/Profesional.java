package modelo;

/**
 * Clase Profesional que extiende de Usuario.
 */
public class Profesional extends Usuario {

	private String titulo; // Obligatorio, 10-50 caracteres
    private String fechaIngreso; // Formato DD/MM/AAAA

    public Profesional() {}

    public Profesional(
    		String nombre,
    		String fechaNacimiento,
    		int run,
    		String titulo,
    		String fechaIngreso
    		) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    /*** Getter y Setter ***/
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the fechaIngreso
	 */
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	/*** fin Getter y Setter ***/
	
	/* ------------------------------------------------------------------------------------------ */
	/**
     * Muestra el análisis del profesional, incluyendo datos del usuario, título y fecha de ingreso.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + titulo);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                "} " + super.toString();
    }
}
