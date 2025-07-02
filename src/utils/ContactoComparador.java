package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparador implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // primero comparamos por apellido alfábeticamente
        int resultCompararincioApellido = o1.getApellido().compareToIgnoreCase(o2.getApellido());
        // si los apellidos iguales, comparamos por nombre
        if (resultCompararincioApellido != 0) {
            return resultCompararincioApellido;
        }
        return resultCompararincioApellido;
    }
    
}
