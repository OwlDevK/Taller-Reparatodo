/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo;

/**
 *
 * @author OwlDevK
 */
public class clsEncriptador {
         clsHelper clsH = new clsHelper();
         private String alfaMayuscula;
         private String alfaMinuscula;


         private String alfaMayusCerraduraImpar;
         private String alfaMinusCerraduraImpar;
         private String alfaMayusCerraduraPar;
         private String alfaMinusCerraduraPar;


         public clsEncriptador(int cifradoIndiceImpar , int cifradoIndicePar) {

                  this.alfaMayuscula = "ABCDEFABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                  this.alfaMinuscula = alfaMayuscula.toLowerCase();

                  this.alfaMayusCerraduraImpar = alfaMayuscula.substring(cifradoIndiceImpar) + alfaMayuscula.substring(0, cifradoIndiceImpar);
                  this.alfaMinusCerraduraImpar = alfaMinuscula.substring(cifradoIndiceImpar) + alfaMinuscula.substring(0, cifradoIndiceImpar);
                  this.alfaMayusCerraduraPar = alfaMayuscula.substring(cifradoIndicePar) + alfaMayuscula.substring(0, cifradoIndicePar);
                  this.alfaMinusCerraduraPar = alfaMinuscula.substring(cifradoIndicePar) + alfaMinuscula.substring(0, cifradoIndicePar);
         }

         public clsEncriptador() {}

         public String configurarLLaveDeAcceso(String llave) {
                 // CREATE AN STRING BUILDER TO CONCATENATE CHARACTERS
      
                  StringBuilder llaveConfigurada = new StringBuilder(llave);
                  for (int i = 0; i < llave.length(); i += 2) {
                           char caracterActual = llave.charAt(i);
                           if ((i % 2 == 0) && (Character.isLowerCase(caracterActual))) {
                                    int indice = alfaMinuscula.indexOf(caracterActual);
                                    if (indice != 0) {
                                             char remplazoCaracter = alfaMinusCerraduraPar.charAt(indice);
                                             llaveConfigurada.setCharAt(i, remplazoCaracter);
                                    }
                           } else if ((i % 2 == 0) && (Character.isUpperCase(caracterActual))) {
                                    int indiceCaracterActual = alfaMayuscula.indexOf(caracterActual);
                                    if (indiceCaracterActual != 0) {
                                             char remplazoCaracter = alfaMayusCerraduraPar.charAt(indiceCaracterActual);
                                             llaveConfigurada.setCharAt(i, remplazoCaracter);
                                    }
                           }
                  }                
                  
                  for (int i = 1; i < llave.length(); i += 2) {
                           char caracterActual = llave.charAt(i);
                           if ((i % 2 != 0) && (Character.isLowerCase(caracterActual))) {
                                    int idx = alfaMinuscula.indexOf(caracterActual);
                                    if (idx != 0) {
                                             char newChar = alfaMinusCerraduraImpar.charAt(idx);
                                             llaveConfigurada.setCharAt(i, newChar);
                                    }
                           } else if ((i % 2 != 0) && (Character.isUpperCase(caracterActual))) {
                                    int indiceCaracterActual = alfaMayuscula.indexOf(caracterActual);

                                    if (indiceCaracterActual != 0) {
                                             char remplazoCaracter = alfaMayusCerraduraImpar.charAt(indiceCaracterActual);
                                             llaveConfigurada.setCharAt(i, remplazoCaracter);
                                    }
                           }
                  }
                  return llaveConfigurada.toString();
         }

         private String decifrador(String llaveAcceso, int cifradoIndiceImpar, int cifradoIndicePar) {
                  clsEncriptador clsE = new clsEncriptador(27 - cifradoIndiceImpar , 27 - cifradoIndicePar );
                  String decifrado = clsE.configurarLLaveDeAcceso(llaveAcceso);
                  return decifrado;
         }
         
          public String ciframeContrasenaTarjeta(){
                   String contrasena = clsH.recibeString("Ingrese la contraseña deseada para su tarjeta");
                   int Par =  dameTokenContrasena(1);
                   int Impar =  dameTokenContrasena(2);
                   clsH.imprimeMensaje("Sus token de acceso A: " + "["+Par+"] " + "y B ["+Impar+"]" + "\nDebe recordar, su contraseña y los tokens de acceso" );
                   clsEncriptador E = new clsEncriptador( Par,  Impar);
                   String cifrada = E.configurarLLaveDeAcceso(contrasena);
                   clsH.imprimeMensaje("Contraseña cifrada  exitosamente\n"+ cifrada);
                   return cifrada;
          } 
          
          
          public boolean validarContrasena(String contrasena, String contrasenaIngresada, int token_par, int token_imp){
                   boolean continuar = false;
                   String decifrada = this.decifrador(contrasena,token_par,token_imp );
                  if (decifrada.equals(contrasenaIngresada)) { 
                           continuar = true;
                 } return continuar;
          }
          
            private int dameTokenContrasena(int num){
                   int token = 0;
                   if(num == 1){
                            token = (int) (Math.random()*(26));                  
                   }else if(num == 2){
                            token = (int) (Math.random()*(26));  
                   }
                     System.out.println( "¡Tokens generados con éxito! ");
                return token;
          } 
         
         
}
