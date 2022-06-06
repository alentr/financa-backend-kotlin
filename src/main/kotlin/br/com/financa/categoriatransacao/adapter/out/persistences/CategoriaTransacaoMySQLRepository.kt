package br.com.financa.categoriatransacao.adapter.out.persistences

import br.com.financa.categoriatransacao.application.domains.CategoriaTransacao
import br.com.financa.categoriatransacao.application.ports.out.ICategoriaTransacaoPortOut
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class CategoriaTransacaoMySQLRepository: ICategoriaTransacaoPortOut {

    override fun consultarCategoriasTransacaoPorNome(nome: String?): List<CategoriaTransacao>? {
        //TODO("Not yet implemented")

        return listOf(CategoriaTransacao(1, "Alimentação", LocalDateTime.now(), "84457288063"))
    }
}