package br.com.fiap.unidades.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity

@Table(name = "TB_2TDSPG_CHEFE", uniqueConstraints = {
        @UniqueConstraint( name = "UK_TB_CHEFE", columnNames = {"USUARIO_CHEFE", "UNIDADE_CHEFE", "FIM_CHEFE"})
})
public class Chefe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CHEFE" )
    @SequenceGenerator(name = "SQ_CHEFE", sequenceName = "SQ_CHEFE", allocationSize = 1)
    @Column(name = "ID_CHEFE")
    private Long id;

    @Column(name = "SUBSTITUTO_CHEFE")
    private Boolean substituto;

    @Column(name = "USUARIO_CHEFE")
    private Usuario usuario;

    @Column(name = "UNIDADE_CHEFE")
    private Unidade unidade;

    @Column(name = "INICIO_CHEFE")
    private LocalDateTime inicio;

    @Column(name = "FIM_CHEFE")
    private LocalDateTime fim;

}
