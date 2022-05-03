class Quadrado : Poligono(){

    override fun desenhar() {
        println("Override da função desenhar na classe Quadrado!")
    }

    override fun exibirNumeroLados(numeroLados: Int) {
        val somatoriaNumeroLados = numeroLados + 2
        println(" a somatoria dos numeros de lados $numeroLados" +
        " pelo valor 2 da um total de $somatoriaNumeroLados")
    }
}