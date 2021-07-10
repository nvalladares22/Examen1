package uh.ac.cr.Catalogos;

public class Editorial {
    int Id;
    String Nombre;
    String UbicacionFisica;
    String Telefonocontacto;



    public Editorial(int Id, String Nombre, String UbicacionFisica, String Telefonocontacto) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.UbicacionFisica = UbicacionFisica;
        this.Telefonocontacto = Telefonocontacto;

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getUbicacionFisica() {
        return UbicacionFisica;
    }

    public void setUbicacionFisica(String ubicacionFisica) {
        UbicacionFisica = ubicacionFisica;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }

    public void setTelefonocontacto(String telefonocontacto) {
        Telefonocontacto = telefonocontacto;
    }
}
