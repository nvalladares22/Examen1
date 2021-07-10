package uh.ac.cr.Catalogos;

public class Libro {
    int Id;
    Autor Autor;
    String Fechapublicacion;
    int Edicion;
    String Titulo;
    String Editorial;
    int Copias;


    public Libro(int Id, Autor Autor, String Fechapublicacion, int Edicion, String Titulo, String Editorial, int Copias) {
        this.Id = Id;
        this.Autor = Autor;
        this.Fechapublicacion = Fechapublicacion;
        this.Edicion = Edicion;
        this.Titulo = Titulo;
        this.Editorial = Editorial;
        this.Copias = Copias;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public uh.ac.cr.Catalogos.Autor getAutor() {
        return Autor;
    }

    public void setAutor(uh.ac.cr.Catalogos.Autor autor) {
        Autor = autor;
    }

    public String getFechapublicacion() {
        return Fechapublicacion;
    }

    public void setFechapublicacion(String fechapublicacion) {
        Fechapublicacion = fechapublicacion;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int edicion) {
        Edicion = edicion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public int getCopias() {
        return Copias;
    }

    public void setCopias(int copias) {
        Copias = copias;
    }
}
