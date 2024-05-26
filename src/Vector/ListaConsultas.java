/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;


import Daos.Consultas;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaConsultas {
    
    public static ArrayList<Consultas> consulta =  new ArrayList<Consultas>();
    
  
    public void agregarDueño(Consultas consulta){
        ListaConsultas.consulta.add(consulta);
    }
    
    public static void eliminarDueño(String cedula){
        for(Consultas d : consulta){
            if(d.getCedula().equals(cedula)){
                ListaConsultas.consulta.remove(d);
                break;
            }
        }
    }
    
    public static void actualizarDueño(Consultas consulta){
        for(int i=0; i<=ListaConsultas.consulta.size(); i++){
            if(ListaConsultas.consulta.get(i).getCedula().equals(consulta.getCedula())){
                ListaConsultas.consulta.set(i, consulta);
                break;
            }
        }
    }

    public static ArrayList<Consultas> getConsultas() {
        return consulta;
    }
    
}
