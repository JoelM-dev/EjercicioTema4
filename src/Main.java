public class Main {
    public static void main(String[] args) {
        int numeroIf = -3;

        if(numeroIf > 0){
            System.out.println("El numero " + numeroIf + " es positivo");
        }
        else if(numeroIf == 0){
            System.out.println("El numero es " + numeroIf);
        }
        else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "Coca";
        switch (estacion){
            case "Verano":
                System.out.println("Es estacion es " + estacion);
                break;
            case "Otoño":
                System.out.println("Es estacion es " + estacion);
                break;
            case "Invierno":
                System.out.println("Es estacion es " + estacion);
                break;
            case "Primavera":
                System.out.println("Es estacion es " + estacion);
                break;
            default:
                System.out.println("Valor incorrecto");
        }
    }
}