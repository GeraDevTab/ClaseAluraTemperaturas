import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String args []){
        System.out.println("hola mundo");

        int celsius = 0;
        int farenheit = 0;
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura en celsius (solo numeros)");
        celsius = Integer.parseInt(dato.nextLine());

        //operacion de conversion
        farenheit = (int) ((celsius * 1.8)+32);
        String mensaje = """
                La temperatura en celsius ingresada es: %d, equivale a %d grados farenheit.
                """.formatted(celsius,farenheit);
        System.out.println(mensaje);

    }
}
