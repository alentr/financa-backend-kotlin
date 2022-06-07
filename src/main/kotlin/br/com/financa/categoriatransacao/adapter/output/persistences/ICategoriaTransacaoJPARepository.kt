package br.com.financa.categoriatransacao.adapter.output.persistences

import br.com.financa.categoriatransacao.adapter.output.persistences.entities.CategoriaTransacaoEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface ICategoriaTransacaoJPARepository: JpaRepository<CategoriaTransacaoEntity, Long> {

    @Query(
        "SELECT"
        + "  C "
        + "FROM"
        + "  CATEGORIA_TRANSACAO C "
        + "WHERE "
        + "  :nome is null OR C.nome LIKE %:nome%"
    )
    fun findByNome(@Param("nome") nome: String?): List<CategoriaTransacaoEntity>
}