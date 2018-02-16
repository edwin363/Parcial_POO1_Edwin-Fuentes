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
public class ProcesoVenta {
    List<Factura> listFactura;
    List<Tienda> listTienda;

    public ProcesoVenta() {
        this.listFactura = new ArrayList<>();
        this.listTienda = new ArrayList<>();
    }
    
    public boolean addProductos(String producto, int cantidad){
        boolean resp = false;
        
        try {
            this.listFactura.add(new Factura(producto, cantidad));
            resp = true;
            //JOptionPane.showMessageDialog(null, "Ingreso productos a la factura");
            System.err.println(producto);
            System.err.println(cantidad);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return resp;
    }
    
}
