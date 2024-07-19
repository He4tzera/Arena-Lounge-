package com.api.arenalounge.services;
import com.api.arenalounge.cliente.DadosCadastroCliente;
import com.api.arenalounge.cliente.Cliente;
import com.api.arenalounge.cliente.ClienteRepository;
import com.api.arenalounge.pedido.*;
import com.api.arenalounge.produto.DadosCadastroProdutos;
import com.api.arenalounge.produto.ProdutoRepository;
import com.api.arenalounge.produto.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cadastroService {
    @Autowired
    private ClienteRepository clienteRepository ;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ItensPedidoRepository itensPedidoRepository;

    public void cadastrarCliente(DadosCadastroCliente dados){
        clienteRepository.save(new Cliente(dados));
    }

    public void cadastrarProduto(DadosCadastroProdutos dados){
       produtoRepository.save(new Produto(dados));
    }

    public void cadastrarPedido(DadosCadastroPedido dados){
        pedidoRepository.save(new Pedido(dados));
    }

}
