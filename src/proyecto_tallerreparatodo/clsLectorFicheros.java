package proyecto_tallerreparatodo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author kennethporras
 */
public class clsLectorFicheros {
    

    public void leerFichero() {
        System.out.println("Inicio");
        try {
            FileReader input = new FileReader(
                    "C:/Users/kennethporras/Documents/GitHub/UFidelitas/Ufide_Taller_ReparaTodo/src/proyecto_tallerreparatodo/ejemplo.rtf");
            int c = input.read();
            while (c != -1) {
                c = input.read();
                System.out.println(c);
            }
        } catch (IOException e) {
            System.out.println("Sin archivo");
        }
    }
    
    public static void main(String[] args) {
              
        clsLectorFicheros clsLF = new clsLectorFicheros();
        clsLF.leerFichero();
    }
}
