package es.davigalo.main;

import java.util.Scanner;
import Piezas.Pieza;
import es.davigalo.tablero.Tablero;

public class Main {
  public static void main(String[] args) {
    //creamos un objeto scanner para leer datos del teclado
    Scanner scanner = new Scanner(System.in);
    boolean exitoPiezaElegida = false;
    boolean exitoPiezaMovida = false;
    int posicionI;
    int posicionJ;
    int posicionIdeseada;
    int posicionJdeseada;
    Pieza piezaSolicitada = null;
    //genero el tablero
    Tablero tableroJuego = new Tablero();
    
    tableroJuego.generarTablero();
    
    tableroJuego.imprimirTablero();
    
    //Introduce la pieza que deseas mover
   while (!exitoPiezaElegida) {
    System.out.println("Introduce las coordenadas de la pieza que deseas mover");
     posicionI = scanner.nextInt();
     posicionJ = scanner.nextInt();
    //Movemos un peon blanco, para ello debemos seleccionar 
     piezaSolicitada = tableroJuego.elegirPieza(posicionI,posicionJ);
    if (piezaSolicitada == null) {
      System.out.println("No se puede elegir esa pieza,escoja otra");
      
      
    }else {
      exitoPiezaElegida = true;
    }
   }
    while(!exitoPiezaMovida) {
    System.out.println("Introduce la posicion a la que deseas mover la pieza");
     posicionIdeseada = scanner.nextInt();
     posicionJdeseada = scanner.nextInt();
    
     if (tableroJuego.comprobarMovimiento(piezaSolicitada,posicionIdeseada,posicionJdeseada)) {
       //La pieza se puede mover
       exitoPiezaMovida = true;
       tableroJuego.moverPieza(piezaSolicitada, posicionIdeseada, posicionJdeseada);
       tableroJuego.imprimirTablero();
     }else {
       System.out.print("La pieza no se puede mover a ese lugar, eliga otro lugar");
      
     }
    
    }
   
    scanner.close();
  }
}
