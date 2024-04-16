package br.com.fiap.unidades.dto.response;

import br.com.fiap.unidades.entity.Unidade;
import br.com.fiap.unidades.entity.Usuario;
import jakarta.persistence.Column;

import java.time.LocalDateTime;

public record ChefeResponse(


        Long id,

        Boolean substituto,

        UsuarioResponse usuario,

       UnidadeResponse unidade,

        LocalDateTime inicio,

       LocalDateTime fim
) {
}
