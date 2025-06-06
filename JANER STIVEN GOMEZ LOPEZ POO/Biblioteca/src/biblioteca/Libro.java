package biblioteca;


public class Libro extends  Publicacion {
    String nombrelibro;
    String autor;
    String referenciaBibliografica;

    public Libro(String nombrelibro, String autor, String referencia_bibliografica, String titulo, String anioPublicacion, String editorial) {
        super(titulo, anioPublicacion, editorial);
        this.nombrelibro = nombrelibro;
        this.autor = autor;
        this.referenciaBibliografica = referencia_bibliografica;
        
    }

    public String getNombrelibro() {
        return nombrelibro;
    }

    public void setNombrelibro(String nombrelibro) {
        this.nombrelibro = nombrelibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getReferencia_bibliografica() {
        return referenciaBibliografica;
    }

    public void setReferencia_bibliografica(String referencia_bibliografica) {
        this.referenciaBibliografica = referencia_bibliografica;
    }

    }