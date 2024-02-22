package logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ian
 */
public class Validador {
    public static boolean esTextoNoVacio(String texto) {
        return texto != null && !texto.trim().isEmpty();
    }

    public static boolean esNumero(String numero) {
        return numero != null && numero.matches("\\d+");
    }
    
    public static Date formatearFecha(String fechaTexto) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        return sdf.parse(fechaTexto);
    }

    private static Date sumarUnAnio(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.YEAR, 1);
        return calendar.getTime();
    }

    public static Date formatearFechaVencimiento(Date fecha) {
        // Sumar un año a la fecha
        Date fechaVencimiento = sumarUnAnio(fecha);
        return fechaVencimiento;
    }
    
}
