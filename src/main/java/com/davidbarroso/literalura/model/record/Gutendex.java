package com.davidbarroso.literalura.model.record;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Gutendex(
        Integer count,
        String next,
        String previous,
        List<DadosLivro> results
) {
}