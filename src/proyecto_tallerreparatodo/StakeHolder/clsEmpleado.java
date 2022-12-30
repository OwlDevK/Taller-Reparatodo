package proyecto_tallerreparatodo.StakeHolder;

/**
 *
 * @author kennethporras
 */
public abstract class clsEmpleado extends clsStakeHolder{
    

    protected String cedula;
    protected String clave;

    public clsEmpleado(String cedula, String clave, String nombre, String primerApellido, String segundoApellido) {
        super(nombre, primerApellido, segundoApellido);
        this.cedula = cedula;
        this.clave = clave;
    }

    public clsEmpleado(String cedula, String clave) {
        this.cedula = cedula;
        this.clave = clave;
    }

    public clsEmpleado() {
    }

    
    
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
       
    
}
