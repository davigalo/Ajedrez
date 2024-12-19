package Piezas;

public class Peon extends Pieza {

  public Peon(String nombre, boolean estado, boolean color, int posicionFila, int posicionColumna) {
    super(nombre, estado, color, posicionFila, posicionColumna);
  }

  @Override
  public void moverPieza(int posicionFilaSolicitada, int posicionColumnaSolicitada, String[][] tablero) {
     tablero[posicionFilaSolicitada][posicionColumnaSolicitada] = this.getNombre();
       
     }
  
  @Override
  public boolean comprobarMovimiento(int posI,int posJ,String[][] tablero) {
    boolean result;
    if (!tablero[posI][posJ].equals("*")) {
      result = false;
    } else if(posI < 0 || posJ < 0 || posI > 7 || posJ > 7) {
      result = false;
    } else if(posI != this.getPosicionFila()-1 || posJ != this.getPosicionColumna()) {
      result = false;
    }
     
    else {
      result = true;
    }
    
    return result;
  }
  
}
