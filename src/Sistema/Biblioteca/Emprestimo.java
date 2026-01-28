package Sistema.Biblioteca;

import java.text.DateFormat;
import java.time.LocalDate;

public class Emprestimo {
    private Integer id;
    private Livro livro;
    private String nomeCliente;
    private DateFormat dataEmprestimo;
    private DateFormat dataDevolucao;

    public Emprestimo(int i, Livro livro, String nomeCliente, LocalDate now, Object o) {
    }
}
