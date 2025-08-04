package servicio;

import modelo.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase Contenedor: almacena usuarios (como Asesoria) y capacitaciones.
 */
public class Contenedor {
	
	private List<Asesoria> usuarios;
    private List<Capacitacion> capacitaciones;
    private List<Accidente> accidentes;
    private List<VisitaTerreno> visitasTerreno;
    private List<Revision> revisiones;

    public Contenedor() {
        usuarios = new ArrayList<>();
        capacitaciones = new ArrayList<>();
        accidentes = new ArrayList<>();
        visitasTerreno = new ArrayList<>();
        revisiones = new ArrayList<>();
    }

    /*** Getter y Setter ***/
    /**
	 * @return the accidentes
	 */
	public List<Accidente> getAccidentes() {
		return accidentes;
	}

	/**
	 * @param accidentes the accidentes to set
	 */
	public void setAccidentes(List<Accidente> accidentes) {
		this.accidentes = accidentes;
	}

	/**
	 * @return the visitasTerreno
	 */
	public List<VisitaTerreno> getVisitasTerreno() {
		return visitasTerreno;
	}

	/**
	 * @param visitasTerreno the visitasTerreno to set
	 */
	public void setVisitasTerreno(List<VisitaTerreno> visitasTerreno) {
		this.visitasTerreno = visitasTerreno;
	}

	/**
	 * @return the revisiones
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}

	/**
	 * @param revisiones the revisiones to set
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}

	/**
	 * @return the usuarios
	 */
	public List<Asesoria> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<Asesoria> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * @return the capacitaciones
	 */
	public List<Capacitacion> getCapacitaciones() {
		return capacitaciones;
	}

	/**
	 * @param capacitaciones the capacitaciones to set
	 */
	public void setCapacitaciones(List<Capacitacion> capacitaciones) {
		this.capacitaciones = capacitaciones;
	}
	/*** fin Getter y Setter ***/

	/* ------------------------------------------------------------------------------------------ */
	// Métodos para almacenar usuarios y capacitaciones (ya existentes)
    public void almacenarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        usuarios.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        usuarios.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }
    
    /* ------------------------------------------------------------------------------------------ */    
    // Métodos para almacenar las nuevas entidades
    public void almacenarAccidente(Accidente accidente) { accidentes.add(accidente); }
    public void almacenarVisitaTerreno(VisitaTerreno visita) { visitasTerreno.add(visita); }
    public void almacenarRevision(Revision revision) { revisiones.add(revision); }

    /* ------------------------------------------------------------------------------------------ */
    // Métodos para listar las nuevas entidades
    public void listarAccidentes() {
        for (Accidente a : accidentes) {
            System.out.println(a.toString());
        }
    }
    
    public void listarVisitasTerreno() {
        for (VisitaTerreno v : visitasTerreno) {
            System.out.println(v.toString());
        }
    }

    public void listarRevisiones() {
        for (Revision r : revisiones) {
            System.out.println(r.toString());
        }
    }
    
    /* ------------------------------------------------------------------------------------------ */
    // Eliminar usuario por RUN
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
    // Listar todos los usuarios (solo datos de Usuario)
    public void listarUsuarios() {
        for (Asesoria a : usuarios) {
            if (a instanceof Usuario) {
                Usuario u = (Usuario) a;
                System.out.println(u.toString());
            }
        }
    }

    /* ------------------------------------------------------------------------------------------ */
    // Listar usuarios por tipo: "cliente", "administrativo", "profesional"
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
    // Listar capacitaciones con datos del cliente asociado
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
