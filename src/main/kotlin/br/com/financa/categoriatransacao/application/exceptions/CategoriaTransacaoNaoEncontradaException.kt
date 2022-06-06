package br.com.financa.categoriatransacao.application.exceptions

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException

class CategoriaTransacaoNaoEncontradaException(message: String?, cause: Throwable?): RuntimeException(message, cause) {

    constructor(): this(NotFoundException())

    constructor(cause: Throwable): this("Categoria da transação não encontrada na base de dados", cause)
}