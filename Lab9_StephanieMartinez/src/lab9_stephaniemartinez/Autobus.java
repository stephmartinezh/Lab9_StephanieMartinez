package lab9_stephaniemartinez;

import java.util.ArrayList;

public class Autobus {

    private int identificacion;
    private String placa;
    private String color;
    private double velocidad;
    ArrayList<Estudiantes> estudiantes = new ArrayList();

    public Autobus() {
    }

    public Autobus(int identificacion, String placa, String color, double velocidad) {
        this.identificacion = identificacion;
        this.placa = placa;
        this.color = color;
        this.velocidad = velocidad;
    }

    public ArrayList<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Autobus{" + "identificacion=" + identificacion + ", placa=" + placa + ", color=" + color + ", velocidad=" + velocidad + ", estudiantes=" + estudiantes + '}';
    }

}
