package br.com.financa.categoriatransacao.application.domains

import java.time.LocalDateTime

class CategoriaTransacao {
    private var id: Long? = null

    private var nome: String? = null

    private var dtAtualizacao: LocalDateTime? = null

    private var usuarioCPF: String? = null

    fun CategoriaTransacao(id: Long, nome: String, dtAtualizacao: LocalDateTime?, usuarioCPF: String) {
        this.id = id
        this.nome = nome
        this.dtAtualizacao = dtAtualizacao
        this.usuarioCPF = usuarioCPF
    }

    fun CategoriaTransacao() {}

}