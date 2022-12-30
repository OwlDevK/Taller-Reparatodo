/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tallerreparatodo.StakeHolder;

import proyecto_tallerreparatodo.CajaFacturacion.clsTarjetaCredito;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;
import proyecto_tallerreparatodo.clsEncriptador;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author OwlDevK
 */
public class clsClienteFisico extends clsCliente {

    private String nombre;
    private String apellido;
    private String cedulaFisica;
    private static int posicion = 0;

    public clsClienteFisico(String nombre, String apellido, String cedula, String email, String telefono,
            boolean estadoUsuario, clsTarjetaCredito tarjeta, clsVehiculo misVehiculo) {
        super(email, telefono, estadoUsuario, misVehiculo, tarjeta);
        setNombre(nombre);
        setApellido(apellido);
        setCedulaFisica(cedula);
        super.generarID("CL", cedula, posicion);
        posicion++;
        System.out.println("Posicion en : " + posicion);

    }

    public clsClienteFisico() {
    }

    public clsClienteFisico[] generarBDClienteF(int longitud) { // Está inicializada en uno, solamente para poder ingresar al cliente PROTEO que se encuentra en la clase Taller
        clsClienteFisico clienteFisicos[] = new clsClienteFisico[longitud];
        return clienteFisicos;
    }

    public clsClienteFisico registrarClienteFisico() {
        return new clsClienteFisico(
                clsH.recibeString("Nombre del Usuario"), clsH.recibeString("Apellidos: "),
                setCedula(clsH.recibeString("Cédula: ")), clsH.recibeString("Ingrese email: "),
                clsH.recibeString("Ingrese número telefónico: "),
                clsH.devuelveBoolean("Digite \n1. Activar usuario \nO cualquier tecla para desactivar: "),
                super.clsTC.registraTarjeta(), super.clsV.agregarVehiculo());
    }

    ////////         ////////         ////////         ////////         ////////         ////////         ////////
    ////////  MÉTODOS PARA  CONCATENAR PARA CLIENTES FÍSICOS  
    public clsClienteFisico[] concatenadorBaseDatos(clsClienteFisico[] actualesCF, clsClienteFisico[] entrantesCF) {
        int cant = actualesCF.length + entrantesCF.length;
        clsClienteFisico[] salienteBD = new clsClienteFisico[cant];
        int indice = 0;
        boolean registrado = false;
        for (clsClienteFisico clientesActuales : actualesCF) {
            salienteBD[indice] = clientesActuales;
            indice++;
            clsH.dimeCompletado("¡Clientes actuales trasladados correctamente!\n");
        }
        for (clsClienteFisico clienteEntrantes : entrantesCF) {
            salienteBD[indice] = clienteEntrantes;
            indice++;
            registrado = true;
        }
        if (registrado == true) {
            clsH.dimeCompletado("¡Cliente nuevo agregado exitosamente!");
            System.out.println(salienteBD[(indice - 1)].toString());

        }
        return salienteBD;
    }

    public boolean bucarClienteFisico(clsUsuarioID ID, clsClienteFisico[] baseD) {
        for (clsClienteFisico cliente : baseD) {
            if (cliente.getCedulaFisica().equals(ID)) {
                clsH.imprimeMensaje(cliente.toString());
            }
        }
        return true;
    }

    public clsVehiculo solicitaRepacion() {
        return this.miVehiculo;
    }

    @Override
    public String toString() {
        return "Información del Cliente:" + "\n\t—Nombre:" + nombre + "\n\t—Apellido:" + apellido + "\n\t—CédulaFisica:" + cedulaFisica + "\n\t—ID: " + ID
                + "\n\nInformación de Vehiculo: " + "\n\t—Marca: " + super.getMiVehiculo().getMarca() + "\n\t—Placa: " + super.miVehiculo.getPlaca() + "\n\n";
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedulaFisica() {
        return cedulaFisica;
    }

    private void setCedulaFisica(String cedulaFisica) {
        do {
            if (cedulaFisica.length() < 5) {
                cedulaFisica = clsH.recibeString("La cédula: " + cedulaFisica + " no es válida ¡Debe ser mayor a 6 dígitos!");
            } else {
                this.cedulaFisica = cedulaFisica;
            }
        } while (cedulaFisica.length() < 5);

    }

    private String setCedula(String cedulaFisica) {
        String cedula = null;
        do {
            if (cedulaFisica.length() < 5) {
                cedula = clsH.recibeString("La cédula: " + cedulaFisica + " no es válida ¡Debe ser mayor a 6 dígitos!");
            } else {
                cedula = cedulaFisica;
            }
        } while (cedula.length() < 5);
        return cedula;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        clsClienteFisico.posicion = posicion;
    }

}
