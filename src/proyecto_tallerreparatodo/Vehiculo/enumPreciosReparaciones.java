/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package proyecto_tallerreparatodo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author OwlDevK
 */
public enum enumPreciosReparaciones {
         
         REP_1("REPARACIÓN FRENOS ABS", 1815, 1815, 4000),
         REP_2("CAMBIO DE PASTILLAS DE FRENO", 605, 605, 3200),
         REP_3("MOTOR DE ARRANQUE ", 1210, 1815, 3200),
         REP_4("ENCENDIDO", 1210, 1210, 1210),
         REP_5("ALINEACION Y BALANCEO", 605, 605, 1600),
         REP_6("ALARMAS INTEGRALES", 1210, 1.210, 1600),
         REP_7("TESTEO DE COMPUTADORA ABORDO PARA DETECCION DE AVERIAS", 302.50, 302.50, 302.50),
         REP_8("ALTERNADOR", 1210, 1210, 3200),
         REP_9("BOMBA DE COMBUSTIBLE", 1815, 1815, 4000),
         REP_10("BOMBA DE AGUA", 3025, 3025, 4800),
         REP_11("ELECTROVENTILADOR", 1210, 1815, 3200),
         REP_12("CIERRE CENTRALIZADO", 3025, 3025, 3025),
         REP_13("CAMBIO DE CRISTALES", 1815, 605, 1600),
         REP_14("CIRCUITO DE ALIMENTACION ELECTRICO", 3025, 605, 3200),
         REP_15("CIRCUITO DE REFRIGERACION", 605, 605, 1600),
         REP_16("CAUDALIMETRO", 605, 605, 800),
         REP_17("PERDIDA DE ACEITE ", 605, 605, 800),
         REP_18("CAMBIO CORREA DE DISTRIBUCION", 3630, 3.630, 4000),
         REP_19("DIRECCION ASISTIDA", 3025, 3630, 4800),
         REP_20("EMBRAGUE", 4840, 4.840, 9600),
         REP_21("TREN DELANTERO", 3630, 3.630, 6400),
         REP_22("TREN TRASERO", 2420, 2.420, 4800),
         REP_23("REPARACIÓN CAJA MANUAL", 4840, 4.840, 9600),
         REP_24("REPARACIÓN CAJA AUTOMATICA", 7260, 7.260, 14400),
         REP_25("CAMBIO JUNTA TAPA DE CILINDRO", 4840, 4.840, 9600),
         REP_26("CAMBIO O REPARACION RADIADOR", 1210, 1.210, 3200),
         REP_27("REPARACION AIRE ACONDICIONADO", 1210, 1.210, 1600),
         REP_28("REPARACION CALEFACCIÓN", 1210, 1.210, 1600),
         REP_29("CHAPERIA ESTÉTICA DEPENDE LA REPARACIÓN", 1210, 1.210, 1600),
         OP("ListaRep");

        
         private String descripcion;
         private double precioL;
         private double precioM;
         double precioP;
         
         
         private enumPreciosReparaciones(){}
         private enumPreciosReparaciones(String descripcion){ this.descripcion = descripcion;}       
         private enumPreciosReparaciones(String descripcion, double precioL, double precioM, double precioP) {
                  this.descripcion = descripcion;
                  this.precioL = precioL;
                  this.precioM = precioM;
                  this.precioP = precioP;
         }
         

         
        
         public double[] damePrecio(clsVehiculo veh) {
                  double[] prec = new double[veh.getAverias().length];
                  enumPreciosReparaciones[] averias = veh.getAverias();
                  int indice = 0;
                  for (int i = 0; i < prec.length; i++) {
                           prec[i] = devuelvePrecio(veh.getPeso(), averias[i]);
                           System.out.println(String.valueOf(prec[i]));
                  }
                  return prec;
         }

    
         public enumPreciosReparaciones[] selecionaDetallesRep() {
                  int cantRep = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de repraciones requeridas"));
                  enumPreciosReparaciones[] detallesRep = new enumPreciosReparaciones[cantRep];
                  enumPreciosReparaciones[] reparaciones = enumPreciosReparaciones.values();

                  for (int i = 0; i < reparaciones.length; i++) {
                           System.out.println("#" + (i + 1) + " " + reparaciones[i].getDescripcion());
                  }
                  for (int i = 0; i < detallesRep.length; i++) {
                           int numRep = Integer.parseInt(JOptionPane.showInputDialog("Selecciones las reparaciones requeridas de las mostradas en pantalla"));
                           detallesRep[i] = reparaciones[numRep - 1];
                  }
                  System.out.println("Daños Reparados");
                  return detallesRep;
         }

         

        public double devuelvePrecio(char peso, enumPreciosReparaciones rep){
                  double precio = 0;
                  switch (peso) {
                           case 'L':  precio =  rep.precioL; break;
                           case 'M': precio = rep.precioM; break;
                           case 'P': precio = rep.precioP; break;
                  }
                  System.out.println(precio);
                  return precio;
         }          
                 
                 

                 
                 
         public double getPrecioM() {
                  return precioM;
         }

         public void setPrecioM(double precioM) {
                  this.precioM = precioM;
         }

         public double getPrecioP() {
                  return precioP;
         }

         public void setPrecioP(double precioP) {
                  this.precioP = precioP;
         }

         public String getDescripcion() {
                  return descripcion;
         }

         public void setDescripcion(String descripcion) {
                  this.descripcion = descripcion;
         }

         public double getPrecioL() {
                  return precioL;
         }

         public void setPrecioL(double precioL) {
                  this.precioL = precioL;
         }

         public static enumPreciosReparaciones getOP() {
                  return OP;
         }
         

         
                  

       
         
}
