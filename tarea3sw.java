public class tarea3sw {
    
    public static void main(String[]args) {
        var estacionDelAño = "Primavera";

        switch (estacionDelAño) {
            case "Primavera":
            System.out.println("La estacion es Primavera");
            break;
            case "Verano":
            System.out.println("La estacion es Verano");
            break;
            case "Otoño":
            System.out.println("La estacion es Otoño");
            break;
            case "Invierno":
            System.out.println("La estacion es Invierno");
            break;
            default:
            System.out.println("No es una estacion del año");
        }
    }
}
