package br.com.financa.categoriatransacao.application.services

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao
import br.com.financa.categoriatransacao.application.ports.`in`.ICategoriaTransacaoPortIn
import org.springframework.stereotype.Service

@Service
class CategoriaTransacaoService: ICategoriaTransacaoPortIn {

    override fun consultarCategoriasTransacaoPorNome(usuario: String, nome: String): List<CategoriaTransacao> {
        return listOf()
    }
}