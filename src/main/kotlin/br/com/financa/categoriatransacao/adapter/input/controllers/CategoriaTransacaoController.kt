package br.com.financa.categoriatransacao.adapter.input.controllers

import br.com.financa.Application
import br.com.financa.categoriatransacao.adapter.input.controllers.dtos.OutputCategoriaTransacaoDTO
import br.com.financa.categoriatransacao.application.ports.`in`.ICategoriaTransacaoPortIn
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Validated
@RequestMapping("/financa}")
class CategoriaTransacaoController @Autowired constructor(private val categoriaTransacaoPortIn: ICategoriaTransacaoPortIn) {

    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/gerenciamento/categoria-transacao"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun consultarCategoriasTransacaoPorNome(
        usuario: String, nome: String?
    ): ResponseEntity<List<OutputCategoriaTransacaoDTO>> {


        val consultarCategoriasTransacaoPorNome =
            categoriaTransacaoPortIn.consultarCategoriasTransacaoPorNome(usuario, nome)

        return ResponseEntity.ok(listOf())
    }

}