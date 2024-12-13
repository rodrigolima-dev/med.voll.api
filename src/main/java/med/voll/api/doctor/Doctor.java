package med.voll.api.doctor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import med.voll.api.address.Address;

@Table(name = "medicos")
@Entity(name= "Medico")
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Doctor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String crm;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Specialty especialidade;

    @Embedded
    @NotNull
    private Address endereco;

    public Doctor() {}

    public Doctor(DoctorRegisterData data) {
        this.nome = data.nome();
        this.email = data.email();
        this.crm = data.crm();
        this.telefone = data.telefone();
        this.especialidade = data.especialidade();
        this.endereco = new Address(data.endereco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Specialty getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Specialty especialidade) {
        this.especialidade = especialidade;
    }

    public @NotNull Address getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull Address endereco) {
        this.endereco = endereco;
    }
}
