package com.api.arenalounge.produto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroProdutos(
        @Valid
        @NotBlank
        String descricao,
        @NotNull
        Double valor
) {
}
