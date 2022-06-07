package br.com.financa.categoriatransacao.application.ports.output

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao

interface ICategoriaTransacaoPortOutput {

    fun consultarCategoriasTransacaoPorNome(nome: String?): List<CategoriaTransacao>?
}