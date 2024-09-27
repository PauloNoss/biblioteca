package Trabalhoo;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> livros;

    public Autor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        livro.adicionarAutor(this); // Relaciona o autor ao livro
    }

    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return nome;
    }
}
