package util;

/**
 * Clase utilitaria para validaciones de datos del sistema de prevención de riesgos.
 * 
 * <p>Esta clase proporciona métodos estáticos para validar diferentes tipos de datos
 * de entrada en el sistema, asegurando que los datos cumplan con los requerimientos
 * y restricciones definidas en el contexto del negocio.</p>
 * 
 * <p>Las validaciones incluyen verificación de longitudes de texto, rangos numéricos,
 * formatos de fecha y hora, validación de RUN/RUT, y otros criterios específicos
 * del sistema de prevención de riesgos laborales.</p>
 * 
 * <p>Al ser una clase utilitaria, todos los métodos son estáticos y no requiere
 * instanciación para su uso.</p>
 * 
 * @author Katherine Alderete Gómez
 * @author Katrina González Alarcón  
 * @author Giorgio Interdonato Palacios
 * @version 1.0
 * @since 2024
 */
public class Validador {
	
    /**
	 * Valida que un texto tenga una longitud dentro del rango especificado.
	 * 
	 * <p>Verifica que el texto no sea null y que su longitud esté entre los valores
	 * mínimo y máximo proporcionados, inclusive.</p>
	 * 
	 * @param texto El texto a validar
	 * @param min Longitud mínima permitida (inclusive)
	 * @param max Longitud máxima permitida (inclusive)
	 * @return true si el texto cumple con la validación, false en caso contrario
	 */
	public static boolean validarLongitud(String texto, int min, int max) {
        return texto != null && texto.length() >= min && texto.length() <= max;
    }

    /**
     * Valida que un número esté dentro del rango especificado.
     * 
     * <p>Verifica que el valor numérico esté entre los valores mínimo y máximo
     * proporcionados, inclusive.</p>
     * 
     * @param valor El número a validar
     * @param min Valor mínimo permitido (inclusive)
     * @param max Valor máximo permitido (inclusive)
     * @return true si el valor está dentro del rango, false en caso contrario
     */
    public static boolean validarNumeroRango(int valor, int min, int max) {
        return valor >= min && valor <= max;
    }

    /**
     * Valida que un RUN/RUT esté dentro del rango válido.
     * 
     * <p>Verifica que el RUN sea un número positivo menor a 99.999.999,
     * cumpliendo con las restricciones del sistema chileno de identificación.</p>
     * 
     * @param run El RUN/RUT a validar
     * @return true si el RUN está dentro del rango válido, false en caso contrario
     */
    public static boolean validarRun(int run) {
        return run > 0 && run < 100000000;
    }

    /**
     * Valida que el sistema de salud sea uno de los valores permitidos.
     * 
     * <p>Verifica que el valor corresponda a uno de los sistemas de salud válidos:
     * 1 para Fonasa o 2 para Isapre.</p>
     * 
     * @param sistema El valor del sistema de salud a validar
     * @return true si el valor es válido (1 o 2), false en caso contrario
     */
    public static boolean validarSistemaSalud(int sistema) {
        return sistema == 1 || sistema == 2;
    }

    /**
     * Valida que el día de la semana sea uno de los valores permitidos.
     * 
     * <p>Verifica que el texto corresponda a uno de los días de la semana válidos:
     * lunes, martes, miércoles, jueves, viernes, sábado, domingo.
     * La validación es insensible a mayúsculas y minúsculas.</p>
     * 
     * @param dia El día de la semana a validar
     * @return true si el día es válido, false en caso contrario
     */
    public static boolean validarDiaSemana(String dia) {
        String[] dias = {"lunes","martes","miércoles","jueves","viernes","sábado","domingo"};
        for (String d : dias) {
            if (d.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Valida que una hora esté en formato HH:MM y sea válida.
     * 
     * <p>Verifica que la hora esté en el formato correcto (HH:MM) y que los valores
     * sean válidos: horas entre 0 y 23, minutos entre 0 y 59.</p>
     * 
     * @param hora La hora a validar en formato HH:MM
     * @return true si la hora es válida, false en caso contrario
     */
    public static boolean validarHora(String hora) {
        if (hora == null || !hora.matches("\\d{2}:\\d{2}")) return false;
        try {
            int hh = Integer.parseInt(hora.substring(0, 2));
            int mm = Integer.parseInt(hora.substring(3, 5));
            return (hh >= 0 && hh < 24 && mm >= 0 && mm < 60);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Valida que una fecha esté en formato DD/MM/AAAA.
     * 
     * <p>Verifica que la fecha esté en el formato correcto DD/MM/AAAA
     * utilizando una expresión regular para validar el patrón.</p>
     * 
     * @param fecha La fecha a validar en formato DD/MM/AAAA
     * @return true si la fecha tiene el formato correcto, false en caso contrario
     */
    public static boolean validarFecha(String fecha) {
        return fecha != null && fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }
}
