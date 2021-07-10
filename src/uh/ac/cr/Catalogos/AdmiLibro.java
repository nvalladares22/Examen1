package uh.ac.cr.Catalogos;

import java.util.ArrayList;

public class AdmiLibro {
    static ArrayList<Libro> ListaLibro = new ArrayList<>();

    public static boolean LibroExistente(int id) {
        boolean found = false;
        int LibroIterator = 0;
        while (!found && LibroIterator < ListaLibro.size()) {
            if (ListaLibro.get(LibroIterator).getId() == id) {
                found = true;
            }
            LibroIterator++;
        }
        return found;
    }

    // nuevo libro
    public static boolean LibroNuevo(int Id, Autor Autor, String Fechapublicacion, int Edicion, String Titulo, String Editorial, int Copias) {
        boolean nuevoLibro = false;
        if (!LibroExistente(Id)) {
            Libro newLibro = new Libro(Id, Autor, Fechapublicacion, Edicion, Editorial, Titulo, Copias);
            ListaLibro.add(newLibro);
            nuevoLibro = true;
        }
        return nuevoLibro;
    }

    //consultar datos del libro
    public static Libro ConsulDatoPorId(int Id) {
        Libro Datolibro = new Libro(-1, null, null, -1, null, null, -1);
        int LibroIterator = 0;
        while (LibroIterator < ListaLibro.size()) {
            if (ListaLibro.get(LibroIterator).getId() == Id) {
                return ListaLibro.get(LibroIterator);
            }
            LibroIterator++;
        }
        return Datolibro;
    }

    //eliminar libro
    public static boolean EliminarLibro(int Id) {
        Libro libro = ConsulDatoPorId(Id);
        boolean borrar = ListaLibro.remove(libro);
        return borrar;

    }
}
