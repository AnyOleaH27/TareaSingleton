/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productossingleton;
import java.util.LinkedList;
/**
 *
 * @author Amaranny
 */
public class ListaProductos {
    private LinkedList<Productos> productos;
    private static ListaProductos instancia;

    private ListaProductos() {
        productos=new LinkedList();
    }
    public static ListaProductos getInstancia(){
        if(instancia==null){
            instancia =new ListaProductos();                    
        }
        return instancia;
    }
    
    public void agregar(Productos a){
        productos.add(a);
    }
    
    public void eliminar(int indice){
        productos.remove(indice);
    }           
    
    public int total(){
        return productos.size();
    }
    
    public Productos obtener(int indice){
        return productos.get(indice);
    }
    
    public void cargarProductos(){
        productos.add(new Productos("100","gansito","pastelito",15,100));
        productos.add(new Productos("200","pinguino","pastelito",20,200));
        productos.add(new Productos("300","sabritas","pastelito",17,300));
        productos.add(new Productos("400","frijol","pastelito",33,150));
        productos.add(new Productos("500","azucar","pastelito",20,250));
    }

}
