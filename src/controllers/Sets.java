package controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public  Set<String>  construrHashSet() {
       
        Set<String> palabaras = new HashSet<>();
        
        palabaras.add("Laptop");
        palabaras.add("Manzana");
        palabaras.add("Pera");
        palabaras.add("Celular");
        palabaras.add("Laptop");
        palabaras.add("Celular");

        return palabaras;
    }
    public Set<String> construirLinkedHashSet() {

        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }
    public Set<String> construirTreeSet() {

        Set<String> palabras = new TreeSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Celular");
        return palabras;
    }
    public Set<String> construirTreeSetConComparador() {

        // implementacion de comparador, para comparacion especifica
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Primero comparamos por la longitud
                int result = Integer.compare(s1.length(), s2.length());
                // Si son iguales en tamaño, comparamos alfabéticamente
                if (result == 0) {
                    result = s1.compareTo(s2);
                }
                return result;
            }
        };


        Set<String> palabaras = new TreeSet<>(comparador);
        palabaras.add("Laptop");
        palabaras.add("Manzana");
        palabaras.add("Pera");
        palabaras.add("Celular");
        palabaras.add("Laptop");
        palabaras.add("Celular");
        palabaras.add("Celulas");

        return palabaras;

    }
    
    
    public Set<String> construirTreeSetConComparador2() {
    // Creara otro metodo que se imprima ene este oreden 
    // Manzana,Celulas ,Celular ,laptop, Pera. 
        Comparator<String> comparador = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Primero comparamos por la longitud
                int result = Integer.compare(s2.length(), s1.length());
                // Si son iguales en tamaño, comparamos alfabéticamente
                if (result == 0) {
                    result = s2.compareTo(s1);
                }
                return result;
            }
        };

        
    Set<String> palabaras = new TreeSet<>(comparador);
        palabaras.add("Laptop");
        palabaras.add("Manzana");
        palabaras.add("Pera");
        palabaras.add("Celular");
        palabaras.add("Laptop");
        palabaras.add("Celular");
        palabaras.add("Celulas");

        return palabaras;
  

    } 
}