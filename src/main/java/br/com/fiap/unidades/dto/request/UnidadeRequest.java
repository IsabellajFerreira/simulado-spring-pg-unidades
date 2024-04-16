package br.com.fiap.unidades.dto.request;

import br.com.fiap.unidades.entity.Unidade;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record UnidadeRequest(


        @NotNull(message = "O nome é obrigatório!")
        String nome,

        @NotNull(message = "A sigla é obrigatória!")
       String sigla,

        @NotNull(message = "A descrição é obrigatória!")
        String descricao,

        @Valid
        Unidade macro
) {
}
