package com.CompanyA.TareaClases;

public class SmartDevice {
    // Atributos
    protected String fabricante;
    protected String modelo;
    protected int memoria;
    protected int ram;
    protected String sistemaOperativo;

    //Constructores
    public SmartDevice() {

    }

    public SmartDevice(String fabricante, String modelo, int memoria, int ram, String sistemaOperativo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.memoria = memoria;
        this.ram = ram;
        this.sistemaOperativo = sistemaOperativo;
    }

    // Metodos

}
