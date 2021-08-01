fun main(){
    println("Hello world!")
    println("Maior valor é: " + maiorNumero(1,9,15))
    println("Textos são iguais? " + compare("Denise", "Denise"))
    println("Numero é par? " + numeroPar(11))
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
