package es.davigalo.main;

import es.davigalo.tablero.Tablero;

public class Main {
  public static void main(String[] args) {
    //genero el tablero
    String[][] tablero = Tablero.generarTablero();
    
    Tablero.imprimrTablero(tablero);
    
  }
}
