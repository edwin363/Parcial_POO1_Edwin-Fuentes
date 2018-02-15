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
public class Tienda {
    private String nombre;
    private double precio;
    private int stock;
    private int minPerm;
    private String fechaCaduc;

    public Tienda(String nombre, double precio, int stock, int minPerm, String fechaCaduc) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.minPerm = minPerm;
        this.fechaCaduc = fechaCaduc;
    }
    
    public Tienda() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMinPerm() {
        return minPerm;
    }

    public void setMinPerm(int minPerm) {
        this.minPerm = minPerm;
    }

    public String getFechaCaduc() {
        return fechaCaduc;
    }

    public void setFechaCaduc(String fechaCaduc) {
        this.fechaCaduc = fechaCaduc;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    
    
}
