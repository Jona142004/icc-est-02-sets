package utils;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto> {

@Override
public int compare(Contacto c1, Contacto c2) {
    //Comparas apellidos primero
    int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());
    if (comparacionApellido != 0) {
        return comparacionApellido;
    }
    int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
    if (comparacionNombre != 0) {
        return comparacionNombre;
    }
    //Si los apellidos son iguales comparamos nombres
    return c1.getTelefono().compareToIgnoreCase(c2.getTelefono());       
}

}