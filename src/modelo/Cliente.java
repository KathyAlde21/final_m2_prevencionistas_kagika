package modelo;

     /**
 * Clase Cliente que extiende de Usuario.
 */
public class Cliente extends Usuario {

	private int rut; // Menor a 99.999.999
    private String nombres; // Obligatorio, 5-30 caracteres
    private String apellidos; // Obligatorio, 5-30 caracteres
    private String telefono; // Obligatorio
    private String afp; // 4-30 caracteres
    private int sistemaSalud; // 1 (Fonasa) o 2 (Isapre)
    private String direccion; // Máx 70 caracteres
    private String comuna; // Máx 50 caracteres
    private int edad; // >=0 y <150

    public Cliente() {}

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
	public int getRut() {return rut;}
	public void setRut(int rut) {this.rut = rut;}

	public String getNombres() {return nombres;}
	public void setNombres(String nombres) {this.nombres = nombres;}

	public String getApellidos() {return apellidos;}
	public void setApellidos(String apellidos) {this.apellidos = apellidos;}

	public String getTelefono() {return telefono;}
	public void setTelefono(String telefono) {this.telefono = telefono;}

	public String getAfp() {return afp;}
	public void setAfp(String afp) {this.afp = afp;}

	public int getSistemaSalud() {return sistemaSalud;}
	public void setSistemaSalud(int sistemaSalud) {this.sistemaSalud = sistemaSalud;}

	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}

	public String getComuna() {return comuna;}
	public void setComuna(String comuna) {this.comuna = comuna;}

	public int getEdad() {return edad;}
	public void setEdad(int edad) {this.edad = edad;}

	/*** fin Getter y Setter ***/

	/* ------------------------------------------------------------------------------------------ */
	/**
     * Retorna el nombre completo del cliente.
     */
    public String obtenerNombre() {
        return nombres + " " + apellidos;
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Retorna el tipo de sistema de salud como texto.
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
     * Muestra el análisis del usuario incluyendo dirección y comuna.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Dirección: " + direccion);
        System.out.println("Comuna: " + comuna);
    }

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
