package com.CompanyA.TareaPatrones;

public class Persona{ // Patron de diseño Singelton
    //Atributos
    boolean personaActiva = false;
    private static Persona persona;

    //Constructor bloqueado
    private Persona() {}

    //Getters Y Setters
    public static Persona getInstance() {
        if (persona == null) {
            persona = new Persona();
        }

        return persona;
    }

    //Metodo
    public void ativar() {
        if (!personaActiva) {
            System.out.println("Persona preparandose para hacer ejercicio");
            personaActiva = true;
        } else {
            System.out.println("Ya la persona esta haciendo ejercicio");
        }
    }
}
