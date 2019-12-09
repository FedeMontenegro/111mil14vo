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
public class Curso {
    
    private String nombre;
    private Profesor profesor;
    private List <Profesor> suplentes;
    private List <Alumno> alumnos;
    private List <Float> notas;
    private int cupo;
    private String modalidad;

    public Curso(String nombre, Profesor profesor, int cupo, String modalidad) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.cupo = cupo;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void agregarSuplente(Profesor suplente){
    
    }
    /**
     * Este metodo valida la inscripcion de un nuevo alumno, en el caso de que
     * la modalidad seleccionada sea presencial y el cupo de ésta no esté completo,
     * o si la modalidad es virtual.
     * @param alumno el alumno a inscribir
     * @return true en caso de hacer efectiva la inscripcion, y false en caso
     * de que no sea posible la inscripcion.
     */
    public boolean agregarAlumno(Alumno alumno){
        
        if (this.modalidad.equals("Presencial") && alumnos.size()<this.cupo) {
            if (alumno.getLocalidad().equals("Posadas")) {
                alumnos.add(alumno);
                return true;
            }else if (this.modalidad.equals("Virtual")) {
                alumnos.add(alumno);
            }
        }
        return false;
    }
    
    public void setNota(Float nota, int indice){
        
    }
    
    public int getMejorSuplente(List<Profesor>suplentes){
        
        for (int i = 0; i < suplentes.size(); i++) {
            if (profesor.getTelefono()!=null) {
                if (suplentes.get(i).getDistanciaASede()<profesor.getDistanciaASede()) {
                    profesor.setDistanciaASede(suplentes.get(i).getDistanciaASede());
                }else if (suplentes.get(i).getDistanciaASede()==profesor.getDistanciaASede()) {
                    if (suplentes.get(i).getEspecialidades().size()>profesor.getEspecialidades().size()) {
                        profesor.setDistanciaASede(suplentes.get(i).getDistanciaASede());
                    }else{
                        profesor.getDistanciaASede();
                    }
                }
            }
        }
        return profesor.getDistanciaASede();
    }
}
