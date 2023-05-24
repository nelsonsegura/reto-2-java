/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Reto2 {

    
    public static void main(String[] args) {
        BasedeDatosProductos listaProductos = new BasedeDatosProductos();
        Scanner sc = new Scanner(System.in);
        String operacion = sc.nextLine();
        String [] entrada = sc.nextLine().split(" ");
        Producto producto = new Producto(Integer.parseInt(entrada[0]), entrada[1], Double.parseDouble(entrada[2]),
        Integer.parseInt(entrada[3]));
        boolean salida = false;
        if(operacion.equals("AGREGAR")){
           salida = listaProductos.agregar(producto.getCodigo(), producto);
        }
        else if(operacion.equals("ACTUALIZAR")){
           salida = listaProductos.actualizar(producto.getCodigo(), producto);
        }else if(operacion.equals("BORRAR")){
           salida = listaProductos.eliminar(producto.getCodigo(), producto);
        }
        if (salida){  
            System.out.println(String.format("%.1f", listaProductos.valor_inventario()));
        }
        else{
             System.out.println("ERROR");
         }
    }
    
}
