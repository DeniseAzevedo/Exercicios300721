fun main(){
    println("Hello world!")
    println(maiorNumero(1,9,15))
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