package br.com.financa.categoriatransacao.adapter.input.controllers.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class OutputCategoriaTransacaoDTO(
    @JsonProperty("id")
    val id: Long,

    @JsonProperty("nome")
    val nome: String,

    @JsonProperty("dt_atualizacao")
    val dtAtualizacao: LocalDateTime
)