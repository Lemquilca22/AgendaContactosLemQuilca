package Agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void print(){
        System.out.println("¿Que quiere hacer hoy?"+ " Selecciona una opcion");
        System.out.println("1) Añadir contacto"+
                "\n"+"2) Mostrar contactos"+
                "\n"+"3) Modificar contacto"+
                "\n"+"4) Buscar contacto");
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contacto> listaContactos = new ArrayList<>(); //Este array guarda objetos

        boolean salir = true;
        while (salir) {
            print();
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre: "); String nombre=sc.nextLine();
                    System.out.println("Telefono: "); int telefono=sc.nextInt(); sc.nextLine();
                    System.out.println("Correo: "); String correo=sc.nextLine();
                    listaContactos.add(new Contacto(nombre, telefono, correo));
                    //Tenemos que pasarle todos los parametros del contacto
                    break;
                case 2:
                    for (Contacto c : listaContactos) {
                        c.mostrarContacto();
                    }
                    break;
                case 3:
                    System.out.println("Contacto a modificar: ");
                    String buscarnom=sc.nextLine();

                    boolean encontrado= false;
                    for (Contacto c: listaContactos){
                        if (c.getNombreContacto().equalsIgnoreCase(buscarnom)){
                            System.out.println("Nuevo nombre: ");
                            String nuevoNombre=sc.nextLine();
                            System.out.println("Nuevo telefono: ");
                            int nuevoTelefono=sc.nextInt(); sc.nextLine();
                            System.out.println("Nuevo email");
                            String nuevoCorreo=sc.nextLine();
                            //Utilizo este set para modificar los datos.
                            c.setNombreContacto(nuevoNombre);
                            c.setNumeroContacto(nuevoTelefono);
                            c.setCorreoContacto(nuevoCorreo);
                            System.out.println("Se modificó correctamente");
                            encontrado=true;
                        }
                        if (!encontrado){
                            System.out.println("No encontré ese contacto");
                        }
                    }
                    break;
                case 4:

                    break;
            }
        }

    }
}
