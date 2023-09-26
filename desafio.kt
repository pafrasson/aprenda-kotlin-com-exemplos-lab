// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val nome: String,val email: String,val dataRegistro: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    
    val usuario1 = Usuario("João", "joao@example.com", "2023-09-20")
    val usuario2 = Usuario("Maria", "maria@example.com", "2023-09-21")

    
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120, Nivel.INTERMEDIARIO)

    
    val formacao = Formacao("Curso de Desenvolvimento", mutableListOf(conteudo1, conteudo2))

    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    
    println("Formação: ${formacao.nome}")
    println("Conteúdos:")
    for (conteudo in formacao.conteudos) {
        println("- ${conteudo.nome} (Nível: ${conteudo.nivel})")
    }

    println("Inscritos na formação:")
    for (inscrito in formacao.inscritos) {
        println("- ${inscrito.nome}")
    }
}