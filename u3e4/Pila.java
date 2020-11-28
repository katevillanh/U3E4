
package u3e4;

public class Pila {
      NodoPila cima;
      NodoPila cima2;
      NodoPila raiz=null;
    int tamaño;
    int tamaño2;
   
    public void Empujar(int palabra){
        NodoPila nodo=new NodoPila(palabra);
        if(raiz==null){
        nodo.siguiente=cima;
        cima=nodo;
        raiz=nodo;
       
       }else{
         if(raiz.elemento<nodo.elemento){
        //NodoPila nodo=new NodoPila(palabra);
        nodo.siguiente=cima;
        cima=nodo;
        tamaño++;
       }
       if(nodo.elemento<=raiz.elemento){
        NodoPila nodo2=new NodoPila(nodo.elemento);
        nodo2.siguiente2=cima2;
        cima2=nodo2;
        tamaño2++; 
        }
      }
    }
    
    public int SacarPila(){
        /*if(cima==null){
            System.out.println("No hay datos que borrar"); 
        }else{*/
        int auxiliar=cima.elemento;
        cima=cima.siguiente;
        tamaño--;
    //}
        return auxiliar;
        
    }
    
    public void MostrarPila(){
        if(cima==null && cima2==null){
            System.out.println("Las pilas estan vacías"); 
        }else{
        
        NodoPila recorre=cima;
        System.out.println("Pila A");
        while(recorre!=null){
            System.out.print(" "+recorre.elemento);
            recorre=recorre.siguiente;
        }
        NodoPila recorre2=cima2;
        System.out.println(" ");
        System.out.println("Pila B");
        while(recorre2!=null){
            System.out.print(" "+recorre2.elemento);
            recorre2=recorre2.siguiente2;
        }
    System.out.println(" ");
        }
    }
}
