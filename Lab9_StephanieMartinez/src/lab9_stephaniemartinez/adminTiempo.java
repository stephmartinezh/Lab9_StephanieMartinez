package lab9_stephaniemartinez;

import javax.swing.JProgressBar;

public class adminTiempo extends Thread {

    private JProgressBar barra;
    private double tiempo;
    private boolean avanzar;
    private boolean vive;

    public adminTiempo(JProgressBar barra, double tiempo) {
        this.barra = barra;
        avanzar = true;
        vive = true;
        this.tiempo = tiempo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public void run() {
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == tiempo) {
                    vive = false;
                }
            }
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {

            }
        }
    }
}
