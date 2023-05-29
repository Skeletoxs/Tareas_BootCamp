public class persona {
    //Propiedades
    private String  Name;
    private int     Edad;
    private double  Celular;

    //Setters
    public void setName(String name) {
        this.Name = name;
    }

    public void setEdad(int edad) {
        this.Edad = edad;
    }

    public void setCelular(double celular) {
        this.Celular = celular;
    }

    //Getters
    public String getName() {
        return this.Name;
    }

    public int getEdad() {
        return this.Edad;
    }

    public double getCelular() {
        return this.Celular;
    }

    public static void main(String[]args) {
        persona Persona = new persona();

        Persona.setName("Laura");
        Persona.setEdad(19);
        Persona.setCelular(0424.1133448);

        System.out.println(Persona.getName());
        System.out.println(Persona.getEdad());
        System.out.println(Persona.getCelular());
    }
}
