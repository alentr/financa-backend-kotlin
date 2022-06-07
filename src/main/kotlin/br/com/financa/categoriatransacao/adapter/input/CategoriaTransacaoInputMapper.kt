package br.com.financa.categoriatransacao.adapter.input

import br.com.financa.categoriatransacao.adapter.output.persistences.entities.CategoriaTransacaoEntity
import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao

fun CategoriaTransacaoEntity.toCategoriaTransacao() =
    CategoriaTransacao(
        id = id,
        nome = nome,
        dtAtualizacao = dtAtualizacao,
        usuarioCPF = usuarioCPF
    )