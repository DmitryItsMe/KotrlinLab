package `5`

fun main() {
    println("Введите число: ")
    var n1 = readln().toInt()
    println("Введите шаг: ")
    val n2 = readln().toInt()

    println(n1)
    for(i in 1 .. 10){
        println(n1 + n2)
        n1 += n2
    }
}