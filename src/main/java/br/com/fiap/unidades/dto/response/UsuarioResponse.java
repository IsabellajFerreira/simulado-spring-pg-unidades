package br.com.fiap.unidades.dto.response;

import br.com.fiap.unidades.entity.Pessoa;
import jakarta.persistence.Column;

public record UsuarioResponse(
       Long id,
       String username,
       PessoaResponse pessoa
) {
}
