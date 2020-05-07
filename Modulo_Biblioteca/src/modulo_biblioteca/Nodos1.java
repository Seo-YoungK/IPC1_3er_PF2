/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_biblioteca;

public class Nodos1 {
    
private String nodo; 
private Nodos1 siguiente;


private void  Lista_Simple(){
   this.nodo=null;
   this.siguiente = null;
   
}     

    public String getNodo() {
        return nodo;
    }

    public void setNodo(String nodo) {
        this.nodo = nodo;
    }

    public Nodos1 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodos1 siguiente) {
        this.siguiente = siguiente;
    }


    
}