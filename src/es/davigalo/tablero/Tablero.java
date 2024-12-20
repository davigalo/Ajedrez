package es.davigalo.tablero;

import java.util.ArrayList;
import Piezas.Caballo;
import Piezas.Peon;
import Piezas.Pieza;
import Piezas.Torre;

public class Tablero {

  public static final int NUM_FILAS = 8;
  public static final int NUM_COLUMNAS = 8;

  private String[][] tablero;
  private ArrayList<Pieza> piezasBlancasList;
  private ArrayList<Pieza> piezasNegrasList;

  public Tablero() {
    piezasBlancasList = new ArrayList<Pieza>();
    piezasNegrasList = new ArrayList<Pieza>();
    tablero = new String[NUM_FILAS][NUM_COLUMNAS];
  }

  public void generarTablero() {
    int i, j;

    for (i = 0; i < NUM_FILAS; i++) {
      for (j = 0; j < NUM_COLUMNAS; j++) {
        if (i == 0 && j == 0 || i == 0 && j == NUM_COLUMNAS - 1) {
          tablero[i][j] = "T2";
          Torre torreNegra = new Torre("T2",true,false,i,j);
          piezasNegrasList.add(torreNegra);
        } else if (i == NUM_FILAS - 1 && j == 0 || i == NUM_FILAS - 1 && j == NUM_COLUMNAS - 1) {
          tablero[i][j] = "T1";
          Torre torreBlanca = new Torre("T1",true,true,i,j);
          piezasBlancasList.add(torreBlanca);
        } else if (i == 1) {
          tablero[i][j] = "P2";
          Peon peonNegro = new Peon("P2", true, false, i, j);
          piezasNegrasList.add(peonNegro);
        } else if (i == 6) {
          tablero[i][j] = "P1";
          Peon peonBlanco = new Peon("P1", true, true, i, j);
          this.piezasBlancasList.add(peonBlanco);

        } else if (i == 0 && j == 1 || i == 0 && j == 6) {
          tablero[i][j] = "C2";
          Caballo caballoNegro = new Caballo("C2",true,false,i,j);
          piezasNegrasList.add(caballoNegro);
        } else if (i == NUM_FILAS - 1 && j == 1 || i == NUM_FILAS - 1 && j == 6) {
          tablero[i][j] = "C1";
          Caballo caballoBlanco = new Caballo("C1",true,true,i,j);
          piezasBlancasList.add(caballoBlanco);
        } else if (i == 0 && j == 2 || i == 0 && j == 5) {
          tablero[i][j] = "A2";
        } else if (i == NUM_FILAS - 1 && j == 2 || i == NUM_FILAS - 1 && j == 5) {
          tablero[i][j] = "A1";
        } else if (i == 0 && j == 3) {
          tablero[i][j] = "D2";
        } else if (i == NUM_FILAS - 1 && j == 3) {
          tablero[i][j] = "D1";
        } else if (i == 0 && j == 4) {
          tablero[i][j] = "R2";
        } else if (i == NUM_FILAS - 1 && j == 4) {
          tablero[i][j] = "R1";
        } else {
          tablero[i][j] = "*";
        }
      }
    }
  }

  public void imprimirTablero() {
    int i, j;
    for (i = 0; i < NUM_FILAS; i++) {
      for (j = 0; j < NUM_COLUMNAS; j++) {
        System.out.print("\t" + tablero[i][j]);
      }
      System.out.print("\n");
    }
    System.out.println("\n\n");
  }

  public Pieza elegirPieza(int posicionIpieza, int posicionJpieza, boolean turno) {
    Pieza piezaSolicitada = null;
    ArrayList<Pieza> listaPiezasAbuscar = null;
    // Compruebo si es una ficha negra o blanca
    if (turno == true) {
      listaPiezasAbuscar = piezasBlancasList;
    } else {
      listaPiezasAbuscar = piezasNegrasList;
    }

    // Busco la pieza segun sus coordenadas y en la lista de las piezas blancas
    for (Pieza pieza : listaPiezasAbuscar) {
      if (pieza.getPosicionFila() == posicionIpieza && pieza.getPosicionColumna() == posicionJpieza) {
        piezaSolicitada = pieza;
        break;
      }
    }

    return piezaSolicitada;
  }

  public boolean comprobarMovimiento(Pieza piezaElegida, int movimientoI, int movimientoJ,boolean turno) {
    return piezaElegida.comprobarMovimiento(movimientoI, movimientoJ, tablero,turno);
  }

  public void moverPieza(Pieza piezaAmover, int posicionIpieza, int posicionJpieza) {
    tablero[piezaAmover.getPosicionFila()][piezaAmover.getPosicionColumna()] = "*";
    piezaAmover.moverPieza(posicionIpieza, posicionJpieza, tablero);
  }
}
