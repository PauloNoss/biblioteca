package Trabalhoo;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private List<Autor> autores;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.autores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(titulo + " - Autores: ");
        for (Autor autor : autores) {
            sb.append(autor.getNome()).append(", ");
        }
        return sb.substring(0, sb.length() - 2); // Remove a última vírgula
    }
}
