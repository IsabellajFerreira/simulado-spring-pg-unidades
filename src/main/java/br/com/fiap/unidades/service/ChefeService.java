package br.com.fiap.unidades.service;

import br.com.fiap.unidades.dto.request.ChefeRequest;
import br.com.fiap.unidades.dto.request.PessoaRequest;
import br.com.fiap.unidades.dto.response.ChefeResponse;
import br.com.fiap.unidades.dto.response.PessoaResponse;
import br.com.fiap.unidades.dto.response.UnidadeResponse;
import br.com.fiap.unidades.dto.response.UsuarioResponse;
import br.com.fiap.unidades.entity.Chefe;
import br.com.fiap.unidades.entity.Pessoa;
import br.com.fiap.unidades.entity.Unidade;
import br.com.fiap.unidades.entity.Usuario;
import br.com.fiap.unidades.repository.ChefeRepository;
import br.com.fiap.unidades.repository.PessoaRepository;
import jakarta.validation.Valid;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import java.time.LocalDateTime;
import java.util.List;

public class ChefeService implements ServiceDTO<Chefe, ChefeResponse, ChefeRequest>{
    @Autowired
    private ChefeRepository repo;

    @Override
    public Chefe toEntity(ChefeRequest r) {

        return Chefe.builder()
                .substituto( r.substituto())
                .usuario( r.usuario())
                .unidade( r.unidade())
                .inicio( r.inicio())
                .fim( r.fim())
                .build();
    }

    @Override
    public ChefeResponse toResponse(Chefe e) {

        return ChefeResponse.builder()
                .id( e.getId() )
                .substituto( e.getSubstituto() )
                .usuario( usuarioService.toResponse(e.getUsuario()))
                .unidade( unidadeService.toResponse(e.getUnidade() ))
                .inicio( e.getInicio())
                .fim( e.getFim() )
                .build();

    }

    @Override
    public List<Chefe> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Chefe> findAll(Example<Chefe> example) {
        return repo.findAll( example );
    }

    @Override
    public Chefe findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Chefe save(Chefe e) {
        return repo.save( e );
    }

}
