package controllers;

import java.util.Set;
import java.util.TreeSet;


import models.Contacto;
import utils.ContactoComparador;
import utils.ContactoComparadorHash;
import utils.ContactoComparadorTelefono;

public class ContactoControllers {

    public ContactoControllers() {
        runTreeContacto();
    }
    
    public void runTreeContacto() {

        Set<Contacto> agenda = new TreeSet<>(new ContactoComparador());

        System.out.println("Agenda Ordenada por Apellido, Nombre");


        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda.add(new Contacto("Pablo", "Lopez","222222222"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
       
       
    }
    public void runTreeContactoTelefonos() {

        Set<Contacto> agenda2 = new TreeSet<>(new ContactoComparadorTelefono());


        agenda2.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda2.add(new Contacto("Luis", "Perez", "111111111"));
        agenda2.add(new Contacto("Ana", "Perez", "987654321"));
        agenda2.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda2.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda2.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda2.add(new Contacto("Pablo", "Lopez","222222222"));

        for (Contacto contacto : agenda2) {
            System.out.println(contacto);
        }
       
    }
     public void runTreeContactoContactoHash() {

        Set<Contacto> agenda3 = new TreeSet<>(new ContactoComparadorHash());


        agenda3.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda3.add(new Contacto("Luis", "Perez", "111111111"));
        agenda3.add(new Contacto("Ana", "Perez", "987654321"));
        agenda3.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda3.add(new Contacto("Pedro", "Lopez","222222222"));
        agenda3.add(new Contacto("Pedro", "Gonzales","222222222"));
        agenda3.add(new Contacto("Pablo", "Lopez","222222222"));

        for (Contacto contacto : agenda3) {
            System.out.println(contacto);
        }   
       
    }

}