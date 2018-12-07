package lab9_stephaniemartinez;

public class Paradas {

    private String nombre;
    private String distancia;
    private String angulo;
    private int x;
    private int y;

    public Paradas() {
    }

    public Paradas(String nombre, String distancia, String angulo, int x, int y) {
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

    public String getAngulo() {
        return angulo;
    }

    public void setAngulo(String angulo) {
        this.angulo = angulo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Paradas{" + "nombre=" + nombre + ", distancia=" + distancia + ", angulo=" + angulo + ", x=" + x + ", y=" + y + '}';
    }
    
}
