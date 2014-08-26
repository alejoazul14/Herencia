/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia;

/**
 *
 * @author Lavendaño
 */
public class Estudiante extends Persona {
    
  String Promedio;

    public Estudiante(String Promedio, String Nombre, String Cedula, String edad) {
        super(Nombre, Cedula, edad);
        this.Promedio = Promedio;
    }
    

    public String getPromedio() {
        return Promedio;
    }

    public void setPromedio(String Promedio) {
        this.Promedio = Promedio;
    }
    
    
}
