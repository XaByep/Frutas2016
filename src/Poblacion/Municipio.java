package Poblacion;

/**
 * Created by JAVI on 21/10/2016.
 */
public class Municipio {
    private String nombreMunicipio;
    private String codigoPostal;
    private String nombreProvincia;

    public Municipio() {
    }

    public Municipio(String nombreMunicipio, String codigoPostal, String nombreProvincia) {
        this.nombreMunicipio = nombreMunicipio;
        this.codigoPostal = codigoPostal;
        this.nombreProvincia = nombreProvincia;
    }


    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    @Override
    public String toString() {
        return codigoPostal+" - "+nombreMunicipio;
    }
}
