import java.util.Scanner;

public class Main {

    public static void main (String []args){
        //Creacion de las variables
        double num1 = 0;
        double num2 = 0;
        String operador = "";
        boolean validador = true;

        //Objeto para la lectura de los datos
        Scanner lectura = new Scanner(System.in);

        //Captura de valores
        System.out.println("Ingrese el primer valor: ");
        num1 = Double.parseDouble(lectura.next());

        System.out.println("Ingrese el operador");
        operador = lectura.next();
            //validacion del operador
          //  while (validador){
           //     operador = lectura.next();
            //    validador = validarOperador(operador);
             //   System.out.println("Solo puede introducir operadores");
            //}
        System.out.println("Ingrese el segundo valor: ");
        num2 = Double.parseDouble(lectura.next());

        //Presentacion de Resultados
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(operador);
        System.out.println("El resultado de la operacion es: "+calcular(num1, num2, operador));

    }

    public static boolean validarOperador(String operador){

        switch (operador){
            case "+":
                return false;
            case "-":
                return false;
            case "*":
                return false;
            case "/":
                return false;
            case "%":
                return false;
            case "**":
                return false;
            default:
                return true;
        }

    }

    //Funcion del calculo de la operacion
    public static double calcular(double num1, double num2, String operador){
        double resultado = 0;

        switch (operador) {
            case "+":
                resultado =  (num1 + num2);
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "%":
                resultado = num1 % num2;
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;

        }
        return resultado;
    }
}
