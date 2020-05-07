
package modulo_biblioteca;

/**
 *
 * @author karen
 */
public class Lista_Simple_Usuarios extends EstructuraDeDatos{
    
    private  Nodos1 inicio; //cabeza de la lista 
    private  int longitud; //registra el tamanio de la lista
    
    
    public Lista_Simple_Usuarios() {
        this.inicio = null;
        this.longitud = 0;
    }

    
    public boolean vacio(){
        return this.inicio == null;
       
    }
    
    public void add(Object e){
    
       Nodos1 usuario_nuevo = new Nodos1();
       usuario_nuevo.setNodo((String)e);
       
       if(vacio()){
          inicio = usuario_nuevo; //si no hay elementos entoces el nuevo sera el inicial
          
       }else{
          Nodos1 aux = inicio; //asignando a la variable lista simple el inicio 
          
             while(aux.getSiguiente() != null){
              aux = aux.getSiguiente();
          
             }
       
           aux.setSiguiente(usuario_nuevo);   //asignando el valor siguiente al nodo nuevo   
       } 
    
    }   
    
    public void imprimir(){
       
        // Verifica si la lista contiene elementoa.

        for(Nodos1 aux=this.getInicio();aux!=null; aux=aux.getSiguiente()){
           System.out.println( aux.getNodo());
        }   
        

    }
    

    public void delete(Object e){
        inicio = null;
        longitud = 0;
 
     }
    
    
    public Nodos1 getInicio(){
        return inicio;
    }
    
    public void setInicio(Nodos1 inicio){
    
        this.inicio=inicio;
    
    }
          
    
}
