package com.api.arenalounge.produto;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity()
@Table(name = "produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String descricao;
    private Double valor;
    @Column(name = "datacadastro")
    private Date dataCadastro;


    public produto(DadosCadastroProdutos dados) {
        this.descricao = dados.descricao();
        this.valor = dados.valor();
        this.dataCadastro = new Date();
    }
}
