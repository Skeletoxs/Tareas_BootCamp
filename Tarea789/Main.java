package com.CompanyA.Tarea789;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 1
        /*String frase = "Hola mundo";
        String resultado = reverseString(frase);

        System.out.println("La forma reversa es: " + resultado);
*/
        //Ejercicio 2
        /*String[] lista = {"Pedro", "Pepe", "Juan"};
        for (String nombre : lista) {
            System.out.println("El nombre es " + nombre);
        }*/

        //Ejercicio 3
        /*int[][] numeros = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50}};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Su valor es " + numeros[i][j] + " Su columna es  " + j + " y su fila es " + i );
            }
        }*/

        //Ejercicio 4
       /* Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        vector.remove(2);
        vector.remove(3);

       System.out.println(vector);*/

        //Ejercicio 5
        /**
         * Si se utiliza un vector con capacidad por defecto y se tiene mil registros
         * Lo que sucede es que para poder expandirce tendria que duplicar su capacidad
         * y atanto el nuevo vector con la capacidad duplicada mas, el antiguo consumirian muchos recursos del procesador
         */

        //Ejercicio 6
        /*ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Pepe");
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Pancho");

        LinkedList<String> nombresEnlazados = new LinkedList<>(nombres);

        for (String nombre : nombres) {
            System.out.println("ArrayList nombres son : " + nombre);
        }

        for (String nombreL : nombresEnlazados) {
            System.out.println("LinkedList nombres son : " + nombreL);
        }*/

        /*//Ejercicio 7
        ArrayList<Integer> numeros = new ArrayList<>();
        //Añadir numeros
        for (int i = 1; i <= 10 ; i++) {
            numeros.add(i);
        }

        //Remover numeros pares
        for(int j = numeros.size() - 1; j >= 0; j--) {
            if(numeros.get(j) % 2 == 0) {
                numeros.remove(j);
            }
        }

        //Recorrer array
        for (int numero : numeros) {
            System.out.println(numero);
        }*/

        /*//Ejercicio 8
        int opercacion = dividePorCero(8,0);
        System.out.println(opercacion);*/

        //Ejercicio 9
//        copiaFichero("C:\\Users\\User\\Documents\\ficheroACopiar.txt", "transcripcion");

        //Ejercicio 10
        //Pide el texto a colocar y el nombre del fichero
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el texto que quieras hacer");
        String texto = scanner.nextLine();
        System.out.println("Nombre del fichero");
        String nombre = scanner.nextLine();

        //Obtiene los bytes del string para el fichero
        byte[] letras = texto.getBytes();

        //Crea el fichero
        try {

            PrintStream fichero = new PrintStream(nombre);
            fichero.write(letras);
            fichero.close();

        } catch (Exception e) {

            System.out.println("No se puede realizar la accion" + e.getMessage());
        }
        System.out.println("Tu fichero ha sido creado");*/

    }

    //Funcion dividePorCero
    /*public static int dividePorCero(int a, int b) throws ArithmeticException{
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e){
            System.out.println("Esto no debe hacerse");
        }
        System.out.println("Demo de codigo");
        return resultado;
    }*/

    //Funcion que da reverso el string
    /*public static String reverseString(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }*/

    //Funcion para copiar un archivo de texto
    /*public static void copiaFichero(String in, String out) {

        try {

            //Recibe el fichero a copiar
            InputStream fileIn = new FileInputStream(in);
            byte[] entrada = fileIn.readAllBytes();
            fileIn.close();

            //Copia el fichero
            PrintStream fileOut = new PrintStream(out);
            fileOut.write(entrada);
            fileOut.close();

        } catch (Exception e) {
            System.out.println("No se puede realizar la accion" + e.getMessage());
        }
    }*/

}


