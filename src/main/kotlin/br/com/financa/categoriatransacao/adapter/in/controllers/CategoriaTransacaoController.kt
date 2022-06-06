package br.com.financa.categoriatransacao.adapter.`in`.controllers

import br.com.financa.adapter.`in`.controller.openapi.api.GerenciamentoApi
import br.com.financa.adapter.`in`.controller.openapi.model.OutputCategoriaTransacaoDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoriaTransacaoController: GerenciamentoApi {

    override fun consultarCategoriasTransacaoPorNome(
        usuario: String?,
        nome: String?
    ): ResponseEntity<MutableList<OutputCategoriaTransacaoDTO>> {
        return super.consultarCategoriasTransacaoPorNome(usuario, nome)
    }
}