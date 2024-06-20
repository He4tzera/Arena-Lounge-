package com.api.arenalounge.pedido;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidos")
@Entity
@EqualsAndHashCode(of = "idPedido")
public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Long idCliente;
    private Long idItensPedido;
    private Double desconto;
    private Double valor;
    private String formaDePagamento;
    private Date dataVenda;

    public pedido(DadosCadastroPedidos dados) {
        this.idCliente = dados.idCliente();
        this.idItensPedido = dados.idItensPedido();
        this.desconto = dados.desconto();
        this.valor = dados.valor();
        this.formaDePagamento = dados.formaDePagamento();
        this.dataVenda = new Date();
    }
}
