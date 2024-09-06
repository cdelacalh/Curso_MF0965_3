package com.corenetworks.modelo.ejemplo3;

public class Tablas {
    private int numero;
    public Tablas(int numero){
        this.numero = numero;
        System.out.println("Tabla del " + numero);}
    public String muestraTabla() {
        String cadena = "";
        for (int i = 1; i <= 10; i++)
        {cadena = cadena + numero + "x" + i + "=" + i*numero + "\n";}
        return cadena;
    }
}
