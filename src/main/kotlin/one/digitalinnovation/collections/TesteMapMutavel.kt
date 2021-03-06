package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 1500.0, "CLT")
    val pedro = Funcionario("Pedro", 2500.0, "PJ")
    val maria = Funcionario("Maria", 2000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))                    // Acrescentando o joao

    println("-------------------")
    repositorio.findAll().forEach{ println(it)}                 // imprimindo todos (findAll)

    println("-------------------")
    repositorio.remove(maria.nome)                     // removendo a Maria
    repositorio.findAll().forEach{ println(it)}
}