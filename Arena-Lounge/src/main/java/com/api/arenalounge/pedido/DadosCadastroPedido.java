package com.api.arenalounge.pedido;


import java.util.List;

public record DadosCadastroPedido(Long idCliente,
                                  Double desconto,
                                  List<ItensPedido> itensPedidos,
                                  Double valor,
                                  String formaPagamento) {

}

