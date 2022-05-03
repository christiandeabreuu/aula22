package Exercicio01

class Dvds(nome : String, preco: Double, codigoBarras : Int, val duracao : Int) : ItensLoja (nome, preco, codigoBarras) {

    override fun mostrarDetalhesItem() {
        println("Nome do Dvd $nome")
        println("Preço do Dvd $preco")
        println("Duraçao do Dvd $duracao")
        println("Codigo de barras do Dvd $codigoBarras")
        println(" ------------ _ --------------")

    }


}