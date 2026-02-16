import Clinica.Medica.Clinica;
import Clinica.Medica.Consulta;
import Clinica.Medica.Medico;
import Clinica.Medica.Paciente;
import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clinica clinica = new Clinica();
//        Medico medico = new Medico();
        LocalDate data = LocalDate.now();

        Medico medico1 = new Medico(1, "Dr. de tal", "Clinico-Geral", true);
        Medico medico2 = new Medico(2, "Dr. beutrano", "Gineco", false);
        Paciente paciente1 = new Paciente(123, "Brené Brown", LocalDate.of(1965, 2, 24));
        Paciente paciente2 = new Paciente(456, "Manu", LocalDate.of(1965, 2, 24));

        clinica.adicionarMedico(medico1);
        clinica.adicionarMedico(medico2);
        clinica.adicionarPaciente(paciente1);
        clinica.adicionarPaciente(paciente2);

        out.println("Para agendar uma consulta deseja ver os médicos disponíveis? [S/N]");
        char resposta = sc.next().charAt(0);
        do {
            out.println("Informe o ID do Médico");
            Integer idMedico = sc.nextInt();
            sc.nextLine();
            String nome = null;
//            if (clinica.listarMedicosDisponiveis(idMedico) == true) {
            out.println("Informe o Nome do paciente");
            nome = sc.nextLine();

            Paciente pacienteEscolhido = clinica.buscarPacientePorNome(nome);
            Medico medicoEscolhido = clinica.buscarMedicoPorId(idMedico);

            if (medicoEscolhido != null) {
                if (medicoEscolhido.getDisponivel()) {
                    out.println("Agora, informe a data da consulta: ");
                    String entrada = sc.nextLine();
                    LocalDate dataPaciente = LocalDate.parse(entrada);
                    clinica.agendarConsulta(idMedico, pacienteEscolhido.getNome(), dataPaciente);
                } else {
                    out.println("Não há horário disponível para o médico\n");
                }
            } else {
                out.println("Médico não encontrado!");
            }
            out.println("Deseja agendar outra consulta? [s/N]");
            resposta = sc.next().charAt(0);
            sc.nextLine(); // limpar buffer

        } while (resposta == 's' || resposta == 'S');
        out.println("Ok! agendamento encerrado.");
    }
}