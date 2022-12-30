/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.StakeHolder;

import javax.swing.JOptionPane;
import proyecto_tallerreparatodo.clsHelper;



/**
 *
 * @author OwlDevK
 */
public class clsUsuarioID {
         clsHelper clsH = new clsHelper();
   
         
         String cabeza;
         String cuerpo;
         int posicion;

         public clsUsuarioID(String cabeza, String cuerpo, int posicion){
                  this.cabeza = cabeza.toUpperCase();
                  this.cuerpo = cuerpo.substring(cuerpo.length()-6, cuerpo.length());
                  this.posicion = posicion;   
         }

         @Override
         public String toString() {
                  return   cabeza.concat(cuerpo).concat(String.valueOf(posicion));
         }

         public int dameIndice(int posicion) {
                  return this.posicion;
         }
           
         public int convierteID(String carnet) {
                  int pos = -1;
                  do {
                           pos = Integer.parseInt(carnet.substring(carnet.indexOf("_")+1, carnet.length()));
                           clsH.imprimeMensaje("Cliente ubicado en posición " + pos);
                           if(carnet.length() < 9){
                                    carnet = clsH.recibeString("Carnet inválido, inténtelo de nuevo: debe ser mínimo 9 dígitos");
                           }
                  } while (pos == -1 || carnet.length() < 9);
                  return pos;
         }

         public clsUsuarioID dameID(String cabeza, String cuerpo, int cola){
                  clsUsuarioID ID = new clsUsuarioID(cabeza, cuerpo.concat("_"), cola);
                  if(cola > 0 ){clsH.imprimeMensaje("Su ID es: "+ ID + " ¡Debe guardarlo! ");}
                 return ID;
         }
       


         
         

         public clsUsuarioID() {
         }

         public String getCabeza() {
                  return cabeza;
         }

         public void setCabeza(String cabeza) {
                  this.cabeza = cabeza;
         }

         public String getCuerpo() {
                  return cuerpo;
         }

         public void setCuerpo(String cuerpo) {
                  this.cuerpo = cuerpo;
         }

         public int getPosicion() {
                  return posicion;
         }

         public void setPosicion(int posicion) {
                  this.posicion = posicion;
         }
       
}
