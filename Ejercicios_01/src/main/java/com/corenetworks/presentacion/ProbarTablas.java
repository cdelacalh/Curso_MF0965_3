package com.corenetworks.presentacion;

import com.corenetworks.modelo.ejemplo3.Tablas;
import org.w3c.dom.ls.LSOutput;

public class ProbarTablas {
    public static void main(String[] args) {
        Tablas objetoTabla5 = new Tablas(5);
        System.out.println(objetoTabla5.muestraTabla());
    }
}
