package com.api.arenalounge.services;

import com.api.arenalounge.cliente.DadosCadastroCliente;
import com.api.arenalounge.cliente.cliente;
import com.api.arenalounge.cliente.clienteRepository;
import com.api.arenalounge.pedido.pedidoRepository;
import com.api.arenalounge.pedido.DadosCadastroPedidos;
import com.api.arenalounge.pedido.pedido;
import com.api.arenalounge.produto.DadosCadastroProdutos;
import com.api.arenalounge.produto.produtoRepository;
import com.api.arenalounge.produto.produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cadastroService {

    @Autowired
    private clienteRepository clienteRepository ;

    @Autowired
    private produtoRepository produtoRepository;
    @Autowired
    private pedidoRepository pedidoRepository ;

    public void cadastrarCliente(DadosCadastroCliente dados){
        clienteRepository.save(new cliente(dados));
    }

    public void cadastrarProduto(DadosCadastroProdutos dados){
       produtoRepository.save(new produto(dados));
    }

    public void cadastrarPedido(DadosCadastroPedidos dados) {
        pedidoRepository.save(new pedido(dados));

    }
}
