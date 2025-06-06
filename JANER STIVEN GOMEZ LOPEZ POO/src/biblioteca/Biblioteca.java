package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
 public static void main(String[] args) {
       
    ArrayList<Publicacion> publicaciones = new ArrayList<>();

// Libros
publicaciones.add(new Libro(
    "1984",
    "George Orwell",
    "Orwell, G. (1949)",
    "Distopía",
    "1949",
    "Secker & Warburg"
));

publicaciones.add(new Libro(
    "La tregua",
    "Mario Benedetti",
    "Benedetti, M. (1960)",
    "Novela urbana",
    "1960",
    "Editorial Alfa"
));

publicaciones.add(new Libro(
    "Tokio Blues (Norwegian Wood)",
    "Haruki Murakami",
    "Murakami, H. (1987)",
    "Ficción contemporánea",
    "1987",
    "Kodansha"
));

// Revistas
publicaciones.add(new Revista(
    "Scientific American",
    "Mensual",
    "Estados Unidos",
    "Edición Especial: Inteligencia Artificial",
    "2024",
    "Springer Nature"
));

publicaciones.add(new Revista(
    "Muy Interesante",
    "Mensual",
    "España",
    "Edición de Ciencia y Tecnología",
    "2025",
    "Zinet Media"
));

publicaciones.add(new Revista(
    "The New Yorker",
    "Semanal",
    "Estados Unidos",
    "Edición de Mayo",
    "2025",
    "Condé Nast"
));

    for (Publicacion publicacioness : publicaciones) {
        System.out.println("------ Publicacion ------");
        System.out.println("Título: " + publicacioness.getTitulo());
        System.out.println("Año: " + publicacioness.getAnioPublicacion());
        System.out.println("Editorial: " + publicacioness.getEditorial());
        if (publicacioness instanceof Libro) {
            Libro libro = (Libro) publicacioness;
            System.out.println("Tipo: Libro");
            System.out.println("Nombre: " + libro.getNombrelibro());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Referencia: " + libro.getReferencia_bibliografica());
        } else if (publicacioness instanceof Revista) {
            Revista revista = (Revista) publicacioness;
            System.out.println("Tipo: Revista");
            System.out.println("Nombre: " + revista.getNombreRevista());
            System.out.println("Periodicidad: " + revista.getPeriodicidad());
            System.out.println("País: " + revista.getPais());
        }

        System.out.println("-------------------------");
    }
}
}