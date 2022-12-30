/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.CajaFacturacion;

import java.util.Arrays;
import proyecto_tallerreparatodo.StakeHolder.clsClienteFisico;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;
import proyecto_tallerreparatodo.Vehiculo.enumPreciosReparaciones;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public class clsCaja {
         clsHelper clsH = new clsHelper();
         
         static double IVA = 1.13;
         private double totalPagar;
         private double[] precios;
         private final enumPreciosReparaciones cajero = enumPreciosReparaciones.getOP();
        
         
         
         public clsCaja(){}    
         public clsFactura generarCobro( clsTarjetaCredito tarjeta, clsVehiculo vehiculo) { // Es razonable que se reciba por parámetro la tarjeta y el vehículo: en caja se cobra servicios sobre los vehículos
                  clsFactura factura = null;  String nombreTitular = null;
                   precios = cajero.damePrecio(vehiculo);  // Se envía por parámetro todo el objeto vehículo, pues en la clase "enumPreciosReparaciones" se requerirá el peso del vehículo(getPeso) y las averías que señaló el mecánico(getAverías) Esto es, porque el precio de la averías depende del peso del vehículo (el peso se registra desde que el cliente ingresó en base de datos)
                   for (int i = 0; i < precios.length; i++) {  totalPagar += precios[i];  } // Nótese que se recibe un vector con los precios y luego se suma el total, esto es porque se requerirá esa lista de precios o " vector de precios" para que se indiquen en la factura  
                   if (datosValidos  (tarjeta, totalPagar) ) {  
                            totalPagar= totalPagar / IVA;                                                                  
                            if ( tarjeta.hayFondos(totalPagar) || tarjeta.autorizarTransaccion(tarjeta)) {                           
                                    nombreTitular = tarjeta.getNombreTitular();        
                           }
                  }  return factura = new clsFactura(nombreTitular,vehiculo.getAverias(), precios, totalPagar, IVA);
         }  
         
         private boolean datosValidos(clsTarjetaCredito tarjeta, double precioReparacion) {
                  return   precioReparacion > 0 && tarjeta != null;
         }


         
         
         public static double getIVA() {
                  return IVA;
         }

         public static void setIVA(double IVA) {
                  clsCaja.IVA = IVA;
         }

         public double[] getPrecios() {
                  return precios;
         }

         public void setPrecios(double[] precios) {
                  this.precios = precios;
         }

         public double getTotalPagar() {
                  return totalPagar;
         }

         public void setTotalPagar(double totalPagar) {
                  this.totalPagar = totalPagar;
         }


         
}
