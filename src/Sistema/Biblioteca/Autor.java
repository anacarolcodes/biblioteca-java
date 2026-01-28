package Sistema.Biblioteca;

import java.time.LocalDate;

public class Autor {
    private Integer Id;
    private String nome;
    private LocalDate dataNascimento;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Autor(Integer id, String nome, LocalDate dataNascimento) {
        Id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;

    }
}
