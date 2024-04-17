package br.com.fiap.unidades.service;

import br.com.fiap.unidades.dto.request.PessoaRequest;
import br.com.fiap.unidades.dto.request.UsuarioRequest;
import br.com.fiap.unidades.dto.response.PessoaResponse;
import br.com.fiap.unidades.dto.response.UsuarioResponse;
import br.com.fiap.unidades.entity.Pessoa;
import br.com.fiap.unidades.entity.Usuario;
import br.com.fiap.unidades.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UsuarioService {

    @Autowired
    private PessoaRepository repo;

    @Autowired
    private PessoaService pessoaService;

    @Override
    public Usuario toEntity(UsuarioRequest r) {

        if (Objects.isNull( UsuarioRequest.pessoa().id() )) return null;
        var pessoa = UsuarioService.findById( UsuarioRequest.pessoa().id() );
        if (Objects.isNull( pessoa )) return null;

        return Usuario.builder()
                .pessoa( pessoa )
                .build();
    }

    @Override
    public UsuarioResponse toResponse(Usuario e) {
        if (Objects.isNull( Usuario )) return null;
        var pessoa = UsuarioService.toResponse( e.getPessoa() );

        return UsuarioResponse.builder()
                .id( e.getId() )
                .username( e.getUsername() )
                .pessoa( pessoa)
                .build();
    }

    @Override
    public List<Usuario> findAll() {
        return repo.findAll();
    }

    @Override
    public List<Usuario> findAll(Example<Usuario> example) {
        return repo.findAll( example );
    }

    @Override
    public Usuario findById(Long id) {
        return repo.findById( id ).orElse( null );
    }

    @Override
    public Usuario save(Usuario e) {
        return repo.save( e );
    }



}
