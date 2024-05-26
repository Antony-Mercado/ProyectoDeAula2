/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daos;

/**
 *
 * @author camilo.torreso
 */
public class Consultas {
    
    private String nombre;
    
    private String apellido;
    
    private String cedula;
    
    private String direccion; 
    
    private String fecha;
    
    private String telefono;

    
    public Consultas(){}
    
    public Consultas(String nombre, String apellido, String cedula, String direccion, String fecha, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fecha = fecha;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombre;
    }

    public void setNombres(String nombres) {
        this.nombre = nombres;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String correo) {
        this.direccion = direccion;
    }

    public String getFechaNacimiento() {
        return fecha;
    }

    public void setFechaNacimiento(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
}
