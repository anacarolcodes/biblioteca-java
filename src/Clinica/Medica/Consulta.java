package Clinica.Medica;

import java.time.LocalDate;

public class Consulta {
    private Integer id;
    private Paciente paciente;
    private Medico medico;
    private LocalDate dataConsulta;
    private Boolean status;

    public Consulta(Integer id, Paciente paciente, Medico medico, LocalDate dataConsulta, Boolean status) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.dataConsulta = dataConsulta;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
