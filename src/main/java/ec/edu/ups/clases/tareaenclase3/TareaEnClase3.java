
package ec.edu.ups.clases.tareaenclase3;

import ec.edu.ups.clases.tareaenclase3.clases.Agenda;
import ec.edu.ups.clases.tareaenclase3.clases.Contact;
import java.util.Scanner;

public class TareaEnClase3 {

    public static void main(String[] args) {
        Agenda<String, String> agenda = new Agenda<>();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 3) {
            System.out.println("Menu:");
            System.out.println("1. agregar contacto");
            System.out.println("2. eliminar Contacto");
            System.out.println("3. salir");
            System.out.print("seleccione una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Introduzca el nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca el telefono: ");
                    String telefono = scanner.nextLine();
                    Contact<String, String> contact = new Contact<>(nombre, telefono);
                    agenda.addContact(contact);
                    System.out.println("Contacto añadido");
                    break;
                case 2:
                    System.out.print("introduzca el nombre: ");
                    nombre = scanner.nextLine();
                    agenda.removeContact(nombre);
                    System.out.println("Contacto eliminado");
                    break;
                case 3:
                    System.out.println("salirrr gracias hola que hace...");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        }
    }
}
