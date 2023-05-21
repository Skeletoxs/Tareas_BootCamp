public class Tarea1 {
    
    // tarea numero 1, sumar tres valores con la funcion Suma.
    public static void main (String[]args) {
        int resultado;
        resultado = suma(10, 30, 40);

        System.out.println(resultado);
    }

    // Funcion que suma los valores.
    public static int suma( int a, int b, int c ) {
        return a + b + c; 
    }

}
