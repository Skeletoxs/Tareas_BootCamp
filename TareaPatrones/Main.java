package com.CompanyA.TareaPatrones;

public class Main {

    public static void main(String[] args) {
        Persona persona = Persona.getInstance();
        Persona persona1 = Persona.getInstance();

        persona.ativar();
        persona1.ativar();

        System.out.println("Son las mismas instancias: " + persona + " " + persona1);
    }
}
