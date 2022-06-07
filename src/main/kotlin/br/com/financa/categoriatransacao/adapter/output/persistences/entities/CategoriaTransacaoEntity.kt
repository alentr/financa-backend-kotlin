package br.com.financa.categoriatransacao.adapter.output.persistences.entities

import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import javax.persistence.*

@Entity(name = "CATEGORIA_TRANSACAO")
@Table(name = "CATEGORIA_TRANSACAO")
class CategoriaTransacaoEntity () {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    var id: Long = 0

    @Column(name = "NOME")
    var nome: String = ""

    @Column(name = "USUARIO_CPF")
    var usuarioCPF: String = ""

    @Column(name = "DT_ATUALIZACAO")
    @UpdateTimestamp
    var dtAtualizacao: LocalDateTime = LocalDateTime.now()

    constructor(id: Long, nome: String, usuarioCPF: String, dtAtualizacao: LocalDateTime) : this() {
        this.id = id
        this.nome = nome
        this.usuarioCPF = usuarioCPF
        this.dtAtualizacao = dtAtualizacao
    }
}