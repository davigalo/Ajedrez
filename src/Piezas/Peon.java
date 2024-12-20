package Piezas;

public class Peon extends Pieza {

  public Peon(String nombre, boolean estado, boolean color, int posicionFila, int posicionColumna) {
    super(nombre, estado, color, posicionFila, posicionColumna);
  }

  @Override
  public void moverPieza(int posicionFilaSolicitada, int posicionColumnaSolicitada, String[][] tablero) {
     tablero[posicionFilaSolicitada][posicionColumnaSolicitada] = this.getNombre();
     this.setPosicionFila(posicionFilaSolicitada);
     this.setPosicionColumna(posicionColumnaSolicitada);
     }
  
  @Override
  public boolean comprobarMovimiento(int posI,int posJ,String[][] tablero,boolean turno) {
    boolean result = true;
    if (!tablero[posI][posJ].equals("*")) {
      result = false;
    } else if(posI < 0 || posJ < 0 || posI > 7 || posJ > 7) {
      result = false;
    } 
    
    if (turno) {
       if(posI != this.getPosicionFila()-1 || posJ != this.getPosicionColumna()) {
        result = false;
      }
    } else if (!turno) {
      if(posI != this.getPosicionFila()+1 || posJ != this.getPosicionColumna()) {
        result = false;
      }
    }
     
   
    
    return result;
  }
  
}
