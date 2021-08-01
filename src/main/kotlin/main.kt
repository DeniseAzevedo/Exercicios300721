import kotlin.Array as KotlinArray

fun main(){
    println("Hello world!")
    println()
    println("Maior valor é: " + maiorNumero(1,9,15))
    println()
    println("Textos são iguais? " + compare("Denise", "Denise"))
    println()
    println("Numero é par? " + numeroPar(11))
    println()
    println("Cem primeiros numeros ímpares: " + numerosImpares())
    println()
    println("Cem primeiros numeros pares: " + cemNumPositivo())
}

fun maiorNumero(
    numero1: Int,
    numero2: Int,
    numero3: Int
): Int {
    var maior = numero1
    if(maior < numero2){
        maior = numero2
    }
    if(maior < numero3) {
        maior = numero3
    }
    return maior
}

fun compare(texto1: String, texto2: String): Boolean {
    if(texto1 != texto2) {
        return true
    } else return false
}

fun numeroPar(numero: Int): Boolean {
    if(numero % 2 == 0){
        return true
    } else return false
}

fun numerosImpares(): MutableList<Int> {
    var cemPrimeiros = mutableListOf<Int>()
    var numero = 1
    var i = 0

    while(i < 100) {
        if( (numero % 2) != 0) {
            cemPrimeiros.add(numero)
            i++
        }
        numero += 2
    }
    return cemPrimeiros
}

fun quatroNumeros(numA: Int, numB: Int, numC: Int, numD: Int): Boolean {
    if((numA > numC && numA > numD) || (numB > numC && numB > numD)) {
        return true
    } else return false
}

fun cemNumPositivo(): MutableList<Int> {
    var numPares = mutableListOf<Int>()
    var numero = 0
    var i = 0

    while (i < 100) {
        if ((numero % 2) == 0) {
            numPares.add(numero)
            i++
        }
        numero += 2
    }
    return numPares
}