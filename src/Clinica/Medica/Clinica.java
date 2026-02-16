package Clinica.Medica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clinica {

    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Consulta> consulta = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void adicionarMedico(Medico medico) {
medicos.add(medico);
    }
    public Medico buscarMedicoPorId(Integer idMedico) {
        for (Medico m : medicos) {
            if (m.getId().equals(idMedico)) {
                return m;
            }
        }
        return null; // se não encontrar
    }
public Paciente buscarPacientePorNome(String nome) {
        for (Paciente p : pacientes) {
            if(p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
}
    public boolean listarMedicosDisponiveis(Integer idMedico) {
        for (Medico m : medicos) {
            if (m.getDisponivel() == true) {
                this.medicos.add(m);
                System.out.println("Médico de ID:" + m.getId() + "e de nome" + m.getNome() + "adicionado!");
            }else {
                System.out.println("Médico não encontrado ou indisponível.\n");
            }
              }
        return false;
    }
    public void agendarConsulta(Integer idMedico, String nome, LocalDate now) {
        for (Medico medico : medicos) {
            if (medico.getId() == idMedico && medico.getDisponivel() == true) {
                medico.setDisponivel(true);
                System.out.println("Consulta agendada com " + medico.getNome() + " para " + nome);
                return;

            }
        }
    }

}