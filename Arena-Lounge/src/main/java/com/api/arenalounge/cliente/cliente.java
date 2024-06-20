package com.api.arenalounge.cliente;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Clientes")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private String nome;
    private String cpf;
    private String telefone;
    @Column(name = "datacadastro")
    private Date   dataCadastro;

    public cliente( DadosCadastroCliente dados) {
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.telefone = dados.telefone();
        this.dataCadastro = new Date();
    }
}
