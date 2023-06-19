
package ec.edu.ups.clases.tareaenclase3.clases;

import java.util.LinkedList;


public class Agenda<T, U> {

    private LinkedList<Contact<T, U>> contactos;

    public Agenda() {
        contactos = new LinkedList<>();
    }

    public void addContact(Contact<T, U> contact) {
        contactos.add(contact);
    }

    public Contact<T, U> searchContactByName(String nombre) {
    for (Contact<T, U> contact : contactos) {
        if (contact.getNombre().equals(nombre)) {
            return contact;
        }
    }
    return null;
}

    public void removeContact(T nombre) {
        Contact<T, U> contact = searchContactByName((String) nombre);
        if (contact != null) {
            contactos.remove(contact);
        }
    }
}
