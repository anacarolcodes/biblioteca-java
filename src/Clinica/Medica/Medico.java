package Clinica.Medica;

public class Medico {
    private Integer id;
    private String nome;
    private String especialidade;
    private Boolean disponivel;

    public Medico(Integer id, String nome, String especialidade, Boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.disponivel = disponivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
