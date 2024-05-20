/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Daos;

/**
 *
 * @author Usuario
 */
public class Animal {
    
    private String nombre;
    
    private String raza;
    
    private String tipo;
    
    private Dueño dueño;
    
    public Animal(){}

    public Animal(String nombre, String raza, String tipo, Dueño dueño) {
        this.nombre = nombre;
        this.raza = raza;
        this.tipo = tipo;
        this.dueño = dueño;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    
    
    
}
