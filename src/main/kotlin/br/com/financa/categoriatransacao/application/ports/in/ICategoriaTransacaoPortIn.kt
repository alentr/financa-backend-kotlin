package br.com.financa.categoriatransacao.application.ports.`in`

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao

interface ICategoriaTransacaoPortIn {

    fun consultarCategoriasTransacaoPorNome(usuario: String, nome: String): List<CategoriaTransacao>
}