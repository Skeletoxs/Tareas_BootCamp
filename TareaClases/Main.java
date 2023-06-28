package com.CompanyA.TareaClases;

public class Main {

    public static void main(String[] args) {

        // Creo los objetos de la clase SmatPhone y SmartWatch
        SmartPhone spark  = new SmartPhone("Xiaomi","note 6",120,4,"Android",5.62,165,"negro","movilnet",true,13);
        SmartWatch watch5 = new SmartWatch("Samsung","Galaxy watch5", 2, 2, "Android","Azul",true,44, false);

        //Mostrar los datos por pantalla
        //Spark
        System.out.println(spark.fabricante);
        System.out.println(spark.modelo);
        System.out.println(spark.memoria);
        System.out.println(spark.ram);
        System.out.println(spark.sistemaOperativo);
        System.out.println(spark.pantalla);
        System.out.println(spark.size);
        System.out.println(spark.color);
        System.out.println(spark.linea);
        System.out.println(spark.acsesorios);
        System.out.println(spark.camara);

        //Watch5
        System.out.println(watch5.fabricante);
        System.out.println(watch5.modelo);
        System.out.println(watch5.memoria);
        System.out.println(watch5.ram);
        System.out.println(watch5.sistemaOperativo);
        System.out.println(watch5.color);
        System.out.println(watch5.bluetooth);
        System.out.println(watch5.size);
        System.out.println(watch5.camara);
    }
}
