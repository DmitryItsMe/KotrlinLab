package `5`

fun main() {
    println("Введите число: ")
    val n = readln().toInt()
    var a1 = 1
    var a2 = 1
    var a3 = 1
    var i = 0
    while(i < n - 2){
        a3 = a1 + a2
        a1 = a2
        a2 = a3
        i++
    }
    println(a2)
}