package br.com.financa.categoriatransacao.adapter.output.persistences.entities

import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "CATEGORIA_TRANSACAO")
@Table(name = "CATEGORIA_TRANSACAO")
data class CategoriaTransacaoEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    val id: Long = 0,

    @Column(name = "NOME")
    val nome: String = "",

    @Column(name = "USUARIO_CPF")
    val usuarioCPF: String = "",

    @Column(name = "DT_ATUALIZACAO")
    @UpdateTimestamp
    val dtAtualizacao: LocalDateTime = LocalDateTime.now()
)