package br.com.fiap.unidades.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "TB_USUARIO", uniqueConstraints = {
        @UniqueConstraint( name = "UK_TB_USUARIO_USERNAME", columnNames = "USERNAME_USUARIO"),
        @UniqueConstraint( name = "UK_TB_USUARIO_PESSOA", columnNames = "PESSOA_USUARIO")
})
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USUARIO")
    @SequenceGenerator(name = "SQ_USUARIO", sequenceName = "SQ_USUARIO", allocationSize = 1)
    @Column(name = "ID_USUARIO")
    private Long id;

    @Column(name = "USERNAME_USUARIO")
    private String username;

    @Column(name = "PASSWORD_USUARIO")
    private String password;

    @Column(name = "PESSOA_USUARIO")
    private Pessoa pessoa;

}
