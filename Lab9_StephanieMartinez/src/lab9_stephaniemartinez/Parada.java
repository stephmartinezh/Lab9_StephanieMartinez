package lab9_stephaniemartinez;

public class Parada {

    private String nombre;
    private String distancia;
    private double angulo;
    private double x;
    private double y;

    public Parada(String nombre, String distancia, double angulo, double x, double y) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.angulo = angulo;
        this.x = x;
        this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDistancia() {
        return distancia;
    }

    public void setDistancia(String distancia) {
        this.distancia = distancia;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Parada{" + "nombre=" + nombre + ", distancia=" + distancia + ", angulo=" + angulo + ", x=" + x + ", y=" + y + '}';
    }
    
    
}
