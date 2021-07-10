package uh.ac.cr.Catalogos;

import java.util.ArrayList;


public class AdmiUsuario {
    static ArrayList<Usuario> usuario = new ArrayList<>();

    public static boolean existenteUsuario(int id) {
        boolean found = false;
        int UsuarioIterator = 0;
        while (!found && UsuarioIterator < usuario.size()) {
            if (usuario.get(UsuarioIterator).getId() == id) {
                found = true;
            }
            UsuarioIterator++;
        }
        return found;
    }
    //crear
    public static boolean CreaUsuario(int Id, String Nombre, String PrimerApellido, String SegundoApellido, String contactoTelefono){
        boolean crearUsuario = false;
        if (!existenteUsuario(Id)){
            Usuario newUsuario = new Usuario(Id,Nombre, PrimerApellido, SegundoApellido,contactoTelefono);
            usuario.add(newUsuario);
            crearUsuario = true;
        }
        return crearUsuario;
    }

    //Consultar Usuario
    public static Usuario ObteUsaPorId(int Id){
        Usuario user = new Usuario(-1,null,null,null, null);
        int UsuarioIterator = 0;
        while (UsuarioIterator < usuario.size()) {
            if (usuario.get(UsuarioIterator).getId() == Id) {
                return usuario.get(UsuarioIterator);
            }
            UsuarioIterator++;
        }
        return user;
    }

    //Actualizar Usuario
    public static boolean ActualizarUser(Usuario Usuario, String Nombre, String PrimerApellido, String SegundoApellido, String contactoTelefono){
        if(Nombre != ""){
            Usuario.setNombre(Nombre);
        }
        if(PrimerApellido != ""){
            Usuario.setPrimerApellido(PrimerApellido);
        }
        if(SegundoApellido != ""){
            Usuario.setSegundoApellido(SegundoApellido);
        }
        if(contactoTelefono != ""){
            Usuario.setContactoTelefono(contactoTelefono);
        }

        return true;
    }

    //Eliminar Usuario
    public static boolean EliminarUser(int Id){
        Usuario user = ObteUsaPorId(Id);
        boolean borrado = usuario.remove(user);
        return borrado;
    }
}

