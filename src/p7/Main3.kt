package p7

fun main() {
    println("Введите количество побед:")
    val w = readln().toInt()
    println("Введите количество ничьих:")
    val d = readln().toInt()
    println("Введите количество поражений:")
    val l = readln().toInt()
    println("Количество очков: ${klv(w, d, l)}")
}

fun klv(w: Int, d: Int, l: Int):Int {return w*3 + d}