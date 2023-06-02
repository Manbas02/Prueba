package org.example;

/**
 * Clase referente al punto 8 de la prueba técnica
 */
public class CuentaCorriente {

    /**
     * Nombre de la persona de la cuenta
     */
    private String nombre;

    /**
     * Apellidos de la persona de la cuenta
     */
    private String apellidos;

    /**
     * Edad de la persona de la cuenta
     */
    private String edad;

    /**
     * Número de identificación de la cuenta
     */
    private String numeroCuenta;

    /**
     * Saldo de la cuenta
     */
    private Double saldo;

    /**
     * Método encargado de realizar un ingreso
     * a la cuenta corriente
     *
     * @param cantidad a ingresar
     */
    public void ingresasr(Double cantidad) {
        saldo += cantidad;
    }

    /**
     * Método encargado de realizar un egreso
     * del saldo actual de la cuenta
     *
     * @param cantidad a retirar
     */
    public void reintegro(Double cantidad) {
        saldo -= cantidad;
    }

    /**
     * Método encargado de imprimir
     * el saldo de la cuenta
     *
     * @return devuelve una cadena
     * con el número de la cuenta
     * y el saldo
     */
    public void concantenarNumCuentaSaldo() {
        System.out.println("Numero de cuenta: " + numeroCuenta + "\nEl saldo es: " + saldo);
    }

    public CuentaCorriente(String nombre, String apellidos, String edad, String numeroCuenta, Double saldo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(String numeroCuenta, Double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
