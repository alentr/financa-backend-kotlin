package br.com.financa.categoriatransacao.adapter.input.controllers.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

class OutputCategoriaTransacaoDTO {
    @JsonProperty("id")
    var id: Long? = null

    @JsonProperty("nome")
    var nome: String? = null

    @JsonProperty("dt_atualizacao")
    var dtAtualizacao: LocalDateTime? = null

    constructor(id: Long?, nome: String?, dtAtualizacao: LocalDateTime?) {
        this.id = id
        this.nome = nome
        this.dtAtualizacao = dtAtualizacao
    }
}
