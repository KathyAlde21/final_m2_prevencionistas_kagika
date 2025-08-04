package modelo;

/**
 * Clase Administrativo que extiende de Usuario.
 */
public class Administrativo extends Usuario {

	private String area; // Obligatorio, 5-20 caracteres
    private String experienciaPrevia; // Máx 100 caracteres

    public Administrativo() {}

    public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    /*** Getter y Setter ***/
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the experienciaPrevia
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	/**
	 * @param experienciaPrevia the experienciaPrevia to set
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}
	/*** fin Getter y Setter ***/
	
	/* ------------------------------------------------------------------------------------------ */
	/**
     * Muestra el análisis del administrativo, incluyendo datos del usuario, área y experiencia previa.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + area);
        System.out.println("Experiencia previa: " + experienciaPrevia);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                "} " + super.toString();
    }
}
