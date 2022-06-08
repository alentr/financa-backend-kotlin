package br.com.financa.categoriatransacao.adapter.output.persistences

import br.com.financa.categoriatransacao.adapter.output.persistences.entities.CategoriaTransacaoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ICategoriaTransacaoJPARepository: JpaRepository<CategoriaTransacaoEntity, Long> {
    fun findByNomeContaining(@Param("nome") nome: String?): List<CategoriaTransacaoEntity>
}