/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;
import javax.swing.JOptionPane;


public class Categorias {
    
    public static void main(String[] args) {
       
      Lista_Simple_Usuarios lista = new Lista_Simple_Usuarios();
      String nombre_Cat= JOptionPane.showInputDialog(null,"Nombra tu categoría");
      lista.add((String)nombre_Cat);
      
        System.out.println(nombre_Cat);
       
    }
    
}
