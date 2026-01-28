package Sistema.Biblioteca;

import java.time.LocalDate;

public class Livro {
    private Integer id;
    private String titulo;
    private Boolean disponivel;
    private LocalDate dataAtualizacao;
    private Autor autor;

    public Livro(Integer id, String titulo,  Autor autor, Boolean disponivel, LocalDate dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = disponivel;
        this.dataAtualizacao = dataAtualizacao;
        this.autor = autor;
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
