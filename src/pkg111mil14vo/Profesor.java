/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg111mil14vo;

import java.util.List;

/**
 *
 * @author Fede
 */
public class Profesor extends Persona {
    
    private List <String> especialidades;
    private int distanciaASede;
    private String telefono;

    public Profesor(String dni, String nombre,int distanciaASede, String telefono) {
        super(dni, nombre);
        this.distanciaASede = distanciaASede;
        this.telefono = telefono;
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

    public int getDistanciaASede() {
        return distanciaASede;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public void addEspecialidad(String especialidad){
    }

    @Override
    public String toString() {
        return "Profesor{ dni"+ super.getDni() + "Nombre=" + super.getNombre() + "especialidades=" + especialidades + ", distanciaASede=" + distanciaASede + ", telefono=" + telefono + '}';
    }
    
    /**/

    public void setDistanciaASede(int distanciaASede) {
        this.distanciaASede = distanciaASede;
    }
    
        
    }
    
   
