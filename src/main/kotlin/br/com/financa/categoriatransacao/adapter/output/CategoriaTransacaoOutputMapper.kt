package br.com.financa.categoriatransacao.adapter.output

import br.com.financa.categoriatransacao.adapter.input.controllers.dtos.OutputCategoriaTransacaoDTO
import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao

fun CategoriaTransacao.toOutputCategoriaTransacaoDTO() =
    OutputCategoriaTransacaoDTO(
        id = id,
        nome = nome,
        dtAtualizacao = dtAtualizacao)