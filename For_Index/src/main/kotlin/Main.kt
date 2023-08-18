import kotlin.properties.Delegates

fun main() {
    var alunos = arrayListOf("João", "Maria", "Fernando", "Ana", "Luiz", "Rafaela")
    for ((index, aluno) in alunos.withIndex()) {
        println("Número ${index+1} - Aluno(a): $aluno")
    }
}