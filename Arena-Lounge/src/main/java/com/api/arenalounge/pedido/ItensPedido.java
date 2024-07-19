package com.api.arenalounge.pedido;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "itenspedido")
@Entity
public class ItensPedido {
    @Id
    private long id;
    @Column(name = "id_Produto")
    @JoinColumn(name = "id_Produto")
    private long idProduto;
    @Column(name = "id_Pedido")
    @JoinColumn(name = "id_Pedido")
    private long idPedido;
    private double quantidade;
    private double valor;

}
