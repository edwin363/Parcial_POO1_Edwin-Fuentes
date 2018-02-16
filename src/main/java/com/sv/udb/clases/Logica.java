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
        
        double menor = this.listTienda.get(0).getPrecio();
        
        try {
            for(Tienda temp : this.listTienda){
                    
                    if(temp.getPrecio() > menor){
                    top.add(temp);                   
                }             
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return top;
    }
    
    public List<Tienda> getMInExistencias(){
        List<Tienda> minExistencias = new ArrayList<>();
        
        int existencias = this.listTienda.get(0).getMinPerm();
        try {
            for(Tienda temp: this.listTienda){
                if(temp.getMinPerm() > existencias ){
                    minExistencias.add(temp);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return minExistencias;
    }
    
    public List<String> getProductos(){
        List<String> listProductos = new ArrayList<>();
        
        try {
            for(Tienda temp: this.listTienda){
                if(temp.getNombre() != null)
                listProductos.add(temp.getNombre());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listProductos;
    } 
    
    public List<Double> getPrecios(){
        List<Double> listPrecio = new ArrayList<>();
        double contador = 0;
        try {
            for(Tienda temp2: this.listTienda){
                
                    listPrecio.add(temp2.getPrecio());
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listPrecio;
    }
    
    public List<Integer>getExistencias(){
        List<Integer> listExistencias = new ArrayList<>();
        int contador = 0;
        try {
            for(Tienda temp : this.listTienda){
                listExistencias.add(temp.getStock());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return listExistencias;
    }
    
}
