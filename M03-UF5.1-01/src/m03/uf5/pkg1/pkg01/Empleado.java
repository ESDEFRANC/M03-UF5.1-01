/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf5.pkg1.pkg01;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Empleado implements Comparable<Empleado>{
    private String dni;
    private String nombre;
    private String apellido;
    private Date fecha;

    public Empleado(String nombre, String apellido,String dni, Date fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + '}';
    }

    @Override
    public int compareTo(Empleado t) {
       if(t.fecha.after(fecha)){
            return 1;
        }else if(t.fecha.before(fecha)){
            return -1;
        }else{
        return 0;
        }
    }

  
    }
    
    
    

