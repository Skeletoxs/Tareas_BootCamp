//Esta es la clase Coche.
public class coche {
    public int puertasDeCoche = 0;

        //Funcion para agregar puertas al coche
        public void agregarPuertas() {
            this.puertasDeCoche++;
        }

        //Invocacion de la funcion.
        public static void main (String[]args) {
            coche miCoche = new coche();
            miCoche.agregarPuertas();
    
            System.out.println(miCoche.puertasDeCoche);
        }
}
