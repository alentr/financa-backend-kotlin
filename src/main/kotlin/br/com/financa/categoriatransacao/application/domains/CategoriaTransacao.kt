package br.com.financa.categoriatransacao.application.domains

import java.time.LocalDateTime

class CategoriaTransacao {
    var id: Long? = null

    var nome: String? = null

    var dtAtualizacao: LocalDateTime? = null

    var usuarioCPF: String

    constructor(id: Long?, nome: String?, dtAtualizacao: LocalDateTime?, usuarioCPF: String) {
        this.id = id
        this.nome = nome
        this.dtAtualizacao = dtAtualizacao
        this.usuarioCPF = usuarioCPF
    }
}