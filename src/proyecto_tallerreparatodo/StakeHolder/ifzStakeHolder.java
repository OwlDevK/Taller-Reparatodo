
package proyecto_tallerreparatodo.StakeHolder;

import java.util.List;

/**
 *
 * @author kennethporras
 */
public interface ifzStakeHolder {
    
    
    public List<clsStakeHolder> crearBaseDatos();
    public void registrar(clsStakeHolder clsSH);
    public void eliminar(String metodoBusqueda);
    public void consultar(String metodoBusqueda);
    public void actualizar(String metodoBusqueda);
    public void inactivar(String metodoBusqueda);
       
}



