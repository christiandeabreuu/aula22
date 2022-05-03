package Exercicio02

class Circulo (var raio : Float ): Forma(){

    override fun calcularArea() {
        val area = 3.14f * raio * raio
        println("A área do círculo é de $area")
        println()
    }

    override fun calcularPerimetro() {
        val perimetro = 3.14f * 2.0f * raio
        println(" O perimetro do círculo é de $perimetro")
        println()
    }
}