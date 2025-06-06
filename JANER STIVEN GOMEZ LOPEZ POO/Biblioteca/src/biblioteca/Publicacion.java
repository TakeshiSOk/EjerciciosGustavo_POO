package biblioteca;


public class Publicacion {
    String titulo;
    String anioPublicacion;
    String editorial;

    public Publicacion(String titulo, String anioPublicacion, String editorial) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
}
