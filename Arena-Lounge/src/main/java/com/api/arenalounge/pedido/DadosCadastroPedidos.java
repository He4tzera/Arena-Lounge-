package com.api.arenalounge.pedido;

public record DadosCadastroPedidos(
        Long idCliente,
        Long idItensPedido,
        Double desconto,
        Double valor,
        String formaDePagamento

        ) {
}
