/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil14vo;

/**
 *
 * @author Fede
 */
public class Alumno extends Persona{
    
    
    private String localidad;
    private int anioIngreso;

    public Alumno(String dni, String nombre, String localidad, int anioIngreso) {
        super(dni, nombre);
        this.localidad = localidad;
        this.anioIngreso = anioIngreso;
    }

    public String getLocalidad() {
        return localidad;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    @Override
    public String toString() {
        return "Alumno{" + "localidad=" + localidad + ", anioIngreso=" + anioIngreso + '}';
    }
    
    
    
}
