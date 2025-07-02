package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparadorTelefono implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        int apellidoComparison = o1.getApellido().compareTo(o2.getApellido());
        if (apellidoComparison != 0) {
            return apellidoComparison;
        }
        
        int nombreComparison = o1.getNombre().compareTo(o2.getNombre());
        if (nombreComparison != 0) {
            return nombreComparison;
        }
        int telefonoComparison = o1.getTelefono().compareTo(o2.getTelefono());
        if (telefonoComparison != 0) {
            return telefonoComparison;
        }
        
        return o1.getTelefono().compareTo(o2.getTelefono());    
        
    }

    
}
