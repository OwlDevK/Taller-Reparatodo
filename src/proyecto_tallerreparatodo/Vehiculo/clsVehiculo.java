/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.Vehiculo;
import proyecto_tallerreparatodo.CajaFacturacion.clsTarjetaCredito;
import proyecto_tallerreparatodo.StakeHolder.enumTipologiaStakeH;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public class clsVehiculo {
         clsHelper clsH = new clsHelper();
        emEstiloVehiculo est = emEstiloVehiculo.NULL;
                
         private String marca;
         private String placa;
         private  emEstiloVehiculo estilo;
         private boolean estado;
         private char peso;
         private enumPreciosReparaciones[] averias;
         
         public clsVehiculo(){}

         public clsVehiculo(String marca, String placa, emEstiloVehiculo estilo, boolean estado) {
                  this.marca = marca;
                  this.placa = placa;
                  this.estilo = estilo;
                  this.estado = estado;
         }

         public clsVehiculo(enumPreciosReparaciones[] averias) {
                  this.averias = averias;
         }
         

         public clsVehiculo[] generarColeccionVehiculos(clsVehiculo[] nuevosV) {
                 int tamano = clsH.recibeInt("Digite la cantidad vehiculos que desea agregar: ");      
                  nuevosV = new clsVehiculo[tamano];                     
                           for (int i = 0;  i < nuevosV.length ; i++) {
                                    nuevosV[i] = agregarVehiculo();
                  }
                  return nuevosV;
         }


         @Override
         public String toString() {
                  return "Datos de Vehiculo :" + "\nMarca:" + marca + "\nPlaca: " + placa + "\nEstilo: " + estilo;
         }   
         
         public void imprimeDetallesReps(){
                  clsH.imprimeMensaje("Detalles de la Reparación");
                  for (enumPreciosReparaciones averia : averias) {
                           clsH.imprimeMensaje(averia.getDescripcion().toString());
                  }
         }
         
         public clsVehiculo agregarVehiculo() {
                  return new clsVehiculo(clsH.recibeString("Marca del vehículo"),
                          clsH.recibeString("Número de placa"),
                          est.dameEstiloVehiculo(),
                          clsH.devuelveBoolean("Digite: \n1. Para reportar averías \nO cualquier tecla para omitir"));                     
}
                 
                
         public clsVehiculo[] dameVehiculo(){
                   int tamano = clsH.recibeInt("Digite la cantidad vehiculos que desea agregar: ");   
                  clsVehiculo[] vehiculoSalientes = new clsVehiculo[tamano];
                  for (int i = 0; i < vehiculoSalientes.length; i++) {
                           vehiculoSalientes[i] = agregarVehiculo();                         
                  } return vehiculoSalientes;
         }
         
             public int devolver(clsVehiculo[] vehiculos){
                     int   indx = 0;
                      for (clsVehiculo vehiculo : vehiculos) {
                               if(vehiculo.isEstado()){                               
                               }
                               indx++;
                      }return indx ;                                      
                  } 

         public clsHelper getClsH() {
                  return clsH;
         }

         public void setClsH(clsHelper clsH) {
                  this.clsH = clsH;
         }

         public String getMarca() {
                  return marca;
         }

         public void setMarca(String marca) {
                  this.marca = marca;
         }

         public String getPlaca() {
                  return placa;
         }

         public void setPlaca(String placa) {
                  this.placa = placa;
         }

         public emEstiloVehiculo getEstilo() {
                  return estilo;
         }

         public void setEstilo(emEstiloVehiculo estilo) {
                  this.estilo = estilo;
         }

         public boolean isEstado() {
                  return estado;
         }

         public void setEstado(boolean estado) {
                  this.estado = estado;
         }

         public char getPeso() {
                  return peso;
         }

         public void setPeso(char peso) {
                  this.peso = peso;
         }

         public enumPreciosReparaciones[] getAverias(int cant) {
                  return averias = new  enumPreciosReparaciones[cant];
         }
         
         public enumPreciosReparaciones[] getAverias() {
                  return averias;
         }


         public void setAverias(enumPreciosReparaciones[] averias) {
                  this.averias = averias;
         }
                   
         
                     
            public clsVehiculo vehiculoProteo() {
                         return new clsVehiculo("BMW",
                          "898989898",
                          emEstiloVehiculo.CABRIOLET,
                          true);                     
         }
         
         
         
         

}
