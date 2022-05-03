package Exercicio01

 abstract class ItensLoja( val nome: String, val preco: Double, val codigoBarras : Int) {
     abstract fun mostrarDetalhesItem()

     override fun equals(other: Any?): Boolean {
         return codigoBarras == other
     }

}