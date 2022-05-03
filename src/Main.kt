fun main() {
    val quadradoJessica = Quadrado()

     quadradoJessica.desenhar()
    quadradoJessica.exibirNumeroLados(4)

    val trianguloJessica = Triangulo()

    val resultadoEquals = trianguloJessica.equals(3)
    println("O resultado do  do método equals é $resultadoEquals")

    trianguloJessica.desenhar()
}
