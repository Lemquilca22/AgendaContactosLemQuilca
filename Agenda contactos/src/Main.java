import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Implementar un menu con 4 opciones
        boolean salir = true;
        String rpta;
        while(salir) {
            System.out.println("¿Que quiere hacer hoy?"+ " Selecciona una opcion");
            System.out.println("1) Añadir contacto"+"\n"+"2) Mostrar contactos"+"\n"+"3) Modificar contacto");
           //+"\n"+"4)Salir"
            int opcion = scan.nextInt();
            int num;
            String nom;
            String nommod;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el numero de telefono: ");
                    num= scan.nextInt();
                    System.out.println("Ingrese el nombre que le quiere asignar: ");
                    nom = scan.next();
                    System.out.println("Usted ha añadido a "+nom+" con numero de telefono: "+num);
                    break;
                case 2:
                    System.out.println("A quien estas buscando");
                    nom = scan.next();
                    System.out.println("Perfecto, encontré a "+nom);

                    break;
                case 3:
                    System.out.println("Que contacto quieres modificar?");
                    nom = scan.next();
                    System.out.println("Perfecto, encontré a "+nom);
                    System.out.println("cual deseas que sea el nuevo nombre");
                    nom = scan.next();
                    System.out.println("Haz modificado el contacto a "+nom);

                   break;
//                case 4:
//                    System.out.println("Nos vemos luego");
//
//                    break;
            }
//            scan.next();
            System.out.println("Deseas realizar otra operación (SI/NO)");
            rpta= scan.next();
            if (rpta.equalsIgnoreCase("NO")){
                salir=false;
                System.out.println("Gracias, nos vemos pronto ");
            }
        }




        }
        }

