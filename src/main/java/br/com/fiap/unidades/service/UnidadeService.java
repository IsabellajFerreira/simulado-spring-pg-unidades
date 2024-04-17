package br.com.fiap.unidades.service;

import br.com.fiap.unidades.dto.request.PessoaRequest;
import br.com.fiap.unidades.dto.request.UnidadeRequest;
import br.com.fiap.unidades.dto.response.PessoaResponse;
import br.com.fiap.unidades.dto.response.UnidadeResponse;
import br.com.fiap.unidades.dto.response.UsuarioResponse;
import br.com.fiap.unidades.entity.Pessoa;
import br.com.fiap.unidades.entity.Unidade;
import br.com.fiap.unidades.entity.Usuario;
import br.com.fiap.unidades.repository.PessoaRepository;
import br.com.fiap.unidades.repository.UnidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.util.List;

public class UnidadeService {


    @Autowired
    private UnidadeRepository repo;

    @Override
    public Unidade toEntity(UnidadeRequest r) {

        return Unidade.builder()
                .nome( r.nome() )
                .sigla( r.sigla() )
                .descricao( r.descricao() )
                .build();
    }

    UnidadeResponse macro
    @Override
    public UnidadeResponse toResponse(Unidade e) {

        return UnidadeResponse.builder()
                .id( e.getId() )
                .nome( e.getNome() )
                .sigla( e.getSigla())
                .descricao( e.getDescricao() )
                .macro(e.getMacro())
                .build();
    }

    @Override
    public List<Unidade> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Unidade> findAll(Example<Pessoa> example) {
        return repo.findAll( example );
    }

    @Override
    public Unidade findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Unidade save(Unidade e) {
        return repo.save( e );
    }

}
