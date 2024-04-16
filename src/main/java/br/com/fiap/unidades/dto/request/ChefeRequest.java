package br.com.fiap.unidades.dto.request;

import br.com.fiap.unidades.entity.Unidade;
import br.com.fiap.unidades.entity.Usuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public record ChefeRequest (

        @NotNull(message = "Substituto é obrigatório!")
    Boolean substituto,

    @Valid
    @NotNull(message = "Usuário é obrigatório!")
    Usuario usuario,

    @Valid
    @NotNull(message = "Unidade é obrigatório!")
    Unidade unidade,

    @FutureOrPresent
    LocalDateTime inicio,

    @FutureOrPresent
    LocalDateTime fim
){

}


