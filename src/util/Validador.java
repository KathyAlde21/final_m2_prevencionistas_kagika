package util;

public class Validador {
	
	public static boolean validarLongitud(String texto, int min, int max) {
        return texto != null && texto.length() >= min && texto.length() <= max;
    }

    public static boolean validarNumeroRango(int valor, int min, int max) {
        return valor >= min && valor <= max;
    }

    public static boolean validarRun(int run) {
        return run > 0 && run < 100000000;
    }

    public static boolean validarSistemaSalud(int sistema) {
        return sistema == 1 || sistema == 2;
    }

    public static boolean validarDiaSemana(String dia) {
        String[] dias = {"lunes","martes","miércoles","jueves","viernes","sábado","domingo"};
        for (String d : dias) {
            if (d.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }

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

    public static boolean validarFecha(String fecha) {
        return fecha != null && fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    }
}
