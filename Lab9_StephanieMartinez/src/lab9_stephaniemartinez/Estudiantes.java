package lab9_stephaniemartinez;

public class Estudiantes {

    private String nombre;
    private int edad;
    private String cuenta;
    private String parada;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, int edad, String cuenta, String parada) {
        this.nombre = nombre;
        this.edad = edad;
        this.cuenta = cuenta;
        this.parada = parada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getParada() {
        return parada;
    }

    public void setParada(String parada) {
        this.parada = parada;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", edad=" + edad + ", cuenta=" + cuenta + ", parada=" + parada + '}';
    }

}
