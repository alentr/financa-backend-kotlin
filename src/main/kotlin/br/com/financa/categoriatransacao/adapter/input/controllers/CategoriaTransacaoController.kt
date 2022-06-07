package br.com.financa.categoriatransacao.adapter.input.controllers

import br.com.financa.categoriatransacao.adapter.input.controllers.dtos.OutputCategoriaTransacaoDTO
import br.com.financa.categoriatransacao.adapter.output.toOutputCategoriaTransacaoDTO
import br.com.financa.categoriatransacao.application.ports.input.ICategoriaTransacaoPortInput
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@Validated
@RequestMapping("/gerenciamento/categoria-transacao")
class CategoriaTransacaoController @Autowired constructor(private val categoriaTransacaoPortIn: ICategoriaTransacaoPortInput) {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun consultarCategoriasTransacaoPorNome(
        @RequestHeader(value = "usuario", required = true) usuario: String,
        @RequestParam(value = "nome", required = false) nome: String?
    ): ResponseEntity<List<OutputCategoriaTransacaoDTO>> {


        val response =
            categoriaTransacaoPortIn.consultarCategoriasTransacaoPorNome(usuario, nome)

        val responseDTO = response.map { it.toOutputCategoriaTransacaoDTO() }

        return ResponseEntity.ok(responseDTO)
    }

}