package br.com.financa.categoriatransacao.application.services

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao
import br.com.financa.categoriatransacao.application.exceptions.CategoriaTransacaoNaoEncontradaException
import br.com.financa.categoriatransacao.application.ports.input.ICategoriaTransacaoPortInput
import br.com.financa.categoriatransacao.application.ports.output.ICategoriaTransacaoPortOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoriaTransacaoService @Autowired constructor(private val categoriaTransacaoPortOut: ICategoriaTransacaoPortOutput) :
    ICategoriaTransacaoPortInput {

    override fun consultarCategoriasTransacaoPorNome(usuario: String, nome: String?): List<CategoriaTransacao> {
        val categoriaTransacao = categoriaTransacaoPortOut.consultarCategoriasTransacaoPorNome(nome)

        if (isResultNullOrEmpty(categoriaTransacao))
            throw CategoriaTransacaoNaoEncontradaException()

        return categoriaTransacao!!
    }

    private fun isResultNullOrEmpty(categoriaTransacao: List<CategoriaTransacao>?) =
        categoriaTransacao == null || categoriaTransacao.isEmpty()
}