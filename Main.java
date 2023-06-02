public class Main {
    public static void main(String[] args) {
        Cliente cliente =       new Cliente();
        Trabajador trabajador = new Trabajador();

        //Setter cliente;
        cliente.setEdad(19);
        cliente.setNombre("Laura");
        cliente.setTelefono(426.5556244);
        cliente.setCredito(true);

        //Getter cliente;
        System.out.print("Su nombre es: " + cliente.getNombre());
        System.out.print(" Su edad es: " + cliente.getEdad());
        System.out.print(" Su telefono es: " + cliente.getTelefono());
        System.out.print(" Su estado de credito es: " + cliente.getCredito());

        //Setter trabajador
        trabajador.setEdad(25);
        trabajador.setNombre("Abraham");
        trabajador.setTelefono(426.5557789);
        trabajador.setSalario(300);

        //Getter trabajador
        System.out.print("Su nombre es: " + trabajador.getNombre());
        System.out.print(" Su edad es: " + trabajador.getEdad());
        System.out.print(" Su telefono es: " + trabajador.getTelefono());
        System.out.print(" Su salario es: " + trabajador.getSalario());


    }
}

class Persona {
    //Propiedades;
    private int    edad;
    private String nombre;
    private double telefono;

    //Setters
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    //Getters
    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getTelefono() {
        return this.telefono;
    }
}

class Cliente extends Persona {
    //Propiedades
    private boolean credito;

    //Setters
    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    //Getters
    public boolean getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    //Propiedades
    private int salario;

    //Setters
    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Getters
    public int getSalario() {
        return this.salario;
    }
}
