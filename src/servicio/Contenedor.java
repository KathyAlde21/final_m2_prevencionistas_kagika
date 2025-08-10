package servicio;

import modelo.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase Contenedor: almacena y gestiona todas las entidades del sistema.
 * 
 * <p>Esta clase actúa como el núcleo central del sistema, almacenando y gestionando
 * todas las entidades del negocio: usuarios (como instancias de Asesoria), 
 * capacitaciones, accidentes, visitas a terreno y revisiones.</p>
 * 
 * <p>Proporciona métodos para almacenar, listar y eliminar entidades, así como
 * para realizar consultas específicas por tipo de usuario.</p>
 * 
 * <p>La clase utiliza listas dinámicas para almacenar las diferentes entidades,
 * permitiendo un manejo eficiente de los datos en memoria.</p>
 * 
 * @author Katherine Alderete Gómez
 * @author Katrina González Alarcón  
 * @author Giorgio Interdonato Palacios
 * @version 1.0
 * @since 2024
 */
public class Contenedor {
	
    /** Lista de usuarios del sistema (clientes, profesionales, administrativos) */
	private List<Asesoria> usuarios;

    /** Lista de capacitaciones registradas en el sistema */
    private List<Capacitacion> capacitaciones;

    /** Lista de accidentes registrados en el sistema */
    private List<Accidente> accidentes;
    
    /** Lista de visitas a terreno registradas en el sistema */
    private List<VisitaTerreno> visitasTerreno;

    /** Lista de revisiones registradas en el sistema */
    private List<Revision> revisiones;

    /**
     * Constructor por defecto que inicializa todas las listas del contenedor.
     * 
     * <p>Crea instancias vacías de ArrayList para cada tipo de entidad,
     * preparando el contenedor para almacenar datos del sistema.</p>
     */
    public Contenedor() {
        usuarios = new ArrayList<>();
        capacitaciones = new ArrayList<>();
        accidentes = new ArrayList<>();
        visitasTerreno = new ArrayList<>();
        revisiones = new ArrayList<>();
    }

    /*** Getter y Setter ***/
    /**
     * Obtiene la lista de accidentes registrados en el sistema.
     * 
     * @return Lista de accidentes
     */
	public List<Accidente> getAccidentes() {
		return accidentes;
	}

	/**
	 * Establece la lista de accidentes del sistema.
	 * 
	 * @param accidentes Nueva lista de accidentes
	 */
	public void setAccidentes(List<Accidente> accidentes) {
		this.accidentes = accidentes;
	}

	/**
	 * Obtiene la lista de visitas a terreno registradas en el sistema.
	 * 
	 * @return Lista de visitas a terreno
	 */
	public List<VisitaTerreno> getVisitasTerreno() {
		return visitasTerreno;
	}

	/**
	 * Establece la lista de visitas a terreno del sistema.
	 * 
	 * @param visitasTerreno Nueva lista de visitas a terreno
	 */
	public void setVisitasTerreno(List<VisitaTerreno> visitasTerreno) {
		this.visitasTerreno = visitasTerreno;
	}

	/**
	 * Obtiene la lista de revisiones registradas en el sistema.
	 * 
	 * @return Lista de revisiones
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}

	/**
	 * Establece la lista de revisiones del sistema.
	 * 
	 * @param revisiones Nueva lista de revisiones
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}

	/**
	 * Obtiene la lista de usuarios del sistema.
	 * 
	 * @return Lista de usuarios (como instancias de Asesoria)
	 */
	public List<Asesoria> getUsuarios() {
		return usuarios;
	}

	/**
	 * Establece la lista de usuarios del sistema.
	 * 
	 * @param usuarios Nueva lista de usuarios
	 */
	public void setUsuarios(List<Asesoria> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * Obtiene la lista de capacitaciones registradas en el sistema.
	 * 
	 * @return Lista de capacitaciones
	 */
	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	/**
	 * Establece la lista de capacitaciones del sistema.
	 * 
	 * @param capacitaciones Nueva lista de capacitaciones
	 */
	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}
	/*** fin Getter y Setter ***/

	/* ------------------------------------------------------------------------------------------ */
		/**
	 * Almacena un nuevo cliente en la lista de usuarios del sistema.
	 * 
	 * <p>El cliente se almacena como una instancia de Asesoria, permitiendo
	 * el polimorfismo y la gestión unificada de usuarios.</p>
	 * 
	 * @param cliente El cliente a almacenar
	 */
    public void almacenarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    /**
     * Almacena un nuevo profesional en la lista de usuarios del sistema.
     * 
     * <p>El profesional se almacena como una instancia de Asesoria, permitiendo
     * el polimorfismo y la gestión unificada de usuarios.</p>
     * 
     * @param profesional El profesional a almacenar
     */
    public void almacenarProfesional(Profesional profesional) {
        usuarios.add(profesional);
    }

    /**
     * Almacena un nuevo administrativo en la lista de usuarios del sistema.
     * 
     * <p>El administrativo se almacena como una instancia de Asesoria, permitiendo
     * el polimorfismo y la gestión unificada de usuarios.</p>
     * 
     * @param administrativo El administrativo a almacenar
     */
    public void almacenarAdministrativo(Administrativo administrativo) {
        usuarios.add(administrativo);
    }

    /**
     * Almacena una nueva capacitación en la lista de capacitaciones del sistema.
     * 
     * @param capacitacion La capacitación a almacenar
     */
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }
    
    /* ------------------------------------------------------------------------------------------ */    
    /**
     * Almacena un nuevo accidente en la lista de accidentes del sistema.
     * 
     * @param accidente El accidente a almacenar
     */
    public void almacenarAccidente(Accidente accidente) { accidentes.add(accidente); }

    /**
     * Almacena una nueva visita a terreno en la lista correspondiente.
     * 
     * @param visita La visita a terreno a almacenar
     */
    public void almacenarVisitaTerreno(VisitaTerreno visita) { visitasTerreno.add(visita); }

    /**
     * Almacena una nueva revisión en la lista de revisiones del sistema.
     * 
     * @param revision La revisión a almacenar
     */
    public void almacenarRevision(Revision revision) { revisiones.add(revision); }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Lista todos los accidentes registrados en el sistema.
     * 
     * <p>Muestra la información de cada accidente utilizando el método toString()
     * de la clase Accidente.</p>
     */
    public void listarAccidentes() {
        for (Accidente a : accidentes) {
            System.out.println(a.toString());
        }
    }

    /**
     * Lista todas las visitas a terreno registradas en el sistema.
     * 
     * <p>Muestra la información de cada visita a terreno utilizando el método toString()
     * de la clase VisitaTerreno.</p>
     */
    public void listarVisitasTerreno() {
        for (VisitaTerreno v : visitasTerreno) {
            System.out.println(v.toString());
        }
    }

    /**
     * Lista todas las revisiones registradas en el sistema.
     * 
     * <p>Muestra la información de cada revisión utilizando el método toString()
     * de la clase Revision.</p>
     */
    public void listarRevisiones() {
        for (Revision r : revisiones) {
            System.out.println(r.toString());
        }
    }
    
    /* ------------------------------------------------------------------------------------------ */
    /**
     * Elimina un usuario del sistema basándose en su RUN.
     * 
     * <p>Busca en la lista de usuarios (Asesoria) y elimina el usuario
     * que coincida con el RUN proporcionado. Utiliza un Iterator para
     * evitar problemas de concurrencia durante la eliminación.</p>
     * 
     * @param run El RUN del usuario a eliminar
     * @return true si el usuario fue eliminado exitosamente, false si no se encontró
     */
    public boolean eliminarUsuario(int run) {
        Iterator<Asesoria> it = usuarios.iterator();
        while (it.hasNext()) {
            Asesoria a = it.next();
            if (a instanceof Usuario && ((Usuario) a).getRun() == run) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Lista todos los usuarios del sistema mostrando solo los datos básicos.
     * 
     * <p>Recorre la lista de usuarios (Asesoria) y muestra únicamente
     * los datos de la clase Usuario (nombre, fecha de nacimiento, RUN)
     * utilizando el método toString() de la clase Usuario.</p>
     */
    public void listarUsuarios() {
        for (Asesoria a : usuarios) {
            if (a instanceof Usuario) {
                Usuario u = (Usuario) a;
                System.out.println(u.toString());
            }
        }
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Lista usuarios del sistema filtrados por tipo específico.
     * 
     * <p>Recorre la lista de usuarios y muestra únicamente aquellos que
     * correspondan al tipo especificado: "cliente", "profesional" o "administrativo".
     * La comparación es insensible a mayúsculas y minúsculas.</p>
     * 
     * @param tipo El tipo de usuario a listar ("cliente", "profesional", "administrativo")
     */
    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria a : usuarios) {
            switch (tipo.toLowerCase()) {
                case "cliente":
                    if (a instanceof Cliente) System.out.println(a.toString());
                    break;
                case "profesional":
                    if (a instanceof Profesional) System.out.println(a.toString());
                    break;
                case "administrativo":
                    if (a instanceof Administrativo) System.out.println(a.toString());
                    break;
            }
        }
    }

    /* ------------------------------------------------------------------------------------------ */
    /**
     * Lista todas las capacitaciones junto con los datos del cliente asociado.
     * 
     * <p>Para cada capacitación, muestra su información completa y luego
     * busca en la lista de usuarios el cliente asociado (por RUT) para
     * mostrar también sus datos.</p>
     * 
     * <p>Esta funcionalidad permite tener una vista completa de cada capacitación
     * incluyendo la información del cliente que la recibirá.</p>
     */
    public void listarCapacitaciones() {
        for (Capacitacion c : capacitaciones) {
            System.out.println(c.toString());
            // Buscar el cliente asociado por rutCliente
            for (Asesoria a : usuarios) {
                if (a instanceof Cliente && ((Cliente) a).getRut() == c.getRutCliente()) {
                    System.out.println("Datos del cliente: " + ((Cliente) a).toString());
                    break;
                }
            }
        }
    }
    
    
}
