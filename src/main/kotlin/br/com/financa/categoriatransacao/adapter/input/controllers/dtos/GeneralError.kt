package br.com.financa.categoriatransacao.adapter.input.controllers.dtos

import com.fasterxml.jackson.annotation.JsonProperty

class GeneralError {

    @JsonProperty("http_code")
    var httpCode: Int? = null

    @JsonProperty("message")
    var message: String? = null

    @JsonProperty("exception")
    var exception: String? = null
}