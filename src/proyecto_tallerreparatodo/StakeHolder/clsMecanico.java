/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.StakeHolder;

import proyecto_tallerreparatodo.Vehiculo.enumPreciosReparaciones;
import proyecto_tallerreparatodo.clsHelper;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;

/**
 *
 * @author OwlDevK
 */
public class clsMecanico extends clsEmpleado {

    clsHelper clsH = new clsHelper();

    enumPreciosReparaciones MEC = enumPreciosReparaciones.OP;

    public clsMecanico(String nombre, String apellido, String cedula, String clave) {
        super(nombre, apellido, cedula, clave);
    }
    
    public clsMecanico(){
        super();
    }
    
    
    public boolean resgistrarReparaciones(clsVehiculo miVehiculo) {
        miVehiculo.setAverias(MEC.selecionaDetallesRep());
        return true;
    }
    
    

    public clsMecanico[] generarBDMecanico() {
        int tamano = clsH.recibeInt("Digite la cantidad de mecánicos de la base de datos: ");
        clsMecanico clienteFisicos[] = new clsMecanico[tamano];
        return clienteFisicos;
    }



}
