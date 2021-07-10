package uh.ac.cr.Catalogos;

import java.util.ArrayList;

public class AdmiEditorial {

    static ArrayList<Editorial> ListaEdito = new ArrayList<>();

    //Ingresar nuevo editorial
    public static boolean EdiExistente(int id) {
        boolean found = false;
        int EditorialIterator = 0;
        while (!found && EditorialIterator < ListaEdito.size()) {
            if (ListaEdito.get(EditorialIterator).getId() == id) {
                found = true;
            }
            EditorialIterator++;
        }
        return found;
    }

    //crear un nueva editorial
    public static boolean NuevaEditorial(int Id, String Nombre, String UbicacionFisica, String Telefonocontacto) {
        boolean crearEdito = false;
        if (!EdiExistente(Id)) {
            Editorial nuevaEditorial = new Editorial(Id, Nombre, UbicacionFisica, Telefonocontacto);
            ListaEdito.add(nuevaEditorial);
            crearEdito = true;
        }
        return crearEdito;
    }

    // consultar datos de la editorial
    public static Editorial ObtenerEdtoPorId(int Id) {
        Editorial editorial = new Editorial(-1, null, null, null);
        int EditoIterator = 0;
        while (EditoIterator < ListaEdito.size()) {
            if (ListaEdito.get(EditoIterator).getId() == Id) {
                return ListaEdito.get(EditoIterator);
            }
            EditoIterator++;
        }
        return editorial;
    }
    // Elimina Editorial
    public static boolean EliminarEditorial(int Id) {
        Editorial editorial = ObtenerEdtoPorId(Id);
        boolean borrado = ListaEdito.remove(editorial);
        return borrado;
    }
}
