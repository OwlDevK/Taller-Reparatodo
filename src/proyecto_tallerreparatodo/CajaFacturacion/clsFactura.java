/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.CajaFacturacion;

import proyecto_tallerreparatodo.StakeHolder.clsClienteFisico;
import proyecto_tallerreparatodo.Vehiculo.enumPreciosReparaciones;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public class clsFactura {
         clsHelper clsH = new clsHelper();
         private String nombreTitular;
         private double montoPagar;
         private double[] precios;
         private enumPreciosReparaciones[] descripciónReparaciones;
         private double iva;
         int cliente;
         //private String IdMecanico;        

         public clsFactura(String nombre, enumPreciosReparaciones[] descripciones, double[] precios, double total, double iva) {
                  this.nombreTitular = nombre;
                  this.montoPagar = total;
                  this.descripciónReparaciones = descripciones;
                  this.precios = precios;
                  this.iva = iva;
         }   
         public clsFactura(){}
        
         
         public void imprimirFactura() {
                  System.out.println(
                          "‡‡‡‡‡‡‡‡‡‡‡‡·······TALLER REPARA_TODO·······‡‡‡‡‡‡‡‡‡‡‡‡"
                          + "\n‡‡‡‡\n_________Detalles de factura:" + "_________Cliente: " + nombreTitular);
                  int indice = 0;
                  for (enumPreciosReparaciones detalles : descripciónReparaciones) {
                           System.out.println(detalles.getDescripcion() + " Costo = " + precios[indice]);
                           indice++;
                  }
                  System.out.println("\n_________IVA =" + iva);
                  System.out.println("_________Total a pagar = " + montoPagar);
         }

         
         
         public String getNombreTitular() {
                  return nombreTitular;
         }
         public void setNombreTitular(String nombreTitular) {
                  
                  this.nombreTitular = nombreTitular;
         }

         
         public double getMontoPagar() {
                  return montoPagar;
         }
         public void setMontoPagar(double montoPagar) {
                  this.montoPagar = montoPagar;
         }

         
         public enumPreciosReparaciones[] getDescripciónReparaciones(double precios) {
                  return descripciónReparaciones;
         }
         public void setDescripciónReparaciones(enumPreciosReparaciones[] descripciónReparaciones) {
                  this.descripciónReparaciones = descripciónReparaciones;
         }

         public double[] getPrecios() {
                  return precios;
         }

         public void setPrecios(double[] precios) {
                  this.precios = precios;
         }

         public double getIva() {
                  return iva;
         }

         public void setIva(double iva) {
                  this.iva = iva;
         }
         
         
         
         
         
}
