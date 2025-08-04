package modelo;

/**
 * Clase Revision.
 */
public class Revision {

	private int identificador;                // Obligatorio, número interno manejado por la compañía
    private int idVisitaTerreno;              // Obligatorio, número de la visita a la que se asocia la revisión
    private String nombreRevision;            // Obligatorio, 10-50 caracteres
    private String detalle;                   // Máx 100 caracteres
    private int estado;                       // 1 (sin problemas), 2 (con observaciones), 3 (no aprueba)

    public Revision() {}

    public Revision(int identificador, int idVisitaTerreno, String nombreRevision, String detalle, int estado) {
        this.identificador = identificador;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombreRevision = nombreRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    /*** Getter y Setter ***/
	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the idVisitaTerreno
	 */
	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	/**
	 * @param idVisitaTerreno the idVisitaTerreno to set
	 */
	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	/**
	 * @return the nombreRevision
	 */
	public String getNombreRevision() {
		return nombreRevision;
	}

	/**
	 * @param nombreRevision the nombreRevision to set
	 */
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	/**
	 * @return the detalle
	 */
	public String getDetalle() {
		return detalle;
	}

	/**
	 * @param detalle the detalle to set
	 */
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	/**
	 * @return the estado
	 */
	public int getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}
	/*** fin Getter y Setter ***/
	
	/* ------------------------------------------------------------------------------------------ */
	 @Override
	    public String toString() {
	        String estadoTexto;
	        switch (estado) {
	            case 1: estadoTexto = "Sin problemas"; break;
	            case 2: estadoTexto = "Con observaciones"; break;
	            case 3: estadoTexto = "No aprueba"; break;
	            default: estadoTexto = "Desconocido";
	        }
	        return "Revision{" +
	                "identificador=" + identificador +
	                ", idVisitaTerreno=" + idVisitaTerreno +
	                ", nombreRevision='" + nombreRevision + '\'' +
	                ", detalle='" + detalle + '\'' +
	                ", estado=" + estadoTexto +
	                '}';
	    }
}
