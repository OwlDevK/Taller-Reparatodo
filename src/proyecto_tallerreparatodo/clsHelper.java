/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo;
import proyecto_tallerreparatodo.StakeHolder.enumTipologiaStakeH;
import java.awt.TextArea;
import javax.swing.JOptionPane;
import proyecto_tallerreparatodo.StakeHolder.*;

/**
 *
 * @author OwlDevK
 */
public class clsHelper {
                  

         public int recibeInt(String mensaje) {
                  return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
         }
         
            public double recibeDouble(String mensaje) {
                  return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
         }
            
         public boolean devuelveBoolean(String opcion) {
                  boolean valor = false;
                  if (opcion == "1") {
                           valor = true;
                  }
                  return valor;
         } 
            

         public String recibeString(String mensaje) {
                  return JOptionPane.showInputDialog(mensaje);
         }

         public char recibeChar(String mensaje) {
                  return JOptionPane.showInputDialog(mensaje).toUpperCase().charAt(0);
         }

         public Object recibeObject(Object objeto) {
                  return JOptionPane.showInputDialog(objeto);
         }

         public void imprimeMensaje(String mensaje) {
                  JOptionPane.showMessageDialog(null, mensaje);
         }

         public void imprimeMensaje(TextArea mensaje) {
                  JOptionPane.showMessageDialog(null, mensaje);
         }


         public   enumTipologiaStakeH recibeTipo(char tipo) {
                  
                  enumTipologiaStakeH tipoSH = null;
                           switch (tipo) {
                                    case 'F':
                                             return tipoSH = enumTipologiaStakeH.CLIENTE_FISICO;
                                    case 'J':
                                             return tipoSH = enumTipologiaStakeH.CLIENTE_JURIDICO;
                                    case 'C':
                                             return tipoSH = enumTipologiaStakeH.CAJERO;
                                    case 'M':
                                             return tipoSH = enumTipologiaStakeH.MECANICO;
                                    default:   tipo = recibeChar("Opcion inválida, inténtelo de nuevo");
                                             break;
                           }
                  return tipoSH;
         }


         
          public void dimeCompletado(String mensaje) {
           System.out.println(
                             "‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡\n"
                          + "‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡"
                          + "\n‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡"
                          + "\n‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡‡"
                          + "\n‡‡‡‡‡‡"
                          + "\n······················································· " + mensaje );  
         }
         
         
         
}


