package practica1.visitante;

public abstract class Equipo{

  private String nombre;

  public Equipo(String nombre){

    this.nombre= nombre; 

  }

  public String nombre(){
    return nombre;
  }

  public abstract double potencia();

  public abstract double precioNeto();

  public abstract void aceptar(VisitanteEquipo ve);

}