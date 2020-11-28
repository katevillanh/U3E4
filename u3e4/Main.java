
package u3e4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      
      boolean continuar=true;
      int opcion;
      int palabra;
      Random r=new Random();
      Pila pila=new Pila();
      
      Scanner leer =new Scanner(System.in);
      while(continuar){
          System.out.println("--------------------------");
          System.out.println("Menú");
          System.out.println("1.Insertar");
          System.out.println("2.Eliminar");
          System.out.println("3.Mostrar");
          System.out.println("4.Salir");
          opcion=leer.nextInt();
          System.out.println("--------------------------");
          
          switch(opcion){
              case 1:
                  for(int i=1;i<=10;i++){
                  palabra=r.nextInt(10)+1;
                  System.out.println("elemento "+i+" :"+palabra);
                  pila.Empujar(palabra);}
                  break;
              case 2:
                  pila.SacarPila();
                  break;
              case 3:
                  pila.MostrarPila();
                  break;
              case 4:
                  continuar=false;
                  break;
          }
       }
    }   
}
