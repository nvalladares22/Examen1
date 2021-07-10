package uh.ac.cr.Catalogos;

import java.util.ArrayList;

public class AdmiAutor {
    static ArrayList<Autor> ListaAutor = new ArrayList<>();

    // confirmacion de autor existente
    public static boolean AutorExistente(int id) {
        boolean found = false;
        int AutorIterator = 0;
        while (!found && AutorIterator < ListaAutor.size()) {
            if (ListaAutor.get(AutorIterator).getId() == id) {
                found = true;
            }
            AutorIterator++;
        }
        return found;
    }

    //crear un nuevo autor
    public static boolean CrearAutor(int Id, String Nombre, String PrimerApellido, String SegundoApellido, String FechaNacimiento) {
        boolean crearAutor = false;
        if (!AutorExistente(Id)) {
            Autor newAutor = new Autor(Id, Nombre, PrimerApellido, SegundoApellido, FechaNacimiento);
            ListaAutor.add(newAutor);
            crearAutor = true;
        }
        return crearAutor;
    }

    // consultar datos del Autor
    public static Autor ObtenerUsaPorId(int Id) {
        Autor autor = new Autor(-1, null, null, null, null);
        int AutorIterator = 0;
        while (AutorIterator < ListaAutor.size()) {
            if (ListaAutor.get(AutorIterator).getId() == Id) {
                return ListaAutor.get(AutorIterator);
            }
            AutorIterator++;
        }
        return autor;
    }

    //Actualiza datos de autor
    public static boolean ActualizarAutor(Autor Autor, String Nombre, String PrimerApellido, String SegundoApellido, String FechaNacimiento) {
        if (Nombre != "") {
            Autor.setNombreAutor(Nombre);
        }
        if (PrimerApellido != "") {
            Autor.setPrimerApellido(PrimerApellido);
        }
        if (SegundoApellido != "") {
            Autor.setSegundoApellido(SegundoApellido);
        }
        if (FechaNacimiento != "") {
            Autor.setFechaNacimiento(FechaNacimiento);
        }

        return true;
    }

    // Elimina un Autor
    public static boolean EliminarAutor(int Id) {
        Autor autor = ObtenerUsaPorId(Id);
        boolean borrado = ListaAutor.remove(autor);
        return borrado;
    }
}
