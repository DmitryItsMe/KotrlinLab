package p2

fun main() {
    val a = true
    val b = false
    val c = false

    println(!a and b)
    println(a or !b)
    println((a and b) or c)
}