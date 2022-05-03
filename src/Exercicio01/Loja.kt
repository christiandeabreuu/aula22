package Exercicio01

fun main() {
    val itens: ArrayList<ItensLoja> = ArrayList()

    val cd1 : ItensLoja = Cds("Charlie Brow Jr", 10.0, 123, 12)
    val cd2 : ItensLoja = Cds("Aliados 13", 9.90, 1234, 12)
    val livro1: ItensLoja = Livros("Sapiens", 79.9, 4321, "Harari")
    val livro2: ItensLoja = Livros("Arte da Guerra", 59.9, 432, "Swu tzu")
    val dvd1: ItensLoja = Dvds("Novos Horizontes", 39.9, 314, 120)
    val dvd2: ItensLoja = Dvds("Mundo Bita", 79.9, 4321, 49 )

    itens.add(cd1)
    itens.add(cd2)
    itens.add(livro1)
    itens.add(livro2)
    itens.add(dvd1)
    itens.add(dvd2)

    itens.forEach{
        it.mostrarDetalhesItem()
        val codigoExemplo = 123
        println("Item tem código de barras igual a $codigoExemplo: ${it.equals(codigoExemplo)}")
        println()

    }
}