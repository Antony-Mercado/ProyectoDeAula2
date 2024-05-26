/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;


import Daos.Paciente;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaPacientes {
    
    public static ArrayList<Paciente> paciente =  new ArrayList<Paciente>();
    
  
    public void agregarPaciente(Paciente dueño){
        ListaPacientes.paciente.add(dueño);
    }
    
    public static void eliminarPaciente(String cedula){
        for(Paciente d : paciente){
            if(d.getCodigo().equals(cedula)){
                ListaPacientes.paciente.remove(d);
                break;
            }
        }
    }
    
    public static void actualizarPaciente(Paciente dueño){
        for(int i=0; i<=ListaPacientes.paciente.size(); i++){
            if(ListaPacientes.paciente.get(i).getCodigo().equals(dueño.getCodigo())){
                ListaPacientes.paciente.set(i, dueño);
                break;
            }
        }
    }

    public static ArrayList<Paciente> getPacientes() {
        return paciente;
    }
    
  
    
    
    
}
