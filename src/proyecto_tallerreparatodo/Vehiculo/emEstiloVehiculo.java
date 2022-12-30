/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.Vehiculo;
import javax.swing.JOptionPane;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public  enum emEstiloVehiculo {
         
         MiCRO('L'),
         SEDAN('L'),
         HATCHBACK('L'),
         COUPE('M'),
         WAGON('M'),
         ROADSTER('M'),
         CABRIOLET('M'),
         MUSCLE_CAR('M'),
         SPORT_CAR('M'),
         SUPER_CAR('M'),
         LIVIANO('M'),
         LIMOUSINE('M'),
         CUV('M'),
         PICKUP('M'),
         SUV('M'),
         MINIVAN('M'),
         VAN('M'),
         CAMPERVAN('M'),
         BUS('M'),
         MONSTER_TRUC('M'),
         MINITRUCK('M'),
         BIG_TRUCK('P'),
         PESADO('P'),
         NULL(' ');
         
         private char peso;        
         private emEstiloVehiculo(char peso) {
                  this.peso = peso;
         }
                           
         public char damePeso(String estilo) { 
                   int num = 0;
                  char pesoVehiculo = 'N';
                  emEstiloVehiculo[] estilos = emEstiloVehiculo.values();

                  
                  for (int i = 0; i < estilos.length; i++) {
                           if (estilos[i].toString().equalsIgnoreCase(estilo)) {
                                    pesoVehiculo = estilos[i].getPeso();
                           }
                  }        return pesoVehiculo;
         }

         public emEstiloVehiculo dameEstiloVehiculo() {
                     int numEstilo = -1;
                     emEstiloVehiculo[] miEstilo = emEstiloVehiculo.values();
                  do {
                           numEstilo = -1;                         
                           for (int i = 0; i < miEstilo.length; i++) {
                                    System.out.println("#" + (i + 1) + "" + miEstilo[i]);
                           }
                           if(numEstilo < 0 || numEstilo > 23){  
                                    numEstilo = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el número de estilo de su vehículo entre los mostrados en pantalla"));                                    
                           }                        
                  } while ( numEstilo < 0 || numEstilo > 23);
                  return miEstilo[numEstilo - 1];
         }
         
         
         public char getPeso() {
                  return peso;
         }

         public void setPeso(char peso) {
                  this.peso = peso;
         }

         public static emEstiloVehiculo getNULL() {
                  return NULL;
         }

         public static emEstiloVehiculo getMiCRO() {
                  return MiCRO;
         }

         public static emEstiloVehiculo getSEDAN() {
                  return SEDAN;
         }

         public static emEstiloVehiculo getHATCHBACK() {
                  return HATCHBACK;
         }

         public static emEstiloVehiculo getCOUPE() {
                  return COUPE;
         }

         public static emEstiloVehiculo getWAGON() {
                  return WAGON;
         }

         public static emEstiloVehiculo getROADSTER() {
                  return ROADSTER;
         }

         public static emEstiloVehiculo getCABRIOLET() {
                  return CABRIOLET;
         }

         public static emEstiloVehiculo getMUSCLE_CAR() {
                  return MUSCLE_CAR;
         }

         public static emEstiloVehiculo getSPORT_CAR() {
                  return SPORT_CAR;
         }

         public static emEstiloVehiculo getSUPER_CAR() {
                  return SUPER_CAR;
         }

         public static emEstiloVehiculo getLIVIANO() {
                  return LIVIANO;
         }

         public static emEstiloVehiculo getLIMOUSINE() {
                  return LIMOUSINE;
         }

         public static emEstiloVehiculo getCUV() {
                  return CUV;
         }

         public static emEstiloVehiculo getPICKUP() {
                  return PICKUP;
         }

         public static emEstiloVehiculo getSUV() {
                  return SUV;
         }

         public static emEstiloVehiculo getMINIVAN() {
                  return MINIVAN;
         }

         public static emEstiloVehiculo getVAN() {
                  return VAN;
         }

         public static emEstiloVehiculo getCAMPERVAN() {
                  return CAMPERVAN;
         }

         public static emEstiloVehiculo getBUS() {
                  return BUS;
         }

         public static emEstiloVehiculo getMONSTER_TRUC() {
                  return MONSTER_TRUC;
         }

         public static emEstiloVehiculo getMINITRUCK() {
                  return MINITRUCK;
         }

         public static emEstiloVehiculo getBIG_TRUCK() {
                  return BIG_TRUCK;
         }

         public static emEstiloVehiculo getPESADO() {
                  return PESADO;
         }
 
    
}
