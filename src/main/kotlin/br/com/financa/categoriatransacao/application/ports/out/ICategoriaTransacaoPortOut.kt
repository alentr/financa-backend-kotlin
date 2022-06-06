package br.com.financa.categoriatransacao.application.ports.out

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao

interface ICategoriaTransacaoPortOut {

    fun consultarCategoriasTransacaoPorNome(nome: String?): List<CategoriaTransacao>?
}