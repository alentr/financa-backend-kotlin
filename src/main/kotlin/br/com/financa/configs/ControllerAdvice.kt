package br.com.financa.configs

import br.com.financa.categoriatransacao.adapter.input.controllers.dtos.GeneralError
import br.com.financa.categoriatransacao.application.exceptions.CategoriaTransacaoNaoEncontradaException
import org.apache.commons.lang3.exception.ExceptionUtils
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler

@org.springframework.web.bind.annotation.ControllerAdvice
class ControllerAdvice {

    private var httpStatus: HttpStatus? = null

    @ExceptionHandler(CategoriaTransacaoNaoEncontradaException::class)
    fun categoriaTransacaoNaoEncontradaExceptionHandler(
        e: CategoriaTransacaoNaoEncontradaException
    ): ResponseEntity<GeneralError?>? {

        httpStatus = HttpStatus.NOT_FOUND

        val error = GeneralError()

        error.httpCode = httpStatus!!.value()
        error.message = e.message
        error.exception = ExceptionUtils.getStackTrace(e)

        return ResponseEntity.status(httpStatus!!).body<GeneralError?>(error)
    }
}