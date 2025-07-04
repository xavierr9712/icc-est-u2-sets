import controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Sets sets = new Sets();
        // runHashSet(sets);
        // runLinkedHashSet(sets);
        // runTreeSet(sets);
        // runTreeSetConComparador(sets);
        //ContactoControllers contacto = new ContactoControllers();
        // System.out.println("Agenda Ordenada por Apellido y Nombre");
        // contacto.runTreeContacto();
        // System.out.println("-----------------------------------");
        // System.out.println("Agenda Ordenada por Apellido, Nombre y Telefono");
        // contacto.runTreeContactoTelefonos();
        // System.out.println("-----------------------------------");
        // System.out.println("Agenda Ordenada por hashCode ");
        // contacto.runTreeContactoContactoHash();
        //  System.out.println("-----------------------------------");

        Ejercicios ejercicios = new Ejercicios();
        
       

    }
    public static void runHashSet(Sets sets ) {
        System.out.println("HashSet");
        System.out.println("--------");
        for (String palabra : sets.construrHashSet()) {
            System.out.println(palabra);
        }
    }
    public static void runLinkedHashSet(Sets sets) {
        System.out.println("LinkedHashSet");
        System.out.println("--------------");
        for (String palabra : sets.construirLinkedHashSet()) {
            System.out.println(palabra);
        }
    }
    public static void runTreeSet(Sets sets) {
        System.out.println("TreeSet");
        System.out.println("--------");
        for (String palabra : sets.construirTreeSet()) {
            System.out.println(palabra);
        }
    }
    public static void runTreeSetConComparador(Sets sets) {
        System.out.println("TreeSet con Comparador");
        System.out.println("----------------------");
        for (String palabra : sets.construirTreeSetConComparador()) {
            System.out.println(palabra);
        }
    }
}
