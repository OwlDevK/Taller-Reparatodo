/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.StakeHolder;

import proyecto_tallerreparatodo.CajaFacturacion.clsTarjetaCredito;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public class clsClienteJuridico extends clsCliente {

    clsHelper clsH = new clsHelper();

    private String nombreEmpresa;
    private String cedulaJuridica;
    private clsClienteJuridico[] clienteJBD;

    public clsClienteJuridico() {
    }

    public clsClienteJuridico(String nombreEmpresa, String cedulaJuridica, String email, String telefono, boolean estadoUsuario, clsTarjetaCredito tarjeta, clsVehiculo miVehiculo) {
        super(email, telefono, estadoUsuario, miVehiculo, tarjeta);
        this.nombreEmpresa = nombreEmpresa;
        this.cedulaJuridica = cedulaJuridica;

    }

    public clsClienteJuridico registrarClienteJuridico() {
        return new clsClienteJuridico(
                clsH.recibeString("Nombre de la empresa"),
                clsH.recibeString("Cédula Jurídica: "), clsH.recibeString("Ingrese email: "),
                clsH.recibeString("Ingrese número telefónico: "),
                clsH.devuelveBoolean("Digite \n1. Activar usuario \nO cualquier tecla para desactivar: "),
                tarjeta.registraTarjeta(), miVehiculo.agregarVehiculo());
    }

    ////////         ////////         ////////         ////////         ////////         ////////         ////////
    ////////  MÉTODOS PARA  CONCATENAR PARA CLIENTES  JURÍDICOS 
    public clsClienteJuridico[] concatenadorBaseDatos(clsClienteJuridico[] actualesCJ, clsClienteJuridico[] entrantesCJ) {
        int cant = actualesCJ.length + entrantesCJ.length;
        clsClienteJuridico[] salienteBD = new clsClienteJuridico[cant];
        int indice = 0;
        boolean registrado = false;
        for (clsClienteJuridico clientesActuales : actualesCJ) {
            salienteBD[indice] = clientesActuales;
            indice++;
            clsH.dimeCompletado("¡Clientes actuales trasladados correctamente!\n");
        }
        System.out.println("Valor Indice: " + indice + "Valor Base datos: " + salienteBD.length);
        for (clsClienteJuridico clienteEntrantes : entrantesCJ) {
            salienteBD[indice] = clienteEntrantes;
            indice++;
            registrado = true;
        }
        if (registrado == true) {
            clsH.dimeCompletado("¡Cliente nuevo agregado exitosamente!");
            System.out.println("valor antes de imprimir base datos: " + (indice - 1));
        }
        return salienteBD;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public clsClienteJuridico[] generarBDClienteJuridico(int cant) {
        //int tamano = clsH.recibeInt("Digite la cantidad de personas de la base de datos: ");
        clsClienteJuridico[] clienteJuridico = new clsClienteJuridico[cant];
        return clienteJuridico;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public clsClienteJuridico[] getClienteJBD() {
        return clienteJBD;
    }

    public void setClienteJBD(clsClienteJuridico[] clienteJBD) {
        this.clienteJBD = clienteJBD;
    }

}
