package Exercicio02

open class Retangulo (private val largura : Float ,private val altura : Float): Forma(){
    open val forma = "retângulo"
    override fun calcularArea() {
        val area = largura * largura
        println("A área da $forma é de $area")
        println()
    }

    override fun calcularPerimetro() {
        val perimetro = 2f * ( largura * largura )
        println(" O perimetro do $forma é $perimetro")
    }
}