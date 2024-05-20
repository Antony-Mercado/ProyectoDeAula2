/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;


import Daos.Dueño;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListaDueños {
    
    public static ArrayList<Dueño> dueños =  new ArrayList<Dueño>();
    
  
    public void agregarDueño(Dueño dueño){
        ListaDueños.dueños.add(dueño);
    }
    
    public static void eliminarDueño(String cedula){
        for(Dueño d : dueños){
            if(d.getCedula().equals(cedula)){
                ListaDueños.dueños.remove(d);
                break;
            }
        }
    }
    
    public static void actualizarDueño(Dueño dueño){
        for(int i=0; i<=ListaDueños.dueños.size(); i++){
            if(ListaDueños.dueños.get(i).getCedula().equals(dueño.getCedula())){
                ListaDueños.dueños.set(i, dueño);
                break;
            }
        }
    }

    public static ArrayList<Dueño> getDueños() {
        return dueños;
    }
    
    public static Dueño login(String correo, String clave){
        
        for(Dueño d : dueños){
            if(d.getCorreo().equals(correo)){
                if(d.getClave().equals(clave)){
                    //La contraseña y el correo son iguales se envia true
                    return d;
                }else{
                    break;
                }
            }
        }
        
        
        return null;
    }
    
    
    
}
