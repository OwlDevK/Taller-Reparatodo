
package proyecto_tallerreparatodo.StakeHolder;

import proyecto_tallerreparatodo.CajaFacturacion.clsTarjetaCredito;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;
import proyecto_tallerreparatodo.Vehiculo.emEstiloVehiculo;
import proyecto_tallerreparatodo.clsEncriptador;
import proyecto_tallerreparatodo.clsHelper;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author OwlDevK
 */
 public class clsTaller {
          clsHelper clsH = new clsHelper();
          clsEncriptador clsE = new clsEncriptador();
           clsTarjetaCredito clsT = new clsTarjetaCredito();
           clsVehiculo clsV = new clsVehiculo();
           emEstiloVehiculo est = emEstiloVehiculo.NULL;

         public clsTaller() {  }
                  
                 ////////         ////////         ////////         ////////         ////////         ////////         ////////
         ////////  INSTANCIA PRIMER CLIENTE FÍSICO  
          public clsClienteFisico PROTEO() {
                   String nombre = "Antoine";
                   String apellido = "Exupéry";
                   String ced = "000612";
                   String correo = "petitePrince@gmail.com";
                   String tel = "85512321";
                   boolean estado = true;
                   clsT = tarjetaPROTEO();
                   clsV = vehiculoPROTEO();
                   return new clsClienteFisico(nombre, apellido, ced, correo, tel, estado, clsT, clsV);
          }  
          public clsTarjetaCredito tarjetaPROTEO() {
                           String tarjeta= "Les bancs de la Liberté";
                           String numTarj = "612";
                           String titular = "ANTOINE SAINT-EXUPÉRY";
                           double monto = 700000;
                           return new clsTarjetaCredito(tarjeta, numTarj, titular, monto,cifrarContrasenaPROTEO() );
          }        
          public clsVehiculo vehiculoPROTEO() {                 
                   return new clsVehiculo(
                           "P-38 Lightning",
                           "B612",
                           emEstiloVehiculo.CABRIOLET,
                           true);
          }
          public String cifrarContrasenaPROTEO() {
                   clsEncriptador criptarProteo = new clsEncriptador(6, 12);
                   String cifradoP = criptarProteo.configurarLLaveDeAcceso("DeusMecum");
                   return cifradoP;
          }

                ////////         ////////         ////////         ////////         ////////         ////////         ////////
         ////////  INSTANCIA PRIMER CLIENTE JURÍDICO
                   public clsClienteJuridico PENNY_DREADFUL() {
                   String nombre = "Murray";
                   String ced = "002014";
                   String correo = "murray@gmail.com";
                   String tel = "85512321";
                   boolean estado = true;
                   clsT = tarjetaDREAFUL();
                   clsV = vehiculoPROTEO();
                    return new clsClienteJuridico(nombre, ced, correo, tel, estado, clsT, clsV);
          }        
          public clsTarjetaCredito tarjetaDREAFUL() {
                           String banco= "Victoria";
                           String numTarj = "70V70";
                           String titular = "Murray";
                           double monto = 700000;
                           return new clsTarjetaCredito(banco, numTarj, titular, monto,cifrarContrasenaDreaful() );
          }        
          public clsVehiculo vehiculoDREAFUL() {                 
                   return new clsVehiculo(
                           "Calesines",
                           "221B",
                           emEstiloVehiculo.CABRIOLET,
                           true);
          }
          public String cifrarContrasenaDreaful() {
                   clsEncriptador criptarMurray = new clsEncriptador(6, 12);
                   String cifradoP = criptarMurray.configurarLLaveDeAcceso("DeusTecum");
                   return cifradoP;
          }
          
    
          
          
          public clsMecanico mecanicoMelanie() {
                   return new clsMecanico(
                           "Melanie",
                           "Elizondo");
          }
          
          
          public clsMecanico mecanicoFlorDeLiz() {
                   return new clsMecanico(
                           "Flor de Liz",
                           "Martinez");
          }
          
          
           public clsMecanico mecanicoEdwin() {
                   return new clsMecanico(
                           "Edwin",
                           "País");
          }                     
           
         
          
               
       
}

/*


*/






