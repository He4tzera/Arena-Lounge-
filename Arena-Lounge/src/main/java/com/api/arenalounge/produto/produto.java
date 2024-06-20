package com.api.arenalounge.produto;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "produto")
@Table(name = "produtos")
@Getter
@Setter
@EqualsAndHashCode(of = "idProduto")
@NoArgsConstructor
@AllArgsConstructor
public class produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String descricao;
    private Double valor;
    private Date dataCadastro;


    public produto(DadosCadastroProdutos dados) {

        this.descricao = dados.descricao();
        this.valor = dados.valor();
        this.dataCadastro = new Date();


    }
}
