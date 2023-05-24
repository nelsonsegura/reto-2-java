/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

import java.util.HashMap;

/**
 *
 * @author Usuario
 */
public class BasedeDatosProductos {
    private HashMap<Integer, Producto> listaProductos = new HashMap <Integer, Producto>();
    
    BasedeDatosProductos(){
        this.listaProductos.put(1, new Producto(1, "Manzanas", 5000.0, 25));
        this.listaProductos.put(2, new Producto(2, "Limones", 2300.0, 15));
        this.listaProductos.put(3, new Producto(3, "Peras", 2700.0, 33));
        this.listaProductos.put(4, new Producto(4, "Arandanos", 9300.0, 5));
        this.listaProductos.put(5, new Producto(5, "Tomates", 2100.0, 42));
        this.listaProductos.put(6, new Producto(6, "Fresas", 4100.0, 3));
        this.listaProductos.put(7, new Producto(7, "Helado", 4500.0, 41));
        this.listaProductos.put(8, new Producto(8, "Galletas", 500.0, 8));
        this.listaProductos.put(9, new Producto(9, "Chocolates", 3500.0, 80));
        this.listaProductos.put(10, new Producto(10, "Jamon", 15000.0, 10));
    }
    
    public boolean agregar(int codigo, Producto producto){
        if (this.listaProductos.get(codigo) == null){
            this.listaProductos.put(codigo, producto);
            return true;
        }
        return false;
    }
    public boolean actualizar(int codigo, Producto producto){
        if (this.listaProductos.get(codigo) != null){
            this.listaProductos.put(codigo, producto);
            return true;
        }
        return false;
    }
     public boolean eliminar(int codigo, Producto producto){
        if (this.listaProductos.get(codigo) != null){
            this.listaProductos.remove(codigo);
            return true;
        }
        return false;
    }
     public double valor_inventario(){
         double contador = 0;
         for (Integer i: listaProductos.keySet()){
             contador+=(listaProductos.get(i).getPrecio()*listaProductos.get(i).getInventario());
         }  
         return contador;
     }
}
