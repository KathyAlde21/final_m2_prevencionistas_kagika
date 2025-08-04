package modelo;

/**
 * Clase Capacitacion.
 */
public class Capacitacion {

		private int identificador;         // Obligatorio, número interno de la capacitación
	    private int rutCliente;            // Obligatorio
	    private String dia;                // Texto, día de la semana ("lunes" a "domingo")
	    private String hora;               // Formato HH:MM
	    private String lugar;              // Obligatorio, 10-50 caracteres
	    private String duracion;           // Máx 70 caracteres
	    private int cantidadAsistentes;    // Obligatorio, < 1000

	    public Capacitacion() {}
	    
	    public Capacitacion(int identificador, int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadAsistentes) {
	        this.identificador = identificador;
	        this.rutCliente = rutCliente;
	        this.dia = dia;
	        this.hora = hora;
	        this.lugar = lugar;
	        this.duracion = duracion;
	        this.cantidadAsistentes = cantidadAsistentes;
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
		 * @return the duracion
		 */
		public String getDuracion() {
			return duracion;
		}

		/**
		 * @param duracion the duracion to set
		 */
		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}

		/**
		 * @return the cantidadAsistentes
		 */
		public int getCantidadAsistentes() {
			return cantidadAsistentes;
		}

		/**
		 * @param cantidadAsistentes the cantidadAsistentes to set
		 */
		public void setCantidadAsistentes(int cantidadAsistentes) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
		/*** fin Getter y Setter ***/
		
		/* ------------------------------------------------------------------------------------------ */
		/**
	     * Muestra el detalle de la capacitación según el formato solicitado.
	     */
	    public String mostrarDetalle() {
	        return "La capacitación será en " + lugar +
	                " a las " + hora +
	                " del día " + dia +
	                ", y durará " + duracion + " minutos";
	    }

	    @Override
	    public String toString() {
	        return "Capacitacion{" +
	                "identificador=" + identificador +
	                ", rutCliente=" + rutCliente +
	                ", dia='" + dia + '\'' +
	                ", hora='" + hora + '\'' +
	                ", lugar='" + lugar + '\'' +
	                ", duracion='" + duracion + '\'' +
	                ", cantidadAsistentes=" + cantidadAsistentes +
	                '}';
	    }	    
}
