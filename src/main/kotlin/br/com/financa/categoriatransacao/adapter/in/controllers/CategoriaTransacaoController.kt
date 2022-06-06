package br.com.financa.categoriatransacao.adapter.`in`.controllers

import br.com.financa.adapter.`in`.controller.openapi.api.GerenciamentoApi
import br.com.financa.adapter.`in`.controller.openapi.model.OutputCategoriaTransacaoDTO
import br.com.financa.categoriatransacao.application.ports.`in`.ICategoriaTransacaoPortIn
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoriaTransacaoController @Autowired constructor(private val categoriaTransacaoPortIn: ICategoriaTransacaoPortIn) :
    GerenciamentoApi {

    override fun consultarCategoriasTransacaoPorNome(
        usuario: String, nome: String
    ): ResponseEntity<MutableList<OutputCategoriaTransacaoDTO>> {

        categoriaTransacaoPortIn.consultarCategoriasTransacaoPorNome(usuario, nome)

        return super.consultarCategoriasTransacaoPorNome(usuario, nome)
    }
}