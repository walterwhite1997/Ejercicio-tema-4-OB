public class Main {
    public static void main(String[] args) {

        //ejercicio 1
        int numeroif = 0;

        if (numeroif > 0 ){
            System.out.println("Es positivo");
        } else if(numeroif < 0){
            System.out.println("Es negativo");
        } else {
            System.out.println("Es igual a 0");
        }


        //ejercicio 2

        var numeroWhile = -1;

        while (numeroWhile < 3){
            System.out.println("segundo ejercicio " + numeroWhile);
            numeroWhile++;
        }

        // ejercicio 3

        var numeroDo = 2;
        do {
            System.out.println("tercer ejercicio " + numeroDo);
            numeroDo++;
        }while (numeroDo < 3);


        // ejercicio 4


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("cuarto ejercicio " + numeroFor);
        }

        // ejercicio 5

        var estacion = "verano";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estacion amigo");
        }


    }
}