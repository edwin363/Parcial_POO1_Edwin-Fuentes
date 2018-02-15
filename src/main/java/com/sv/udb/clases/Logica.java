/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rigoberto
 */
public class Logica {
    List<Tienda> listTienda;

    public Logica() {
        this.listTienda = new ArrayList<>();
    }
    
    public boolean ingresarProducto(String nombre, double precio, int stock, int minPerm, String fechaCaduc){
        boolean resp = false;
        try {
            this.listTienda.add(new Tienda(nombre, precio, stock, minPerm, fechaCaduc));
            resp = true;
            JOptionPane.showMessageDialog(null, "Usted a ingresado un nuevo producto");
            System.err.println(nombre);
            System.err.println(precio);
            System.err.println(stock);
            System.err.println(minPerm);
            System.err.println(fechaCaduc);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return resp = false;
    }
    
    public List<Tienda> getTopTres(){
        List<Tienda> top = new ArrayList();
        
        try {
            for(Tienda temp : this.listTienda){
                if(temp.getPrecio() >  0){
                    top.add(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return top;
    }
    
}
