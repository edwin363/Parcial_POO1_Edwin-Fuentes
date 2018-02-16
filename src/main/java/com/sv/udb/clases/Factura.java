/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author rigoberto
 */
public class Factura {
    private String productos;
    private int cantComp;

    public Factura() {
    }

    public Factura(String productos, int cantComp) {
        this.productos = productos;
        this.cantComp = cantComp;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getCantComp() {
        return cantComp;
    }

    public void setCantComp(int cantComp) {
        this.cantComp = cantComp;
    }
    
    @Override
    public String toString() {
        return this.productos;
    }
    
}
