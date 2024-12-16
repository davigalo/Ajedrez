package Piezas;

public abstract class Pieza {
  
  private boolean estado;
  private boolean color;
  private int posicionFila;
  private int posicionColumna;
  private String nombre;
  
  
  
  public Pieza(,String nombre,boolean estado, boolean color,  int posicionFila,
      int posicionColumna) {
    super();
    this.nombre = nombre;
    this.estado = estado;
    this.color = color;
    this.posicionFila = posicionFila;
    this.posicionColumna = posicionColumna;
  }
  
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
  
  
}
