package modelo;

/**
 * Clase Accidente.
 */
public class Accidente {

	 	private int identificador;    // Obligatorio, número interno manejado por la compañía
	    private int rutCliente;       // Obligatorio
	    private String dia;           // Fecha (DD/MM/AAAA)
	    private String hora;          // Formato HH:MM
	    private String lugar;         // Obligatorio, 10-50 caracteres
	    private String origen;        // Máx 100 caracteres
	    private String consecuencias; // Máx 100 caracteres

	    public Accidente() {}

	    public Accidente(int identificador, int rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
	        this.identificador = identificador;
	        this.rutCliente = rutCliente;
	        this.dia = dia;
	        this.hora = hora;
	        this.lugar = lugar;
	        this.origen = origen;
	        this.consecuencias = consecuencias;
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
		 * @return the rutCliente
		 */
		public int getRutCliente() {
			return rutCliente;
		}

		/**
		 * @param rutCliente the rutCliente to set
		 */
		public void setRutCliente(int rutCliente) {
			this.rutCliente = rutCliente;
		}

		/**
		 * @return the dia
		 */
		public String getDia() {
			return dia;
		}

		/**
		 * @param dia the dia to set
		 */
		public void setDia(String dia) {
			this.dia = dia;
		}

		/**
		 * @return the hora
		 */
		public String getHora() {
			return hora;
		}

		/**
		 * @param hora the hora to set
		 */
		public void setHora(String hora) {
			this.hora = hora;
		}

		/**
		 * @return the lugar
		 */
		public String getLugar() {
			return lugar;
		}

		/**
		 * @param lugar the lugar to set
		 */
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

		/**
		 * @return the origen
		 */
		public String getOrigen() {
			return origen;
		}

		/**
		 * @param origen the origen to set
		 */
		public void setOrigen(String origen) {
			this.origen = origen;
		}

		/**
		 * @return the consecuencias
		 */
		public String getConsecuencias() {
			return consecuencias;
		}

		/**
		 * @param consecuencias the consecuencias to set
		 */
		public void setConsecuencias(String consecuencias) {
			this.consecuencias = consecuencias;
		}
		/*** fin Getter y Setter ***/
		
		/* ------------------------------------------------------------------------------------------ */
		 @Override
		    public String toString() {
		        return "Accidente{" +
		                "identificador=" + identificador +
		                ", rutCliente=" + rutCliente +
		                ", dia='" + dia + '\'' +
		                ", hora='" + hora + '\'' +
		                ", lugar='" + lugar + '\'' +
		                ", origen='" + origen + '\'' +
		                ", consecuencias='" + consecuencias + '\'' +
		                '}';
		    }
}
