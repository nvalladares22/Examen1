package uh.ac.cr;
import java.util.Scanner;

import uh.ac.cr.Catalogos.AdmiAutor;
import uh.ac.cr.Catalogos.AdmiEditorial;
import uh.ac.cr.Catalogos.AdmiLibro;
import uh.ac.cr.Catalogos.AdmiUsuario;
import uh.ac.cr.Catalogos.Autor;
import uh.ac.cr.Catalogos.Libro;
import uh.ac.cr.Catalogos.Usuario;
import uh.ac.cr.Catalogos.Editorial;






public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedOption;

        do {
            System.out.println("\n---------------------------------------------------------------------\n");
            System.out.println("Menu principal");
            System.out.println("1-Administrar catálogos de datos");
            System.out.println("2-Solicitar nuevo préstamo.");
            System.out.println("3-Consultar todos los préstamos.");
            System.out.println("4-Consultar todos los préstamos realizados por un usuario.");
            System.out.println("5-Consultar todos los préstamos realizados de un libro.");
            System.out.println("6-Salir del sistema");
            System.out.println("-Ingrese su seleccion ");
            System.out.println("\n---------------------------------------------------------------------\n");
            selectedOption = scanner.nextInt();

            switch (selectedOption){
                case 1:
                    int optSubMenu;


                    do {
                        System.out.println("\n---------------------------------------------------------------------\n");
                        System.out.println("1-Catálogo de autor");
                        System.out.println("2-Catálogo de editorial");
                        System.out.println("3-Catalogo de libro");
                        System.out.println("4-Catalogo de Usuario");
                        System.out.println("5-salir");
                        System.out.println("\n---------------------------------------------------------------------\n");
                        optSubMenu = scanner.nextInt();

                        switch (optSubMenu) {
                            case 1:
                                int opt1;

                                do {
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    System.out.println("1-Ingresar nuevo autor");
                                    System.out.println("2-Consultar datos de un autor");
                                    System.out.println("3-Actualizar datos de un autor");
                                    System.out.println("4-Eliminar un autor");
                                    System.out.println("5-salir");
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    opt1 = scanner.nextInt();
                                    switch (opt1) {
                                        case 1:
                                            int Id;
                                            String nombre;
                                            String primerApellido;
                                            String segundoApellido;
                                            String FechaNacimiento;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id");
                                            Id = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el nombre");
                                            nombre = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el primer apellido");
                                            primerApellido = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el segundo apellido");
                                            segundoApellido = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite la Fecha de nacimiento: mes/día/año");
                                            FechaNacimiento = scanner.next();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean autor = AdmiAutor.CrearAutor(Id,nombre,primerApellido,segundoApellido, FechaNacimiento);
                                            if(autor){
                                                System.out.println("El autor se creo con exito!!");
                                            }else {
                                                System.out.println("Error al crear el autor, ya existe un Autor con el id = " + Id);
                                            }
                                            break;
                                        case 2:
                                            int consultarId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id");
                                            consultarId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Autor autorExistente = AdmiAutor.ObtenerUsaPorId(consultarId);
                                            if(autorExistente.getId() != -1){
                                                System.out.println("Datos del Autor");
                                                System.out.println("Id = " + autorExistente.getId());
                                                System.out.println("Nombre = " + autorExistente.getNombreAutor());
                                                System.out.println("Primer Apellido = " + autorExistente.getPrimerApellido());
                                                System.out.println("Segundo Apellido = " + autorExistente.getSegundoApellido());
                                                System.out.println("Fecha de Nacimiento  = " + autorExistente.getFechaNacimiento());
                                            }else {
                                                System.out.println("Error no existe un autor con el id = " + consultarId);
                                            }
                                            break;
                                        case 3:
                                            String actualizar;
                                            int ActuAutorId;
                                            String actializarNombre;
                                            String actializarPrimerApellido;
                                            String actializarSegundoApellido;
                                            String actializarFechaNacimiento;

                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite su id");
                                            ActuAutorId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Autor updateActor = AdmiAutor.ObtenerUsaPorId(ActuAutorId);
                                            if(updateActor.getId() != -1){
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite SI si deseas actualizar el Nombre de lo contrario dijite No");
                                                actualizar = scanner.next();
                                                if(actualizar.equals("SI") || actualizar.equals("si")){
                                                    System.out.println("Por favor digite el nombre que desea actualizar");
                                                    actializarNombre = scanner.next();
                                                }else{
                                                    actializarNombre = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite SI si deseas actualizar el primer apellido de lo contrario dijite No");
                                                actualizar = scanner.next();
                                                if(actualizar.equals("SI") || actualizar.equals("si")){
                                                    System.out.println("Por favor digite el  primer apellido");
                                                    actializarPrimerApellido = scanner.next();
                                                }else{
                                                    actializarPrimerApellido = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite SI si deseas actualizar el segundo apellido de lo contrario dijite No");
                                                actualizar = scanner.next();
                                                if(actualizar.equals("SI") || actualizar.equals("si")){
                                                    System.out.println("Por favor digite el cambio del segundo apellido");
                                                    actializarSegundoApellido = scanner.next();
                                                }else{
                                                    actializarSegundoApellido = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite Si si deseas actualizar el telefono de lo contrario dijite No");
                                                actualizar = scanner.next();
                                                if(actualizar.equals("SI") || actualizar.equals("si")){
                                                    System.out.println("Por favor digite el  telefono ");
                                                    actializarFechaNacimiento = scanner.next();
                                                }else{
                                                    actializarFechaNacimiento = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------\n");
                                                boolean isUpdated = AdmiAutor.ActualizarAutor(updateActor, actializarNombre, actializarPrimerApellido, actializarSegundoApellido, actializarFechaNacimiento);
                                                if(isUpdated){
                                                    System.out.println("El usuario fue actualizado con exito!!");
                                                }
                                            }else {
                                                System.out.println("Error no existe un usuario con el id = " + ActuAutorId);
                                            }
                                            break;
                                        case 4:
                                            int eliminarAutorId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id del Autor que desea eliminar");
                                            eliminarAutorId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean eliminando = AdmiAutor.EliminarAutor(eliminarAutorId);
                                            if(eliminando){
                                                System.out.println("El Autor se elimino Correctamente");
                                            }else{
                                                System.out.println("El Autor no se pudo eliminar");
                                            }
                                            break;
                                        default:
                                            System.out.println("dato incorrecto");
                                    }



                                }
                                while (opt1 != 5);
                                break;
                            case 2:
                                int opt2;

                                do {
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    System.out.println("1-Ingresar nueva editorial");
                                    System.out.println("2-Consultar datos de una editorial");
                                    System.out.println("3-Eliminar una editorial");
                                    System.out.println("4-salir");
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    opt2 = scanner.nextInt();
                                    switch (opt2) {
                                        case 1: //opcionn1
                                            int id;
                                            String nombre;
                                            String UbicacionFisica;
                                            String Telefonocontacto;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id");
                                            id = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el nombre");
                                            nombre = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite la ubicación fisica ");
                                            UbicacionFisica = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el numero de contecto");
                                            Telefonocontacto= scanner.next();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean user = AdmiEditorial.NuevaEditorial(id,nombre,UbicacionFisica,Telefonocontacto);
                                            if(user){
                                                System.out.println("La editorial se creo con exito!!");
                                            }else {
                                                System.out.println("Error al crear la editorial, ya existe una editorial con el id = " + id);
                                            }

                                            break;
                                        case 2: //opcion 2 consultar
                                            int consulId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id");
                                            consulId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Editorial Ediexistente = AdmiEditorial.ObtenerEdtoPorId(consulId);
                                            if(Ediexistente.getId() != -1){
                                                System.out.println("Datos de al Editorial");
                                                System.out.println("Id = " + Ediexistente.getId());
                                                System.out.println("Nombre = " + Ediexistente.getNombre());
                                                System.out.println("Telefono de contecto = " + Ediexistente.getTelefonocontacto());
                                                System.out.println("Ubicacion Fisica = " + Ediexistente.getUbicacionFisica());

                                            }else {
                                                System.out.println("Error no existe la editorial con el id = " + consulId);
                                            }
                                            break;
                                        case 3: //opt3
                                            int eliminarEditoId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id de la editorial que desea eliminar");
                                            eliminarEditoId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean isDeleted = AdmiUsuario.EliminarUser(eliminarEditoId);
                                            if(isDeleted){
                                                System.out.println("La editorial se elimino Correctamente");
                                            }else{
                                                System.out.println("La editorial no se pudo eliminar");
                                            }
                                            break;
                                        default:
                                            System.out.println("dato incorrecto");
                                    }
                                }
                                while (opt2 != 4);
                                break;
                            case 3:
                                int opt3;

                                do {
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    System.out.println("1-Ingresa un nuevo libro");
                                    System.out.println("2-Consultar datos de un libro");
                                    System.out.println("3-Eliminar un libro");
                                    System.out.println("4-salir");
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    opt3 = scanner.nextInt();
                                    switch (opt3) {
                                        case 1: //opcion 1 nuevo libro
                                            int id;
                                            int Edicion;
                                            int Copias;
                                            String Fechapiblicacion;
                                            String Titulo;
                                            String Editorial;
                                            int IdAutor;
                                            String nombreAutor;
                                            String AuprimerApellido;
                                            String AusegundoApellido;
                                            String AuFechaNacimiento;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite su id");
                                            id = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el Id del Autor");
                                            IdAutor = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su nombre");
                                            nombreAutor = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su primer apellido");
                                            AuprimerApellido = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su segundo apellido");
                                            AusegundoApellido = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su contacto de telefono");
                                            AuFechaNacimiento = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite Fecha de publicacion");
                                            Fechapiblicacion = scanner.next();

                                            System.out.println("Digite el titulo del libro");
                                            Titulo = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite la editorial del libro");
                                            Editorial = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite cuantas copias hay");
                                            Copias= scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite el numero de edición");
                                            Edicion = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Autor newAutor = new Autor(IdAutor,nombreAutor, AuprimerApellido, AusegundoApellido, AuFechaNacimiento);
                                            boolean libro = AdmiLibro.LibroNuevo(id,newAutor,Fechapiblicacion,Edicion,Editorial,Titulo,Copias);
                                            if(libro){
                                                System.out.println("El libro se creo con exito!!");
                                            }else {
                                                System.out.println("Error al crear el libro, ya existe un libro con el id = " + id);
                                            }
                                            break;
                                        case 2: //opcion 2
                                            int consultarId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id");
                                            consultarId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Libro Libroexistente = AdmiLibro.ConsulDatoPorId(consultarId);
                                            if(Libroexistente.getId() != -1){
                                                System.out.println("Datos del Libro");
                                                System.out.println("Id = " + Libroexistente.getId());
                                                System.out.println("Autor = " +  Libroexistente.getAutor());
                                                System.out.println("Titulo = " + Libroexistente.getTitulo());
                                                System.out.println("Editorial = " + Libroexistente.getEditorial());
                                                System.out.println("Edicion = " + Libroexistente.getEdicion());
                                                System.out.println("Fecha de publicación = " + Libroexistente.getFechapublicacion());
                                                System.out.println("Copias = " + Libroexistente.getCopias());
                                            }else {
                                                System.out.println("Error no existe un libro con el id = " + consultarId);
                                            }
                                            break;
                                        case 3: //opt3
                                            int eliminarLibroId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id del Libro que desea eliminar");
                                            eliminarLibroId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean eliminar = AdmiLibro.EliminarLibro(eliminarLibroId);
                                            if(eliminar){
                                                System.out.println("El Libro se elimino Correctamente");
                                            }else{
                                                System.out.println("El libro no se pudo eliminar");
                                            }
                                            break;
                                        default:
                                            System.out.println("dato incorrecto");
                                    }

                                }
                                while (opt3 != 4);

                                break;
                            case 4:
                                int opt4;

                                do {
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    System.out.println("1-Ingresar un nuevo usuario");
                                    System.out.println("2-Consultar datos de un usuario");
                                    System.out.println("3-Actualizar datos de un usuario");
                                    System.out.println("4-Eliminar un usuario");
                                    System.out.println("5-salir");
                                    System.out.println("\n---------------------------------------------------------------------\n");
                                    opt4 = scanner.nextInt();
                                    switch (opt4) {
                                        case 1: //opcionn 1 crear usuario
                                            int id;
                                            String nombre;
                                            String primerApellido;
                                            String segundoApellido;
                                            String contactoTelefono;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite su id");
                                            id = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su nombre");
                                            nombre = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su primer apellido");
                                            primerApellido = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su segundo apellido");
                                            segundoApellido = scanner.next();
                                            System.out.println("---------------------------------------------------------------------");
                                            System.out.println("Digite su contacto de telefono");
                                            contactoTelefono = scanner.next();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean user = AdmiUsuario.CreaUsuario(id,nombre,primerApellido,segundoApellido,contactoTelefono);
                                            if(user){
                                                System.out.println("El usuario se creo con exito!!");
                                            }else {
                                                System.out.println("Error al crear el usuario, ya existe un usuario con el id = " + id);
                                            }
                                            break;
                                        case 2: //opcion 2 Consultar
                                            int consultarId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite su id");
                                            consultarId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Usuario existUser = AdmiUsuario.ObteUsaPorId(consultarId);
                                            if(existUser.getId() != -1){
                                                System.out.println("Datos del Usuario");
                                                System.out.println("Id = " + existUser.getId());
                                                System.out.println("Nombre = " + existUser.getNombre());
                                                System.out.println("Primer Apellido = " + existUser.getPrimerApellido());
                                                System.out.println("Segundo Apellido = " + existUser.getSegundoApellido());
                                                System.out.println("Telefono = " + existUser.getContactoTelefono());
                                            }else {
                                                System.out.println("Error no existe un usuario con el id = " + consultarId);
                                            }
                                            break;
                                        case 3: //opcion3 Actualizar
                                            String update;
                                            int actualizarUserId;
                                            String actializarNombre;
                                            String actializarPrimerApellido;
                                            String actializarSegundoApellido;
                                            String actializarContactoTelefono;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite su id");
                                            actualizarUserId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            Usuario updateUser = AdmiUsuario.ObteUsaPorId(actualizarUserId);
                                            if(updateUser.getId() != -1){
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite Si si deseas actualizar el Nombre de lo contrario dijite No");
                                                update = scanner.next();
                                                if(update.equals("SI") || update.equals("si")){
                                                    System.out.println("Por favor digite el nombre que desea actualizar");
                                                    actializarNombre = scanner.next();
                                                }else{
                                                    actializarNombre = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite Si si deseas actualizar el primer apellido de lo contrario dijite No");
                                                update = scanner.next();
                                                if(update.equals("SI") || update.equals("si")){
                                                    System.out.println("Por favor digite el  primer apellido");
                                                    actializarPrimerApellido = scanner.next();
                                                }else{
                                                    actializarPrimerApellido = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite Si si deseas actualizar el segundo apellido de lo contrario dijite No");
                                                update = scanner.next();
                                                if(update.equals("SI") || update.equals("si")){
                                                    System.out.println("Por favor digite el cambio del segundo apellido");
                                                    actializarSegundoApellido = scanner.next();
                                                }else{
                                                    actializarSegundoApellido = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------");
                                                System.out.println("Por favor dijite Si si deseas actualizar el telefono de lo contrario dijite No");
                                                update = scanner.next();
                                                if(update.equals("SI") || update.equals("si")){
                                                    System.out.println("Por favor digite el  telefono ");
                                                    actializarContactoTelefono = scanner.next();
                                                }else{
                                                    actializarContactoTelefono = "";
                                                }
                                                System.out.println("---------------------------------------------------------------------\n");
                                                boolean isUpdated = AdmiUsuario.ActualizarUser(updateUser, actializarNombre, actializarPrimerApellido, actializarSegundoApellido, actializarContactoTelefono);
                                                if(isUpdated){
                                                    System.out.println("El usuario fue actualizado con exito!!");
                                                }
                                            }else {
                                                System.out.println("Error no existe un usuario con el id = " + actualizarUserId);
                                            }
                                            break;
                                        case 4: //opt4
                                            int eliminarUserId;
                                            System.out.println("\n---------------------------------------------------------------------");
                                            System.out.println("Digite el id del usuario que desea eliminar");
                                            eliminarUserId = scanner.nextInt();
                                            System.out.println("---------------------------------------------------------------------\n");
                                            boolean isDeleted = AdmiUsuario.EliminarUser(eliminarUserId);
                                            if(isDeleted){
                                                System.out.println("El usuario se elimino Correctamente");
                                            }else{
                                                System.out.println("El usuario no se pudo eliminar");
                                            }
                                            break;
                                        default:
                                            System.out.println("dato incorrecto");
                                    }
                                }
                                while (opt4 != 5);

                                break;
                        }
                    }
                    while (optSubMenu != 5);
                    break;

                case 2:
                    // llamar a solicitar prestamo
                    break;

                case 3:
                    // llamar a consultar los prestamos
                    break;
                case 4:
                    //llamar a consultar los prestamos realizados
                    break;
                case 5:
                    // llamar a consultar los prestamos realizados de un libro
                    break;
                case 6:
                    System.out.println("Muchas gracias por usar el sistema");
                    break;

                default:
                    System.out.println("dato incorrecto");
            }
        }
        while (selectedOption != 6);
    }
}