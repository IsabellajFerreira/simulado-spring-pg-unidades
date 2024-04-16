package br.com.fiap.unidades.dto.request;

import br.com.fiap.unidades.entity.Pessoa;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record UsuarioRequest(

    @NotNull(message = "O usuário é obrigatória!")
    String username,

    @Pattern(regexp = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,16}")
    @NotNull(message = "A senha é obrigatória!")
    String password,

    @Valid
    @NotNull(message = "A pessoa é obrigatória!")
    Pessoa pessoa
) {
}
