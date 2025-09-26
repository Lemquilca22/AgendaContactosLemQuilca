import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Implementar un menu con 4 opciones

        System.out.println("¿Que quiere hacer hoy?"+ " Selecciona una opcion");
        System.out.println("Añadir contacto"+"\n"+"Mostrar contactos"+"\n"+"Buscar contacto"+"\n"+"Salir");

        String leer = scan.nextLine();

        System.out.println("Usted a escogido "+leer);

        }
        }

