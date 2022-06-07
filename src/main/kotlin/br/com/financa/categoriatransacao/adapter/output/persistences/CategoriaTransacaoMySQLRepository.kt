package br.com.financa.categoriatransacao.adapter.output.persistences

import br.com.financa.categoriatransacao.adapter.input.toCategoriaTransacao
import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao
import br.com.financa.categoriatransacao.application.ports.output.ICategoriaTransacaoPortOutput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoriaTransacaoMySQLRepository @Autowired constructor(private val categoriaTransacaoRepository:
                                                               ICategoriaTransacaoJPARepository) : ICategoriaTransacaoPortOutput {

    override fun consultarCategoriasTransacaoPorNome(nome: String?): List<CategoriaTransacao>? {

        val entities = categoriaTransacaoRepository.findByNome(nome)

        return entities.map { it.toCategoriaTransacao() }
    }
}