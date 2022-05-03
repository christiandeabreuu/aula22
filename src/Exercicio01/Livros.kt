package Exercicio01

class Livros(nome : String, preco: Double, codigoBarras : Int, val autor : String) : ItensLoja(nome, preco, codigoBarras) {

    override fun mostrarDetalhesItem() {
        println("Nome do livro $nome")
        println("Preço do livro $preco")
        println("Autor do livro $autor")
        println("Codigo de barras do livro $codigoBarras")
        println(" ------------ _ --------------")

    }
}