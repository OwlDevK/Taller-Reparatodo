/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto_tallerreparatodo.StakeHolder;

import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;

/**
 *
 * @author OwlDevK
 */
public enum enumTipologiaStakeH {
         // DESTINADA PARA TRABAJAR EN EL MENÚ Y REDUCIR EL USO DE CÓDIGO CUANDO SE TRATE DE REPETIR CÓDIGO DEBIDO RESTRICCIONES
         //LINGÜÍSTICA O DE "IDENTIFICADORES " DE LAS CLASES U OBJETOS
         CLIENTE_FISICO("F", "cliente físico", "clientes físicos", "la cédula", "el nombre del cliente"),
         CLIENTE_JURIDICO("J", "cliente", "clientes jurídicos", "la cédula jurídica", "el nombre de la empresa"),
         CAJERO("C", "operario", "operarios", "la cédula"),
         MECANICO("M", "operario", "operarios", "la cédula"),
         ID(),
         NULL();
 
         private String tipoSH;  private String nombreSing;  private String nombrePlu;   private String cedula;  private String nombre;

         private enumTipologiaStakeH(){}



         
         private enumTipologiaStakeH(String tipoSH, String nombreSing, String nombrePlu, String cedula) {
                  this.tipoSH = tipoSH;
                  this.nombreSing = nombreSing;
                  this.nombrePlu = nombrePlu;
                  this.cedula = cedula;
         }
         
        private enumTipologiaStakeH(String tipoSH, String nombreSing, String nombrePlu, String cedula, String nombre) {
                  this.tipoSH = tipoSH;
                  this.nombreSing = nombreSing;
                  this.nombrePlu = nombrePlu;
                  this.cedula = cedula;
                  this.nombre = nombre;
         }
        

         public String getTipoSH() {
                  return tipoSH;
         }

         public void setTipoSH(String tipoSH) {
                  this.tipoSH = tipoSH;
         }

         public String getNombreSing() {
                  return nombreSing;
         }

         public void setNombreSing(String nombreSing) {
                  this.nombreSing = nombreSing;
         }

         public String getNombrePlu() {
                  return nombrePlu;
         }

         public void setNombrePlu(String nombrePlu) {
                  this.nombrePlu = nombrePlu;
         }

         public String getCedula() {
                  return cedula;
         }

         public void setCedula(String cedula) {
                  this.cedula = cedula;
         }

         public static enumTipologiaStakeH getCLIENTE_FISICO() {
                  return CLIENTE_FISICO;
         }

         public static enumTipologiaStakeH getCLIENTE_JURIDICO() {
                  return CLIENTE_JURIDICO;
         }

         public static enumTipologiaStakeH getCAJERO() {
                  return CAJERO;
         }

         public static enumTipologiaStakeH getMECANICO() {
                  return MECANICO;
         }
         
         

         public String getNombreArt() {
                  return nombre;
         }

         public void setNombreArt(String nombre) {
                  this.nombre = nombre;
         }

         public String getNombre() {
                  return nombre;
         }

         public void setNombre(String nombre) {
                  this.nombre = nombre;
         }


         
         
}
