
package proyecto_tallerreparatodo.StakeHolder;

import proyecto_tallerreparatodo.CajaFacturacion.clsTarjetaCredito;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public abstract class clsCliente  {
         clsHelper clsH = new clsHelper();
         clsUsuarioID clsGID= new clsUsuarioID();
         clsTarjetaCredito clsTC = new clsTarjetaCredito();
         clsVehiculo clsV = new clsVehiculo();
         
         protected String email;
         protected String telefono;        
         protected boolean estadoUsuario;
         protected clsVehiculo miVehiculo;
         protected clsTarjetaCredito tarjeta;     
         protected clsUsuarioID ID;
         private int numUsuario;

         public clsCliente(String email, String telefono, boolean estadoUsuario, clsVehiculo miVehiculo, clsTarjetaCredito tarjeta) {
                  setEmail(email);
                  setTelefono(telefono);
                  setEstadoUsuario(estadoUsuario);
                  setMiVehiculo(miVehiculo);
                  setTarjeta(tarjeta);
         }
         
         public void generarID( String cabeza, String ced, int pos){              
                  setID(clsGID.dameID(cabeza, ced, pos));      
         }
                  
          public clsCliente(){}
          

         public String getEmail() {
                  return email;
         }

         private void setEmail(String email) {
                           this.email = email;
            
         }

         public String getTelefono() {
                  return telefono;
         }

         private void setTelefono(String telefono) {
                            this.telefono = telefono;      
         }

         public   boolean  getEstadoUsuario() {
                  return this.estadoUsuario;
         }
         

         private void setEstadoUsuario(boolean estadoUsuario) {
                  if(estadoUsuario){
                             this.estadoUsuario = estadoUsuario;
                  }                           
         }
         
           public void getEstadoUsuario(boolean estadoUsuario) {
                  if(estadoUsuario){
                             this.estadoUsuario = estadoUsuario;
                  }
                           
         }
         
           public clsVehiculo getMiVehiculo(){
                    return this.miVehiculo;
           }
         

         /*
         public clsVehiculo escogerVehiculos() {
                  int esteV;
                  for (int i = 0; i < this.misVehiculos.length; i++) {
                           System.out.println("#" + (1 + i) + " " + misVehiculos.toString());
                           miVehiculo = misVehiculos[i];
                  }
                  return miVehiculo[clsH.recibeInt("Escoja el vehículo")];
         } */

         private void setMiVehiculo(clsVehiculo miVehiculo) {
                             this.miVehiculo = miVehiculo; 
         }
          
         public clsTarjetaCredito getTarjeta() {
                  return tarjeta;
         }

         public void setTarjeta(clsTarjetaCredito tarjeta) {
                           this.tarjeta = tarjeta;
                  
         }

         public String getID() {
                  return this.ID.toString();
         }

         private void setID(clsUsuarioID ID) {
                  this.ID = ID;
         }
         
         

         public int getNumUsuario() {
                  return numUsuario;
         }

         public void setNumUsuario(int numUsuario) {
                  this.numUsuario = numUsuario;
         }           
         
}
