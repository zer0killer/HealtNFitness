/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Michael_Pc
 */
@Named(value = "carritoData")
@RequestScoped
public class CarritoData {

    /**
     * Creates a new instance of CarritoData
     */
    
    private static final DatosCarr [] carrito=new DatosCarr[]{
        new DatosCarr(40, 40, "proteina"),
        new DatosCarr(70, 140, "amino")
    };
    public CarritoData() {
    }
    
    public DatosCarr[] getCarrito(){
    return carrito;
}
    
}
