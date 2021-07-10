package uh.ac.cr.Catalogos;

public class Prestamo {
    int Id;
    Usuario usaSolicitante;
    Libro libroSolicitante;
    String FechaSolicitado;
    String FechaDevolucion;
    boolean Culminado;

public Prestamo(int Id, Usuario usaSolicitante, Libro libroSolicitante, String FechaSolicitado, String FechaDevolucion, boolean Culminado){
    this.Id=Id;
    this.libroSolicitante=libroSolicitante;
    this.usaSolicitante=usaSolicitante;
    this.FechaSolicitado=FechaSolicitado;
    this.FechaDevolucion=FechaDevolucion;
    this.Culminado=Culminado;
}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Usuario getUsaSolicitante() {
        return usaSolicitante;
    }

    public void setUsaSolicitante(Usuario usaSolicitante) {
        this.usaSolicitante = usaSolicitante;
    }

    public Libro getLibroSolicitante() {
        return libroSolicitante;
    }

    public void setLibroSolicitante(Libro libroSolicitante) {
        this.libroSolicitante = libroSolicitante;
    }

    public String getFechaSolicitado() {
        return FechaSolicitado;
    }

    public void setFechaSolicitado(String fechaSolicitado) {
        FechaSolicitado = fechaSolicitado;
    }

    public String getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        FechaDevolucion = fechaDevolucion;
    }

    public boolean isCulminado() {
        return Culminado;
    }

    public void setCulminado(boolean culminado) {
        Culminado = culminado;
    }
}
