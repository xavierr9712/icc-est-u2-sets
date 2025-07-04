package controllers;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios() {
        System.out.println("ejercicio 1");
        System.out.println(tieneDuplicados (new int[]{1, 2, 3, 4, 5}));
        System.out.println(tieneDuplicados (new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("ejercicio 2");
        System.out.println(esIsograma("mursielago"));
        System.out.println(esIsograma("camaleon"));
        System.out.println("ejercicio 3");
        String texto = """
            La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía?
                    Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente.
                    En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.""";
        String texto1 = "¡Hola! La programación en Java es muy divertida, sobre todo cuando se entienden los conceptos.";
        String texto2 = "Java es divertido. Aprender programación puede ser un reto, pero también muy gratificante.";
    }

    public boolean tieneDuplicados(int[] numeros) {
        Set<Integer> conjunto = new java.util.HashSet<>();
        for (int numero : numeros) {
            if (!conjunto.add(numero)) {
                return true; 
            }
        }
        return false; 
    }

        

    public boolean esIsograma(String palabra) {
        Set<Character> conjunto = new java.util.HashSet<>();
        for (char letra : palabra.toCharArray()) {
            if (!conjunto.add(letra)) {
                return true; 
            }
        }
        return false;      
    }

    public int contarPalabrasUnicas(String[] palabras) {
        Set<String> palabrasUnicas = new java.util.HashSet<>();
        for (String palabra : palabras) {
            if (palabra.isEmpty()) {
                palabrasUnicas.add(palabra); // Ignorar palabras vacías
            }
            palabrasUnicas.add(palabra);
        }

        return palabrasUnicas.size();
    }
    public void compararPalabras(String texto1, String texto2) {

        Set<String> palabras1 = obtenerPalabrasUnicas(texto1);
        Set<String> palabras2 = obtenerPalabrasUnicas(texto2);

        Set<String> comunes = new java.util.HashSet<>(palabras1);
        comunes.retainAll(palabras2); 
        Set<String> solo1 = new java.util.HashSet<>(palabras1);
        solo1.removeAll(palabras2);

        Set<String> solo2 = new java.util.HashSet<>(palabras2);
        solo2.removeAll(palabras1);

        Set<String> total = new HashSet<>();
        total.addAll(palabras1);
        total.addAll(palabras2);

        double porcentaje = (comunes.size() * 100.0)/ total.size();

        System.out.println("Texto 1:" + palabras1.size() + " palabras unicas");
        System.out.println("Texto 2:" + palabras2.size() + " palabras unicas");
        System.out.println("Cuantas Palabras comunes: " + comunes.size());
        System.out.println("concidencia lexical: " + porcentaje + "%");
        System.out.println("Palabras solo en texto 1: " + solo1.size());
        System.out.println("Palabras solo en texto 2: " + solo2.size());
    }
    
    
}
