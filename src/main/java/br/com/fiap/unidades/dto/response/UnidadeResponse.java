package br.com.fiap.unidades.dto.response;


import br.com.fiap.unidades.entity.Unidade;
import jakarta.persistence.Column;
import lombok.Builder;

@Builder
public record UnidadeResponse(

        Long id,


        String nome,

        String sigla,

        String descricao,

       UnidadeResponse macro



) {
}
