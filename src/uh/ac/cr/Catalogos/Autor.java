package uh.ac.cr.Catalogos;

public class Autor {
    int Id;
    String NombreAutor;
    String PrimerApellido;
    String SegundoApellido;
    String FechaNacimiento;

    public Autor (int Id,String Nombre, String PrimerApellido,String SegundoApellido,
            String FechaNacimiento ){
        this.Id = Id;
        this.NombreAutor =Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getId() {
        return Id;
    }

    public String getNombreAutor() {
        return NombreAutor;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNombreAutor(String nombreAutor) {
        NombreAutor = nombreAutor;
    }

    public void setPrimerApellido(String primerApellido) {
        this.PrimerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.SegundoApellido = segundoApellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}

