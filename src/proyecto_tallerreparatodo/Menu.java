package proyecto_tallerreparatodo;

import java.util.ArrayList;
import java.util.List;
import proyecto_tallerreparatodo.CajaFacturacion.*;
import proyecto_tallerreparatodo.StakeHolder.*;
import proyecto_tallerreparatodo.StakeHolder.enumTipologiaStakeH;
import proyecto_tallerreparatodo.Vehiculo.clsVehiculo;

public class Menu {

    clsHelper clsH = new clsHelper();
    //clsEncriptador clsE = new clsEncriptador();
    clsUsuarioID clsID = new clsUsuarioID();
    clsTaller clsT = new clsTaller();

    List<clsCliente> BD_CFisico = new ArrayList<>();
    List<clsCliente> BD_CJuridico = new ArrayList<>();
    List<clsMecanico> BD_Mecanico = new ArrayList<>();

////////         ////////         ////////         ////////         ////////         ////////         ////////
    ////////  INSTANCIAS DEL STAKE HOLDER
    clsClienteFisico clienteF = new clsClienteFisico();
    clsClienteJuridico clienteJ = new clsClienteJuridico();
    clsMecanico clsM = new clsMecanico();
    clsTarjetaCredito tarjeta = new clsTarjetaCredito();
    clsVehiculo clsV = new clsVehiculo();
    clsCaja clsC = new clsCaja();

    boolean existe = false, realizado = false, enviarAcaja = false, registradoCF = false, registradoCJ = false, isReparado = false;

    public void menuPrincipal() {
        BD_Mecanico.add(clsT.mecanicoMelanie());
        BD_Mecanico.add(clsT.mecanicoFlorDeLiz());
        BD_Mecanico.add(clsT.mecanicoEdwin());
        BD_CFisico.add(clsT.PROTEO());
        BD_CJuridico.add(clsT.PENNY_DREADFUL());

        char menuPrincipal = ' ';
        do {
            menuPrincipal = clsH.recibeString(
                    "Ingrese la opción deseada"
                    + "\n1. Gestionar Clientes"
                    + "\n2. Gestionar Operarios"
                    + "\n3. Gestion de servicios"
                    + "\n4. Caja"
                    + "\n0. Salir").charAt(0);
            switch (menuPrincipal) {

                case '1':
                    int menuClientes = 0;
                    do {
                        menuClientes = clsH.recibeInt(
                                "Ingrese la opción deseada"
                                + "\n1. Registrar clientes físicos"
                                + "\n2. Registrar clientes Jurídicos"
                                + "\n3. Buscar clientes físicos"
                                + "\n4. Buscar clientes jurídicos"
                                + "\n5. Activar o inactivar usuarios"
                                + "\n0. Salir");

                        switch (menuClientes) {

                            case 1 ->
                                BD_CFisico.add(clienteF.registrarClienteFisico());
                            case 2 ->
                                BD_CJuridico.add(clienteJ.registrarClienteJuridico());
                            case 3 -> {
                                int metodoBusquedaCL = (clsH.recibeInt("Digite el método de búsqueda deseado:\n1.Cédula "
                                        + "\n2.Apellidos \n3. Buscar Clientes en estado activo"));
                                switch (metodoBusquedaCL) {
                                    case 1 -> {
                                        if (clsH.recibeString("Ingrese el números de cédula").equals(BD_CFisico.forEach(getCedulaFisica))) {
                                            
                                        }
                                }
                                        

                                }
                            }
                        }
                      case 2 -> {
                                for (clsClienteFisico clienteFisico : clientesFisicosBD) {
                                    if (clienteFisico.getApellido().equals(clsH.recibeString("Ingrese los Apellidos"))) {
                                        clsH.imprimeMensaje(clienteFisico.toString());
                                    }
                                }
                    }
                            case 3 -> {
                                for (clsClienteFisico clienteFisico : clientesFisicosBD) {
                                    if (clienteFisico.getEstadoUsuario()) {
                                        clsH.imprimeMensaje(clienteFisico.toString());
                                    }
                                }
                    }
                            default -> throw new AssertionError();
                        }
                      
                case 4:
                    int metodoBusquedaCJ = (clsH.recibeInt("Digite el método de búsqueda deseado:\n1.Cédula \n2.Apellidos \n3. Buscar Clientes en estado activo"));
                    switch (metodoBusquedaCJ) {
                        case 1:
                            for (clsClienteJuridico clienteJ : clientesJuridicosBD) {
                                if (clienteJ.getCedulaJuridica().equals(clsH.recibeString("Ingrese la cédula"))) {
                                    clsH.imprimeMensaje(clienteJ.toString());
                                }
                            }
                            break;
                        case 2:
                            for (clsClienteJuridico clienteJ : clientesJuridicosBD) {
                                if (clienteJ.getNombreEmpresa().equals(clsH.recibeString("Ingrese el nombre de la empresa"))) {
                                    clsH.imprimeMensaje(clienteJ.toString());
                                }
                            }
                            break;
                        case 3:
                            for (clsClienteJuridico clienteJ : clientesJuridicosBD) {
                                if (clienteJ.getEstadoUsuario()) {
                                    clsH.imprimeMensaje(clienteJ.toString());
                                }
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                case 5:
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }

        } while (menuClientes != 0);

    

case '2':
                    break;

                case '3':
                    String accionC = "S";
                    indiceCliente = -1;
                    existe = false;
                    do {
                        accionC = clsH.recibeString("""
                                                              Ingrese la opcion deseada:
                                                              A. Selección de cliente solicitante
                                                              B. Proseguir a Inspeccion vehicular;                    
                                                              C. Tramitar cobro Reparación
                                                              S. Salir""").substring(0).toUpperCase();

                        switch (accionC) {

                            case "A":
                                String carnet = clsH.recibeString("Ingrese su carnet tal como está en el original: ").toUpperCase();
                                indiceCliente = clsID.convierteID(carnet);
                                int opcion = -1;
                                do {
                                    for (clsClienteFisico clienteFisico : clientesFisicosBD) {
                                        if (clienteFisico.getID().equals(carnet)) {
                                            clsH.imprimeMensaje("Cliente encontrado: \n" + clienteFisico.toString());
                                            existe = true;
                                        }
                                    }
                                    if (existe == false) {
                                        int opcionSeg = -1;
                                        do {
                                            opcion = clsH.recibeInt("No se encontraron coincidencias con el carnet: " + carnet + "\nDigite: \n1. Para intentarlo de nuevo \n0. Para omitir");
                                            if (opcionSeg == 1) {
                                                carnet = clsH.recibeString("Ingrese su carnet tal como está en el original: ");
                                            } else if (opcionSeg == 0) {
                                                break;
                                            }
                                        } while (opcionSeg == -1);
                                    }
                                    clsH.imprimeMensaje("Prosiga con la la opción 'Inspección vehicular'");
                                    opcion = 0;
                                } while (opcion == -1);
                                break;
                            case "B":
                                primerosMecanicos(mecanicosBD);
                                int opcionMec = -1;
                                if (existe) {
                                    clsH.dimeCompletado("Staff");
                                    do {
                                        for (int i = 0; i < mecanicosBD.length; i++) {
                                            System.out.println("\n# " + (i + 1) + ":  " + mecanicosBD[i].toString() + "\n");
                                        }
                                        opcionMec = clsH.recibeInt("Ingrese el número de un mecánicos de los mostrados en pantalla") - 1;
                                    } while (mecanicosBD[opcionMec] == null);

                                    clsH.imprimeMensaje("Serás atendido por :" + mecanicosBD[opcionMec].toString());
                                    isReparado = mecanicosBD[opcionMec].darReparaciones(clientesFisicosBD[indiceCliente].solicitaRepacion());
                                    clientesFisicosBD[indiceCliente].getMiVehiculo().imprimeDetallesReps();
                                }
                                break;
                            case "C":
                                clsCaja cajero = new clsCaja();
                                clsFactura clsF = new clsFactura();
                                if (isReparado) {
                                    clsF = cajero.generarCobro(clientesFisicosBD[indiceCliente].getTarjeta(), clientesFisicosBD[indiceCliente].getMiVehiculo());
                                    clsF.imprimirFactura();
                                } else {
                                    clsH.imprimeMensaje("Aún no se ha reportado ninguna reparación, imposible enviar a caja");
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                    } while (!"S".equals(accionC));

                case '4':
                    break;

                case '0':
                    clsH.imprimeMensaje("Te esperamos pronto");
                    break;
                default:
                    clsH.imprimeMensaje("Seleccion invalida, inténtelo nuevamente");
                    break;

            }
        
    }
    while (menuPrincipal 
!= '0');
    }
}
