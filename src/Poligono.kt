abstract class Poligono {
    abstract fun desenhar()

    open fun exibirNumeroLados(numeroLados:Int){
        println("A quantidade de lados é $numeroLados")
    }
}