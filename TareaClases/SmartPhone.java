package com.CompanyA.TareaClases;

public class SmartPhone extends SmartDevice{
    //Atributos
    double pantalla;
    int size;
    String color;
    String linea;
    boolean acsesorios;
    int camara;

    //Constructor
    public SmartPhone() {

    }

    public SmartPhone(String fabricante, String modelo, int memoria, int ram, String sistemaOperativo, double pantalla, int size, String color, String linea, boolean acsesorios, int camara) {
        super(fabricante, modelo, memoria, ram, sistemaOperativo);
        this.pantalla = pantalla;
        this.size = size;
        this.color = color;
        this.linea = linea;
        this.acsesorios = acsesorios;
        this.camara = camara;
    }
}
