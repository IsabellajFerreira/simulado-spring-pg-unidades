package br.com.fiap.unidades.dto.request;

import br.com.fiap.unidades.entity.Tipo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public record PessoaRequest(


        @NotNull(message = "O nome é obrigatório!")
        String nome,

        @NotNull(message = "O sobrenome é obrigatório!")
        String sobrenome,

        @Email(message = "Email inválido!")
        @NotNull(message = "Email é obrigatório!")
        String email,

        @PastOrPresent(message = "Data inválida, datas somente anteriores")
        @NotNull(message = "A data é obrigatório!")
        LocalDate nascimento,


        @Valid
        @NotNull(message = "O tipo é obrigatório!")
        Tipo tipo


) {
}
