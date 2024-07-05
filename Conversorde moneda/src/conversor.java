import java.util.Scanner;

public class conversor {


    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaDivisa consulta = new ConsultaDivisa();

        int opcion = 0;
        while (opcion !=7){

        String menu = """
                ***************************************************
                      Bienvenido, que conversion desea realizar?
                        1.- Peso mexicano a dolar
                        2.- Dolar a peso mexicano
                        3.- Peso argentino a dolar
                        4.- Dolar a péso argentino
                        5.- Peso Colombiano a Dolar
                        6.- Dolar a peso colombiano
                        7.- Convertir otra moneda
                        8.- Salir
                        
                        **seleccione una opcion valida**
                ***************************************************                              
                       """;
            System.out.println(menu);

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("USD", "MXN", consulta, lectura);

                    break;
                case 2:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD", "ARG", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARG", "USD", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion no valida, Digite otra opcion");
                    break;
            }
            try {
                    //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(5*800);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
