package com.api.arenalounge.controller;

import com.api.arenalounge.cliente.DadosCadastroCliente;
import com.api.arenalounge.pedido.DadosCadastroItens;
import com.api.arenalounge.pedido.DadosCadastroPedido;
import com.api.arenalounge.pedido.ItensPedido;
import com.api.arenalounge.produto.DadosCadastroProdutos;
import com.api.arenalounge.services.cadastroService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class cadastroController {

    @Autowired
    private cadastroService service;

    @PostMapping("/cliente")
    @Transactional
    public ResponseEntity<String> cadastrarCliente(@RequestBody @Valid DadosCadastroCliente dados){
        service.cadastrarCliente(dados);
        return ResponseEntity.ok("Cliente Cadastrado com Sucesso !");
    }

    @PostMapping("/produto")
    @Transactional
    public ResponseEntity<String> cadastrarProduto(@RequestBody @Valid DadosCadastroProdutos dados){
        service.cadastrarProduto(dados);
        return ResponseEntity.ok("Produto Cadastrado com Sucesso");
    }

    @PostMapping("/pedido")
    @Transactional
    public ResponseEntity<String> cadastrarPedido(@RequestBody @Valid DadosCadastroPedido dados){
        service.cadastrarPedido(dados);
        return ResponseEntity.ok("Pedido Cadastrado com Sucesso");
    }




}
