package Fruta;

/**
 * Created by JAVI on 14/10/2016.
 */
public class Fruta {
    private int codigoFruta;
    private String nombreFruta;

    public Fruta() {

    }

    public Fruta(int codigoFruta, String nombreFruta) {
        this.codigoFruta = codigoFruta;
        this.nombreFruta = nombreFruta;

            }

    public int getCodigoFruta() {
        return codigoFruta;
    }

    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setCodigoFruta(int codigoFruta) {
        this.codigoFruta = codigoFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "codigoFruta=" + codigoFruta +
                ", nombreFruta='" + nombreFruta + '\'' +
                '}';
    }
}

