package com.CompanyA.TareaClases;

public class SmartWatch extends SmartDevice {
    //Atributos
    String color;
    boolean bluetooth;
    int size;
    boolean camara;

    //Contructor
    public SmartWatch() {

    }

    public SmartWatch(String fabricante, String modelo, int memoria, int ram, String sistemaOperativo, String color, boolean bluetooth, int size, boolean camara) {
        super(fabricante, modelo, memoria, ram, sistemaOperativo);
        this.color = color;
        this.bluetooth = bluetooth;
        this.size = size;
        this.camara = camara;
    }
}
