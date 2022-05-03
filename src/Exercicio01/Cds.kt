package Exercicio01

class Cds (nome: String, preco : Double, codigoBarras : Int,  val numeroFaixas : Int): ItensLoja( nome, preco, codigoBarras){

    override fun mostrarDetalhesItem() {
        println("Nome Cd: $nome")
        println("Preço Cd: $preco")
        println("Numero de faixas Cd: $numeroFaixas")
        println("Codigo de barras do CD $codigoBarras")
        println(" ------------ _ --------------")
    }


}