import Sistema.Biblioteca.Autor;
import Sistema.Biblioteca.Biblioteca;
import Sistema.Biblioteca.Livro;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        LocalDate data = LocalDate.now();
        //cadastrar livros e autores
        Autor autor1 = new Autor(1234, "Machado de Assis",  LocalDate.of(2026, 1, 28));
        Autor autor2 = new Autor(5678, "Brené Brown", LocalDate.of(1965, 2, 24));

        Livro livro1 = new Livro(1, "Coraline the secret world", autor1, true, LocalDate.now());
        Livro livro2 = new Livro(2, "A coragem de ser imperfeito", autor2, false, LocalDate.now());

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

            System.out.println("Digit o ID do livro que deseja reservar: ");
            int idLivro = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite seu nome: ");
            String nomeCliente = sc.nextLine();

        biblioteca.realizarEmprestimo(idLivro, nomeCliente);
    }
}
