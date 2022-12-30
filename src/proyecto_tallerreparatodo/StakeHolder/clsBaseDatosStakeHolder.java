
package proyecto_tallerreparatodo.StakeHolder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kennethporras
 */
public class clsBaseDatosStakeHolder {
    
    public List<clsStakeHolder> listaStakeHolder;
    public List<clsStakeHolder> listaClientesFisicos;
    public List<clsStakeHolder> listaClientesJuridicos = new ArrayList<>();
    public List<clsStakeHolder> listaCajeros = new ArrayList<>();
    public List<clsStakeHolder> listaMecanicos = new ArrayList<>();
    
    public void crearBaseDatos(){
        this.listaStakeHolder = new ArrayList<>();
    }
    
    public void registrarUsuario(clsStakeHolder clsSH){
        listaStakeHolder.add(clsSH);
    }
    
    public void eliminarUsuario(){       
    }
    
    public void actualizarDatosUsuario(){
    }
    
    
    
    
}
