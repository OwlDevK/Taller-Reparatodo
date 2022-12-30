
package proyecto_tallerreparatodo.StakeHolder;
import java.util.List;
import proyecto_tallerreparatodo.clsHelper;

/**
 *
 * @author kennethporras
 */
public class clsCajero extends clsEmpleado implements ifzStakeHolder{
   clsHelper clsH = new clsHelper();
    
    private boolean existeBD = false;

    public clsCajero(String cedula, String clave, String nombre, String primerApellido, String segundoApellido) {
        super(cedula, clave, nombre, primerApellido, segundoApellido);
    }

    public clsCajero(String cedula, String clave) {
        super(cedula, clave);
    }

    public clsCajero() {
    }
    
     
    

    @Override
    public void registrar(clsStakeHolder clsSH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(String metodoBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void consultar(String metodoBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(String metodoBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void inactivar(String metodoBusqueda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<clsCajero> crearBaseDatos() {
        if(!existeBD == false){
            return 
        }
    }
    
    
    
    
    
    
}
