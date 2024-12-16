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
          tablero[i][j] = "T2";
        } else if (i == NUM_FILAS-1 && j == 0 || i == NUM_FILAS-1 && j == NUM_COLUMNAS-1) {
          tablero[i][j] = "T1";
        
        }else if (i == 1) {
          tablero[i][j] = "P2";
        }else if (i == 6) {
          tablero[i][j] = "P1";
        }else if (i == 0 && j == 1 || i == 0 && j == 6) {
          tablero[i][j] = "C2";
        }else if (i == NUM_FILAS-1 && j == 1 || i == NUM_FILAS-1 && j == 6) {
          tablero[i][j] = "C1";
        }else if (i == 0 && j == 2 || i == 0 && j == 5) {
          tablero[i][j] = "A2";
        }else if (i == NUM_FILAS-1 && j == 2 || i == NUM_FILAS-1 && j == 5) {
          tablero[i][j] = "A1";
        }else if (i == 0 && j == 3 ) {
          tablero[i][j] = "D2";
        }else if (i == NUM_FILAS-1 && j == 3) {
          tablero[i][j] = "D1";
        }else if (i == 0 && j == 4 ) {
          tablero[i][j] = "R2";
        }else if (i == NUM_FILAS-1 && j == 4 ) {
          tablero[i][j] = "R1";
        }
        else {
        tablero[i][j] =  "*";
        }
        }
    }
    return tablero;
  }

  public static void imprimrTablero(String[][] tablero) {
    int i, j;
    for (i = 0; i < NUM_FILAS; i++) {
      for (j = 0; j < NUM_COLUMNAS; j++) {
        System.out.print("\t"+tablero[i][j]);
      }
      System.out.print("\n");
    }

  }



}
