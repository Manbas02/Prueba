package org.example;

/**
 * Clase referente al punto 8 de la prueba técnica
 */
public class CuentaAhorro extends CuentaCorriente {

    private Double interes;

    /**
     * Método encargado de calcular el interes
     */
    public void calcularInteres() {
        Double cantInteres = getSaldo() * (interes * 12);
        System.out.println("La cantidad de intereses son: " + cantInteres);
    }

    public CuentaAhorro(String numeroCuenta, Double saldo, Double interes) {
        super(numeroCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(String numeroCuenta, Double saldo) {
        super(numeroCuenta, saldo);
        this.interes = 15.3;
    }
}
