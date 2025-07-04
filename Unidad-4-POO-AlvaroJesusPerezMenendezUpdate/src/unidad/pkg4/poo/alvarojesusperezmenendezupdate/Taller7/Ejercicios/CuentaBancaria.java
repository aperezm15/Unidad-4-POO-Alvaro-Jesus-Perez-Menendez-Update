/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad.pkg4.poo.alvarojesusperezmenendezupdate.Taller7.Ejercicios;

/**
 *
 * @author Mitzuke
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(int numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public void mostrarDetalles () {
        System.out.println("El numero de cuenta es: "+numeroCuenta);
        System.out.println("El saldo de la cuenta es: "+saldo);
        System.out.println("El tipo de cuenta es: "+tipoCuenta);
    }
    
    
}
