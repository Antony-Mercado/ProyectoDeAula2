/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daos;

/**
 *
 * @author camilo.torreso
 */
public class Paciente {
    
    private String nombres;
    
    private String apellidos;
    
    private String codigo;
    
    private String correo;            
    
    private String telefono;

    
    public Paciente(){}
    
    public Paciente (String nombres, String apellidos, String codigo, String correo, String clave, String fechaNacimiento, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     
}