package Piezas;

public abstract class Pieza {
  
  private boolean estado; //El valor significará que esa pieza ha caído y el true que está en pie
  private boolean color; //El valor False será tomado como color negro y el True como Blanco
  private int posicionFila;
  private int posicionColumna;
  private String nombre;
  
  
  
  public Pieza(String nombre,boolean estado, boolean color,  int posicionFila,
      int posicionColumna) {
    super();
    this.nombre = nombre;
    this.estado = estado;
    this.color = color;
    this.posicionFila = posicionFila;
    this.posicionColumna = posicionColumna;
  }
  
  /*
   * Metodo para mover pieza a lo largo del tablero
   * */
  public  void moverPieza(int posicionFilaSolicitada,int posicionColumnaSolicitada,String[][] tablero) {
    tablero[posicionFilaSolicitada][posicionColumnaSolicitada] = this.getNombre();
    this.setPosicionFila(posicionFilaSolicitada);
    this.setPosicionColumna(posicionColumnaSolicitada);
  }
  
  public abstract boolean comprobarMovimiento(int posI,int posJ,String[][] tablero,boolean turno);
   
  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return this.nombre;
  }
  
  public boolean isEstado() {
    return estado;
  }
  public void setEstado(boolean estado) {
    this.estado = estado;
  }
  public boolean isColor() {
    return color;
  }
  public void setColor(boolean color) {
    this.color = color;
  }
  
  public int getPosicionFila() {
    return posicionFila;
  }
  public void setPosicionFila(int posicionFila) {
    this.posicionFila = posicionFila;
  }
  public int getPosicionColumna() {
    return posicionColumna;
  }
  public void setPosicionColumna(int posicionColumna) {
    this.posicionColumna = posicionColumna;
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pieza pieza = (Pieza) obj;
    
    return nombre.equals(pieza.getNombre()) && posicionFila == pieza.getPosicionFila() && posicionColumna == pieza.getPosicionColumna();
      
  }
  
  @Override
  public String toString() {
    return "Nombre: "+this.nombre+ " posicion I: "+posicionFila+" Posicion J: "+posicionColumna;
  }
}
