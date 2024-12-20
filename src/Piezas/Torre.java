package Piezas;

public class Torre extends Pieza {
  
  
  public Torre(String nombre,boolean estado, boolean color, int posicionFila, int posicionColumna) {
    super(nombre,estado, color, posicionFila, posicionColumna);
  }

 

  @Override
  public boolean comprobarMovimiento(int posI, int posJ, String[][] tablero, boolean turno) {
    boolean result = true;
    if (!tablero[posI][posJ].equals("*")) {
      result = false;
    } else if(posI < 0 || posJ < 0 || posI > 7 || posJ > 7) {
      result = false;
    } 
    
    if (posI != this.getPosicionFila() && posJ != this.getPosicionColumna()) {
      result = false;
    }
     
   
    
    return result;
  }
  
}
