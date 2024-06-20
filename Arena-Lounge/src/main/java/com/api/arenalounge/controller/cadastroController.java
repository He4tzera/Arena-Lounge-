package com.api.arenalounge.controller;

import com.api.arenalounge.cliente.DadosCadastroCliente;
import com.api.arenalounge.pedido.DadosCadastroPedidos;
import com.api.arenalounge.produto.DadosCadastroProdutos;
import com.api.arenalounge.services.cadastroService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
public class cadastroController {

    @Autowired
    private cadastroService service;

    @PostMapping("/cliente")
    @Transactional
    public void cadastrarCliente(@RequestBody @Valid DadosCadastroCliente dados){
        service.cadastrarCliente(dados);
        System.out.println(dados);

    }

    @PostMapping("/produto")
    @Transactional
    public void cadastrarProduto(@RequestBody @Valid DadosCadastroProdutos dados){
        service.cadastrarProduto(dados);
        System.out.println(dados);

    }

    @PostMapping("/pedido")
    @Transactional
    public void cadastrarPedido(@RequestBody @Valid DadosCadastroPedidos dados){
        service.cadastrarPedido(dados);
        System.out.println(dados);

    }

}
