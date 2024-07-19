package com.api.arenalounge.pedido;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedidos")
@Component
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_cliente")
    private Long idCliente;
    private Double desconto;
    private Double valor;
    @OneToMany
    private List<ItensPedido>itensPedidos;
    @Column(name = "formapagamento")
    private String formaPagamento;
    @Column(name = "datavenda")
    private Date dataVenda = new Date();

    public Pedido(DadosCadastroPedido dados) {
        this.idCliente = dados.idCliente();
        this.desconto = dados.desconto();
        this.valor = dados.valor();
        this.formaPagamento = dados.formaPagamento();
        this.itensPedidos = dados.itensPedidos();
    }

}
