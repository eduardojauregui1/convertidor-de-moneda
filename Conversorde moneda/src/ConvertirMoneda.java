import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir (String monedaBase, String monedaTarget, ConsultaDivisa consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Divisas divisas = consulta.buscaDivisa(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy \n 1"+monedaBase+ " = "+divisas.conversion_rate()+ " "+ monedaTarget);
        System.out.println("Ingresa la cantidad de " +monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad*divisas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" " +cantidadConvertida +" "+ divisas.target_code());


    }
    


}

