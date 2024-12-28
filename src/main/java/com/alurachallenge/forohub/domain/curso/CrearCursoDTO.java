package com.alurachallenge.forohub.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(@NotBlank String name, @NotNull Categoria categoria) {
}