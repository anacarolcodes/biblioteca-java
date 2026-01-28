package Sistema.Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void realizarEmprestimo(int idLivro, String nomeCliente) {
        for (Livro livro : livros) {
            if (livro.getId() == idLivro && livro.isDisponivel()) {
                livro.setDisponivel(false);
                Emprestimo emprestimo = new Emprestimo(
                        emprestimos.size() + 1,
                        livro,
                        nomeCliente,
                        LocalDate.now(),
                        null
                );
                emprestimos.add(emprestimo);
                System.out.println("Empréstimo realizado com sucesso!");
                return;
            }
        }
        System.out.println("Livro não disponível ou não encontrado.");
    }

    public List<Livro> getLivrosDisponiveis() {
        return livros.stream()
                .filter(Livro::isDisponivel)
                .collect(Collectors.toList());
    }
}

