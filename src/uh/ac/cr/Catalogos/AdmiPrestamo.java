package uh.ac.cr.Catalogos;

import java.util.ArrayList;

public class AdmiPrestamo {
    static ArrayList<Prestamo> prestamo = new ArrayList<>();

    public static boolean prestamoExistente(int id) {
        boolean found = false;
        int PrestamoIterator = 0;
        while (!found && PrestamoIterator < prestamo.size()) {
            if (prestamo.get(PrestamoIterator).getId() == id) {
                found = true;
            }
            PrestamoIterator++;
        }
        return found;
    }
    public static boolean CreaPrestamo(int Id, Usuario usaSolicitante, Libro libroSolicitante, String FechaSolicitado, String FechaDevolucion, boolean Culminado){
        boolean crearPrestamo = false;
        if (!prestamoExistente(Id)){
            Prestamo nuevoPrestamo = new Prestamo(Id,usaSolicitante, libroSolicitante,FechaSolicitado,FechaDevolucion, Culminado);
            prestamo.add(nuevoPrestamo);
            crearPrestamo = true;
        }
        return crearPrestamo;

    }
}
