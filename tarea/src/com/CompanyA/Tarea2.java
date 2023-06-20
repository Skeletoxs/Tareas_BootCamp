package com.CompanyA;

public class Tarea2 {

    public static void main(String[] args) {

        System.out.println(precioIva(58));
    }

    static double precioIva(double precio) {
        double iva = precio * 0.16;
        return precio + iva;
    }
}
