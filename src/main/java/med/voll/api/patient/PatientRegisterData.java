package med.voll.api.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.address.AddressData;

public record PatientRegisterData (
        @NotBlank
        String nome,

        @NotBlank @Email
        String email,

        String telefone,

        @NotBlank @Pattern(regexp = "\\d{11}")
        String cpf,

        @NotNull @Valid
        AddressData endereco
){


}
