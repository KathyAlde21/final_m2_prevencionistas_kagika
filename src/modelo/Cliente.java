package modelo;

/**
 * Clase Cliente que representa a los clientes de la empresa de prevención de riesgos.
 * 
 * <p>Esta clase extiende de Usuario e implementa la funcionalidad específica
 * para los clientes de la empresa de asesorías en prevención de riesgos laborales.</p>
 * 
 * <p>Un cliente puede tomar múltiples capacitaciones, registrar accidentes y
 * recibir visitas a terreno. Esta clase almacena toda la información personal
 * y de contacto necesaria para la gestión del cliente.</p>
 * 
 * <p>Los clientes son una entidad fundamental del sistema ya que representan
 * las empresas que contratan los servicios de prevención de riesgos.</p>
 * 
 * @author Katherine Alderete Gómez
 * @author Katrina González Alarcón  
 * @author Giorgio Interdonato Palacios
 * @version 1.0
 * @since 2024
 */
public class Cliente extends Usuario {

	/** RUT del cliente (menor a 99.999.999) */
	private int rut;
	
	/** Nombres del cliente (5-30 caracteres) */
    private String nombres;
    
    /** Apellidos del cliente (5-30 caracteres) */
    private String apellidos;
    
    /** Número de teléfono del cliente (obligatorio) */
    private String telefono;
    
    /** AFP del cliente (4-30 caracteres) */
    private String afp;
    
    /** Sistema de salud: 1 (Fonasa) o 2 (Isapre) */
    private int sistemaSalud;
    
    /** Dirección del cliente (máximo 70 caracteres) */
    private String direccion;
    
    /** Comuna del cliente (máximo 50 caracteres) */
    private String comuna;
    
    /** Edad del cliente (0-149 años) */
    private int edad;

    /**
     * Constructor por defecto que crea una instancia de Cliente sin parámetros.
     * 
     * <p>Los atributos se inicializan con valores por defecto y pueden ser
     * establecidos posteriormente mediante los métodos setter.</p>
     */
    public Cliente() {}

    /**
     * Constructor que inicializa un Cliente con todos sus atributos.
     * 
     * <p>Este constructor permite crear un cliente completo con todos sus datos
     * desde el momento de su creación, incluyendo los datos heredados de Usuario.</p>
     * 
     * @param nombre Nombre de usuario (heredado de Usuario)
     * @param fechaNacimiento Fecha de nacimiento (heredado de Usuario)
     * @param run RUN del usuario (heredado de Usuario)
     * @param rut RUT del cliente
     * @param nombres Nombres del cliente
     * @param apellidos Apellidos del cliente
     * @param telefono Teléfono del cliente
     * @param afp AFP del cliente
     * @param sistemaSalud Sistema de salud (1: Fonasa, 2: Isapre)
     * @param direccion Dirección del cliente
     * @param comuna Comuna del cliente
     * @param edad Edad del cliente
     */
    public Cliente(
            String nombre,
            String fechaNacimiento,
            int run,
            int rut,
            String nombres,
            String apellidos,
            String telefono,
            String afp,
            int sistemaSalud,
            String direccion,
            String comuna,
            int edad
    ) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }
    
    /*** Getter y Setter ***/
    /**
	 * Obtiene el RUT del cliente.
	 * 
	 * @return El RUT del cliente
	 */
	public int getRut() {return rut;}
    
    /**
	 * Establece el RUT del cliente.
	 * 
	 * @param rut El nuevo RUT del cliente
	 */
	public void setRut(int rut) {this.rut = rut;}

    /**
	 * Obtiene los nombres del cliente.
	 * 
	 * @return Los nombres del cliente
	 */
	public String getNombres() {return nombres;}

    /**
	 * Establece los nombres del cliente.
	 * 
	 * @param nombres Los nuevos nombres del cliente
	 */
	public void setNombres(String nombres) {this.nombres = nombres;}

    /**
	 * Obtiene los apellidos del cliente.
	 * 
	 * @return Los apellidos del cliente
	 */
	public String getApellidos() {return apellidos;}

    /**
	 * Establece los apellidos del cliente.
	 * 
	 * @param apellidos Los nuevos apellidos del cliente
	 */
	public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    /**
	 * Obtiene el teléfono del cliente.
	 * 
	 * @return El teléfono del cliente
	 */
	public String getTelefono() {return telefono;}

    /**
	 * Establece el teléfono del cliente.
	 * 
	 * @param telefono El nuevo teléfono del cliente
	 */
	public void setTelefono(String telefono) {this.telefono = telefono;}

    /**
	 * Obtiene la AFP del cliente.
	 * 
	 * @return La AFP del cliente
	 */
	public String getAfp() {return afp;}

    /**
	 * Establece la AFP del cliente.
	 * 
	 * @param afp La nueva AFP del cliente
	 */
	public void setAfp(String afp) {this.afp = afp;}

    /**
	 * Obtiene el sistema de salud del cliente.
	 * 
	 * @return El sistema de salud (1: Fonasa, 2: Isapre)
	 */
	public int getSistemaSalud() {return sistemaSalud;}

    /**
	 * Establece el sistema de salud del cliente.
	 * 
	 * @param sistemaSalud El nuevo sistema de salud
	 */
	public void setSistemaSalud(int sistemaSalud) {this.sistemaSalud = sistemaSalud;}

    /**
	 * Obtiene la dirección del cliente.
	 * 
	 * @return La dirección del cliente
	 */
	public String getDireccion() {return direccion;}

    /**
	 * Establece la dirección del cliente.
	 * 
	 * @param direccion La nueva dirección del cliente
	 */
	public void setDireccion(String direccion) {this.direccion = direccion;}

    /**
	 * Obtiene la comuna del cliente.
	 * 
	 * @return La comuna del cliente
	 */
	public String getComuna() {return comuna;}

    /**
	 * Establece la comuna del cliente.
	 * 
	 * @param comuna La nueva comuna del cliente
	 */
	public void setComuna(String comuna) {this.comuna = comuna;}

	/**
	 * Obtiene la edad del cliente.
	 * 
	 * @return La edad del cliente
	 */
	public int getEdad() {return edad;}
    	
    /**
	 * Establece la edad del cliente.
	 * 
	 * @param edad La nueva edad del cliente
	 */
	public void setEdad(int edad) {this.edad = edad;}

	/*** fin Getter y Setter ***/

	/* ------------------------------------------------------------------------------------------ */
	/**
     * Retorna el nombre completo del cliente combinando nombres y apellidos.
     * 
     * <p>Este método concatena los nombres y apellidos del cliente para
     * formar su nombre completo, útil para reportes y visualización.</p>
     * 
     * @return El nombre completo del cliente (nombres + apellidos)
     */
    public String obtenerNombre() {
        return nombres + " " + apellidos;
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Retorna el tipo de sistema de salud como texto descriptivo.
     * 
     * <p>Convierte el valor numérico del sistema de salud en una descripción
     * legible: "Fonasa" para valor 1, "Isapre" para valor 2.</p>
     * 
     * @return Descripción del sistema de salud ("Fonasa", "Isapre" o "Desconocido")
     */
    public String obtenerSistemaSalud() {
        if (sistemaSalud == 1) {
            return "Fonasa";
        } else if (sistemaSalud == 2) {
            return "Isapre";
        } else {
            return "Desconocido";
        }
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Muestra el análisis completo del cliente incluyendo datos básicos y ubicación.
     * 
     * <p>Este método sobrescribe el método analizarUsuario() de la clase padre
     * para mostrar información adicional específica del cliente: dirección y comuna.</p>
     * 
     * <p>Es utilizado para análisis y reportes del sistema de prevención de riesgos,
     * proporcionando una vista completa de la información del cliente.</p>
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
    }

        /**
     * Retorna una representación en cadena de texto del cliente.
     * 
     * <p>Este método sobrescribe el método toString() de la clase padre para
     * incluir todos los atributos específicos del cliente, proporcionando una
     * representación completa y legible de los datos del cliente.</p>
     * 
     * @return Cadena de texto con todos los datos del cliente
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaSalud=" + obtenerSistemaSalud() +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                "} " + super.toString();
	}

}
