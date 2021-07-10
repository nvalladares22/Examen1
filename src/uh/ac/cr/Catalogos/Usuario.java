package uh.ac.cr.Catalogos;



public class Usuario {

    int Id;
    String Nombre;
    String PrimerApellido;
    String SegundoApellido;
    String contactoTelefono;



    public Usuario(int Id, String Nombre, String PrimerApellido, String SegundoApellido, String contactoTelefono) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.contactoTelefono = contactoTelefono;
    }

    public int getId(){
        return Id;
    }

    public String getNombre(){
        return Nombre;
    }

    public String getPrimerApellido(){
        return PrimerApellido;
    }

    public String getSegundoApellido(){
        return SegundoApellido;
    }

    public String getContactoTelefono(){
        return contactoTelefono;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setPrimerApellido(String PrimerApellido){
        this.PrimerApellido = PrimerApellido;
    }

    public void setSegundoApellido(String SegundoApellido){
        this.SegundoApellido = SegundoApellido;
    }

    public void setContactoTelefono(String contactoTelefono){
        this.contactoTelefono=contactoTelefono;
    }


}


