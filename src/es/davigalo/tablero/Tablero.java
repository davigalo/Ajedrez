package es.davigalo.tablero;

public class Tablero {

  public static final int NUM_FILAS = 8;
  public static final int NUM_COLUMNAS = 8;

  public static String[][] generarTablero() {
    int i, j;
    String[][] tablero = new String[NUM_FILAS][NUM_COLUMNAS];
    for (i = 0; i < NUM_FILAS; i++) {
      for (j = 0; j < NUM_COLUMNAS; j++) {
        if (i == 0 && j == 0 || i == 0 && j == NUM_COLUMNAS-1) {
          tablero[i][j] = " T2 ";
        } else if (i == NUM_FILAS-1 && j == 0 || i == NUM_FILAS-1 && j == NUM_COLUMNAS-1) {
          tablero[i][j] = " T1 ";
        
        }
        else {
        tablero[i][j] = " * ";
        }
        }
    }
    return tablero;
  }

  public static void imprimrTablero(String[][] tablero) {
    int i, j;
    for (i = 0; i < NUM_FILAS; i++) {
      for (j = 0; j < NUM_COLUMNAS; j++) {
        System.out.print(tablero[i][j]);
      }
      System.out.print("\n");
    }

  }



}
