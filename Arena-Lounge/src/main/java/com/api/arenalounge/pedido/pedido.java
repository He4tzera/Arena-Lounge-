package com.api.arenalounge.pedido;

import com.api.arenalounge.Itens.ItensPedido;
import com.api.arenalounge.cliente.cliente;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pedidos")
@Entity
public class pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "idCliente")
    @ManyToOne
    private cliente cliente;
    @JoinColumn(name = "idItensPedido")
    @ManyToOne
    private ItensPedido idItensPedido;
    private Double desconto;
    private Double valor;
    private String formaDePagamento;
    private Date dataVenda;

    public pedido(DadosCadastroPedidos dados) {

    }
}
