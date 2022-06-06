package br.com.financa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinancaBackendKotlinApplication

fun main(args: Array<String>) {
	runApplication<FinancaBackendKotlinApplication>(*args)
}