package com.api.arenalounge.Itens;
import com.api.arenalounge.produto.produto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ItensPedido")
public class ItensPedido {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @JoinColumn(name = "idProduto")
    @ManyToOne
    private produto produto;

}
