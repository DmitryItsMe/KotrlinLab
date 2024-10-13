package pt9

fun main(){
    println("Введите сумму в долларах:")
    val s = readln().toInt()
    println("Сумма в рублях: ${s*96}")
}