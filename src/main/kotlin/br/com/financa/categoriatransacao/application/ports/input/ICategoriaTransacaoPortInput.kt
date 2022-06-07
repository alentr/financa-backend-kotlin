package br.com.financa.categoriatransacao.application.ports.input

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao

interface ICategoriaTransacaoPortInput {

    fun consultarCategoriasTransacaoPorNome(usuario: String, nome: String?): List<CategoriaTransacao>
}