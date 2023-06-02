package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("\tBienvenido a la prueba Técnica\n" +
                "Seleccione la opción de su interés según la prueba\n" +
                "1 .Crear un programa que java que lea una cadena y muestre:\n" +
                "\ta. La cadena de caracteres en minúsculas\n" +
                "\tb. La cadena de caracteres en mayúsculas\n" +
                "\tc. Los 2 primeros caracteres de la cadena\n" +
                "\td. Los 2 últimos caracteres de la cadena\n" +
                "\te. El número de ocurrencias en la cadena del último carácter\n" +
                "\tf. La cadena con 3 asteriscos por delante y 3 asteriscos por detrás\n" +
                "\tg. La cadena invertida.\n" +
                "2. Desarrollo Cuenta corriente\n" +
                "3. Desarrollo Cuenta ahorros\n" +
                "4. Salir.");

        Integer op;
        do {
            System.out.println("Ingrese una opción: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    cadenaDeTesxto();
                    break;
                case 2:
                    CuentaCorriente corriente = new CuentaCorriente("Juan Manuel", "Bautista Silva", "20", "1234567890", 4200000.0);
                    corriente.ingresasr(500000.0);
                    corriente.reintegro(700000.0);
                    corriente.concantenarNumCuentaSaldo();
                    break;
                case 3:
                    CuentaAhorro ahorro = new CuentaAhorro("1234567890", 4200000.0);
                    ahorro.calcularInteres();
                    ahorro.concantenarNumCuentaSaldo();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Seleccione una opción correcta!");
                    break;
            }
        } while (op != 4);
    }

    /**
     * Método referente al punto 7 de la prueba Técnica
     */
    static void cadenaDeTesxto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Has seleccionado la opción 1!\n" +
                "por favor ingrese una cadena: ");
        String cadena = leer.nextLine();
        System.out.println("La cadena en minusculas es: " + cadena.toLowerCase()
                + "\nLa cadena en mayusculas es: " + cadena.toUpperCase()
                + "\nLos 2 primeros caracteres de la cadena son: " + cadena.substring(0, 2)
                + "\nLos 2 ultimos caracteres de la cadena son: " + cadena.substring(cadena.length() - 2)
                + "\nEl numero de ocurrencias del ultimo caracter  " + ocurrencias(cadena)
                + "\nLa cadena invertida es: " + new StringBuilder(cadena).reverse());
    }

    /**
     * Método encargado de contar las ocurrencias del último carácter
     * de una cadena
     *
     * @param cadena
     * @return devuelve la cantidad
     * de ocurrencias del caracter
     */
    private static Integer ocurrencias(String cadena) {
        Integer numOcurrencias = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == cadena.charAt(cadena.length() - 1)) {
                numOcurrencias++;
            }
        }
        return numOcurrencias;
    }
}