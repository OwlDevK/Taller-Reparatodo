/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.CajaFacturacion;
import proyecto_tallerreparatodo.StakeHolder.clsClienteFisico;
import proyecto_tallerreparatodo.clsHelper;
import proyecto_tallerreparatodo.clsEncriptador;

/**
 *
 * @author OwlDevK
 */
public class clsTarjetaCredito {
          clsHelper clsH = new clsHelper();
          clsEncriptador clsE = new clsEncriptador();
          
         
         private String entidadaBancaria;
         private String numeroTarjeta;
         private String nombreTitular;
         private  String contrasena;
         private double saldo;

         public clsTarjetaCredito(String entidadaBancaria, String numeroTarjeta, String nombreTitular, double saldo, String contrasena) {
                  this.entidadaBancaria = entidadaBancaria;
                  this.numeroTarjeta = numeroTarjeta;
                  this.saldo = saldo;
                  this.nombreTitular = nombreTitular;
                  this.contrasena = contrasena;
         }
         
         public clsTarjetaCredito(){
         }
           
         public clsTarjetaCredito registraTarjeta() {
                                    return new clsTarjetaCredito(
                                   clsH.recibeString("Nombre del banco"),
                                   clsH.recibeString("Número de tarjeta"),
                                   clsH.recibeString("Ingrese nombre del titular"),
                                   clsH.recibeDouble("Monto disponible"),
                                   clsE.ciframeContrasenaTarjeta());
         }
        
         
         public boolean hayFondos(double solicitudDinero){
                  return this.saldo > solicitudDinero;
         }
         
         public boolean autorizarTransaccion(clsTarjetaCredito tarjeta) {
                  boolean continuar = false;
                  if(clsE.validarContrasena(contrasena, clsH.recibeString("Ingrese su contraseña"), clsH.recibeInt("Ingrese se token A:"), clsH.recibeInt("Ingrese se token B:"))){
                           continuar = true;
                  }
                  return continuar;
         }
         

         public String getEntidadaBancaria() {
                  return entidadaBancaria;
         }

         public void setEntidadaBancaria(String entidadaBancaria) {
                           this.entidadaBancaria = entidadaBancaria;
                  
         }

         public String getNumeroTarjeta() {
                  return numeroTarjeta;
         }

         public void setNumeroTarjeta(String numeroTarjeta) {
                           this.numeroTarjeta = numeroTarjeta;
         }

         public double getSaldo(boolean permitido) {
                  double dinero = 0;
                  if (permitido) {
                          dinero = saldo;
                  }else{
                           clsH.imprimeMensaje("Acceso denegado");
                  }                  
                  return dinero;
         }

         public void setSaldo(double saldo) {
                  if (saldo > 0) {
                         this.saldo = saldo;
                  }          
         }

         public String getNombreTitular() {
                  return nombreTitular;
         }

         public void setNombreTitular(String nombreTitular) {
                           this.nombreTitular = nombreTitular;

                  
         }

         public String getContrasena() {
                  
                  return contrasena;
         }

         public void setContrasena(String contrasena) {
                  this.contrasena = contrasena;
         }
         
         

 
                  
         
         
}
