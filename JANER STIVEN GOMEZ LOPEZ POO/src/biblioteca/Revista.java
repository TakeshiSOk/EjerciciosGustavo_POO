package biblioteca;


public class Revista extends Publicacion {
    String nombreRevista;
    String periodicidad;
    String pais;

    public Revista(String nombreRevista, String periodicidad, String pais, String titulo, String anioPublicacion, String editorial) {
        super(titulo, anioPublicacion, editorial);
        this.nombreRevista = nombreRevista;
        this.periodicidad = periodicidad;
        this.pais = pais;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}